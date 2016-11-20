/* AKHIL SREELAKAM */
package testingdb;




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
//      File file = new File(" E:\\anfis_javafx\\project\\project\\projectfiles\\gabor"+count+".jpg");
      File file = new File("projectfiles\\gabor"+count+".jpg");
      Image image = ImageIO.read(new File(path));

      // Creating buffered image from the given file. NOTE: It's crucial to build the data that way!
      BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
      Graphics g = bufferedImage.getGraphics();
      g.drawImage(image, 0, 0, null);

      // Writing the filtered image to disk
      ImageIO.write(new GaborFilter(16, new double[] {0, Math.PI/4, Math.PI}, 0, 0.5, 1, 3, 3).filter(bufferedImage, null), "jpg", file);
   }
    public void testImage1(String path,int count) throws IOException {

      // Specifying the files
//      File file = new File(" E:\\anfis_javafx\\project\\project\\projectfiles\\gabor"+count+".jpg");
      File file = new File("projectfiles\\login\\gabor"+count+".jpg");
      Image image = ImageIO.read(new File(path));

      // Creating buffered image from the given file. NOTE: It's crucial to build the data that way!
      BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
      Graphics g = bufferedImage.getGraphics();
      g.drawImage(image, 0, 0, null);

      // Writing the filtered image to disk
      ImageIO.write(new GaborFilter(16, new double[] {0, Math.PI/4, Math.PI}, 0, 0.5, 1, 3, 3).filter(bufferedImage, null), "jpg", file);
   }
}