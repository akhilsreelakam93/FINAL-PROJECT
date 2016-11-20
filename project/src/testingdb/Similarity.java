/*
 AKHIL SREELAKAM
 */

package testingdb;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.ParameterBlock;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.media.jai.InterpolationNearest; 
import javax.media.jai.JAI;
 import javax.media.jai.iterator.RandomIter;
import javax.media.jai.iterator.RandomIterFactory;

public class Similarity {
       
  // The reference image "signature" (25 representative pixels, each in R,G,B).
   // We use instances of Color to make things simpler.
 private Color[][] signature;
    // The base size of the images.
     private static final int baseSize = 300;
    // Where are all the files?
  private static final String basePath = 
     "/home/rafael/Pesquisa/ImageSimilarity";
 public static  ArrayList<String> arr = new ArrayList<String>();
   /*
  48   * The constructor, which creates the GUI and start the image processing task.
  49   */
   public Similarity() throws IOException
      {
          arr = new ArrayList<String>();
    // Create the GUI
   // super("Naive Similarity Finder");
      //Container cp = getContentPane();
    // cp.setLayout(new BorderLayout());
      // Put the reference, scaled, in the left part of the UI.
      RenderedImage ref = rescale(ImageIO.read(new File("projectfiles\\gabor1.jpg")));
     // cp.add(new DisplayJAI(ref), BorderLayout.WEST);
     // Calculate the signature vector for the reference.
      signature = calcSignature(ref);
     // Now we need a component to store X images in a stack, where X is the
   // number of images in the same directory as the original one.
     File[] others = getOtherImageFiles(new File("projectfiles\\gabor1.jpg"));
    // JPanel otherPanel = new JPanel(new GridLayout(others.length, 2));
     // cp.add(new JScrollPane(otherPanel), BorderLayout.CENTER);
   // For each image, calculate its signature and its distance from the
      // reference signature.
       RenderedImage[] rothers = new RenderedImage[others.length];
       double[] distances = new double[others.length];
       for (int o = 0; o < others.length; o++)
         {
         rothers[o] = rescale(ImageIO.read(others[o]));
         distances[o] = calcDistance(rothers[o]);
         }
       // Sort those vectors *together*.
       for (int p1 = 0; p1 < others.length - 1; p1++)
         for (int p2 = p1 + 1; p2 < others.length; p2++)
           {
           if (distances[p1] > distances[p2])
             {
            double tempDist = distances[p1];
             distances[p1] = distances[p2];
             distances[p2] = tempDist;
             RenderedImage tempR = rothers[p1];
            rothers[p1] = rothers[p2];
             rothers[p2] = tempR;
             File tempF = others[p1];
             others[p1] = others[p2];
             others[p2] = tempF;
             }
           }
      
       
       double val ;
       
       // Add them to the UI.
       for (int o = 0; o < others.length; o++)
         {
         //otherPanel.add(new DisplayJAI(rothers[o]));
         JLabel ldist = new JLabel("<html>" + others[o].getName() + "<br>"
             + String.format("% 13.3f", distances[o]) + "</html>");
         ldist.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 36));
         System.out.printf(""+
            ""+
            "", others[o].getName(),distances[o]);
            // System.out.println("here "+ others[o].getName()+"  "+distances[o]);
             arr.add(others[o].getName()+"_"+distances[o]);
                     val = distances[o];
        //otherPanel.add(ldist);
        }
      // More GUI details.
     
     // setVisible(true);
     // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }

  
   private RenderedImage rescale(RenderedImage i)
      {
      float scaleW = ((float) baseSize) / i.getWidth();
      float scaleH = ((float) baseSize) / i.getHeight();
      // Scales the original image
      ParameterBlock pb = new ParameterBlock();
      pb.addSource(i);
      pb.add(scaleW);
      pb.add(scaleH);
      pb.add(0.0F);
      pb.add(0.0F);
      pb.add(new InterpolationNearest());
      // Creates a new, scaled image and uses it on the DisplayJAI component
      return JAI.create("scale", pb);
      }
    
   /*
    * This method calculates and returns signature vectors for the input image.
    */
    private Color[][] calcSignature(RenderedImage i)
      {
      // Get memory for the signature.
      Color[][] sig = new Color[5][5];
      // For each of the 25 signature values average the pixels around it.
      // Note that the coordinate of the central pixel is in proportions.
      float[] prop = new float[]
        {1f / 10f, 3f / 10f, 5f / 10f, 7f / 10f, 9f / 10f};
      for (int x = 0; x < 5; x++)
        for (int y = 0; y < 5; y++)
          sig[x][y] = averageAround(i, prop[x], prop[y]);
      return sig;
      }
   
   /*
    * This method averages the pixel values around a central point and return the
 9   * average as an instance of Color. The point coordinates are proportional to
    * the image.
 51   */
    private Color averageAround(RenderedImage i, double px, double py)
      {
      // Get an iterator for the image.
      RandomIter iterator = RandomIterFactory.create(i, null);
      // Get memory for a pixel and for the accumulator.
      double[] pixel = new double[3];
      double[] accum = new double[3];
      // The size of the sampling area.
      int sampleSize = 15;
      int numPixels = 0;
      // Sample the pixels.
      for (double x = px * baseSize - sampleSize; x < px * baseSize + sampleSize; x++)
        {
        for (double y = py * baseSize - sampleSize; y < py * baseSize + sampleSize; y++)
          {
         iterator.getPixel((int) x, (int) y, pixel);
        accum[0] += pixel[0];
          accum[1] += pixel[1];
         accum[2] += pixel[2];
         numPixels++;
          }
        }
    // Average the accumulated values.
     accum[0] /= numPixels;
      accum[1] /= numPixels;
     accum[2] /= numPixels;
     return new Color((int) accum[0], (int) accum[1], (int) accum[2]);
      }
  /*
 182   * This method calculates the distance between the signatures of an image and
 183   * the reference one. The signatures for the image passed as the parameter are
 184   * calculated inside the method.
 185   */
    private double calcDistance(RenderedImage other)
     {
     // Calculate the signature for that image.
     Color[][] sigOther = calcSignature(other);
     // There are several ways to calculate distances between two vectors,
     // we will calculate the sum of the distances between the RGB values of
     // pixels in the same positions.
     double dist = 0;
     for (int x = 0; x < 5; x++)
       for (int y = 0; y < 5; y++)
         {
         int r1 = signature[x][y].getRed();
         int g1 = signature[x][y].getGreen();
         int b1 = signature[x][y].getBlue();
         int r2 = sigOther[x][y].getRed();
         int g2 = sigOther[x][y].getGreen();
          int b2 = sigOther[x][y].getBlue();
         double tempDist = Math.sqrt((r1 - r2) * (r1 - r2) + (g1 - g2)
             * (g1 - g2) + (b1 - b2) * (b1 - b2));
          dist += tempDist;
         }
         //System.out.println("Calculated distance ( for face, iris)"+dist);
     return dist;
    }
  
   /*
 211   * This method get all image files in the same directory as the reference.
 212   * Just for kicks include also the reference image.
 213   */
    private File[] getOtherImageFiles(File reference)
     {
    File dir = new File("test");
    // List all the image files in that directory.
    File[] others = dir.listFiles(new JPEGImageFileFilter());
      return others;
      }
    
    
    public double similarityFinder(File fil1 , String fil2) {
     try {
         arr = new ArrayList<String>();
         // Create the GUI
         // super("Naive Similarity Finder");
         //Container cp = getContentPane();
         // cp.setLayout(new BorderLayout());
         // Put the reference, scaled, in the left part of the UI.
         RenderedImage ref = rescale(ImageIO.read(fil1));
         // cp.add(new DisplayJAI(ref), BorderLayout.WEST);
         // Calculate the signature vector for the reference.
         signature = calcSignature(ref);
         // Now we need a component to store X images in a stack, where X is the
         // number of images in the same directory as the original one.
         File[] others = new  File[1];
         others[0] =new File(fil2);
         // JPanel otherPanel = new JPanel(new GridLayout(others.length, 2));
         // cp.add(new JScrollPane(otherPanel), BorderLayout.CENTER);
         // For each image, calculate its signature and its distance from the
         // reference signature.
         RenderedImage[] rothers = new RenderedImage[others.length];
         double[] distances = new double[others.length];
         for (int o = 0; o < others.length; o++)
         {
             rothers[o] = rescale(ImageIO.read(others[o]));
             distances[o] = calcDistance(rothers[o]);
         }
         // Sort those vectors *together*.
         for (int p1 = 0; p1 < others.length - 1; p1++)
             for (int p2 = p1 + 1; p2 < others.length; p2++)
             {
                 if (distances[p1] > distances[p2])
                 {
                     double tempDist = distances[p1];
                     distances[p1] = distances[p2];
                     distances[p2] = tempDist;
                     RenderedImage tempR = rothers[p1];
                     rothers[p1] = rothers[p2];
                     rothers[p2] = tempR;
                     File tempF = others[p1];
                     others[p1] = others[p2];
                     others[p2] = tempF;
                 }
             }
         
         
         double val =0;
         
         // Add them to the UI.
         for (int o = 0; o < others.length; o++)
         {
             //otherPanel.add(new DisplayJAI(rothers[o]));
             JLabel ldist = new JLabel("<html>" + others[o].getName() + "<br>"
                     + String.format("% 13.3f", distances[o]) + "</html>");
             ldist.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 36));
             System.out.printf(""+
                     ""+
                     "", others[o].getName(),distances[o]);
             // System.out.println("here "+ others[o].getName()+"  "+distances[o]);
             arr.add(others[o].getName()+"_"+distances[o]);
             val = distances[o];
             //otherPanel.add(ldist);
         }
         return val;
     } catch (IOException ex) {
         Logger.getLogger(Similarity.class.getName()).log(Level.SEVERE, null, ex);
     }
    return 0;
    }
  
}
