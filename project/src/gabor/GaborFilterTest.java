package gabor;




import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * The test class for GaborFilter class
 */
public class GaborFilterTest {

   public void testImage(String path,int count) throws IOException {

      // Specifying the files
      File file = new File("E:\\gaborred-lena"+count+".jpg");
      Image image = ImageIO.read(new File(path));

      // Creating buffered image from the given file. NOTE: It's crucial to build the data that way!
      BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
      Graphics g = bufferedImage.getGraphics();
      g.drawImage(image, 0, 0, null);

      // Writing the filtered image to disk
      ImageIO.write(new GaborFilter(16, new double[] {0, Math.PI/4, Math.PI}, 0, 0.5, 1, 3, 3).filter(bufferedImage, null), "jpg", file);
   }
//    public static void main(String[] args) throws IOException {
//        GaborFilterTest a=new GaborFilterTest();
//        a.testImage("./src/resources/gaborred-lena.jpg");
//    }
}