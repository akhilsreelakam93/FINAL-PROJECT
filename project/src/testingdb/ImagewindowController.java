/*AKHIL SREELAKAM */
package testingdb;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;

public class ImagewindowController implements Initializable 
{   
    @FXML
    private Label imagelabel;
    @FXML
    private Label lab;
    @FXML
    private Label gaberor;
    @FXML
    private Label saveme;
    @FXML
    private Label gaborlabel;
    @FXML
    private Label blabel;
    @FXML
    private Label cannylabel;
    @FXML
    private Label glabel;  
    @FXML
    private TextArea lv1;
    @FXML
    private TextArea lv2;
    @FXML
    private TextArea lv3;
    @FXML
    private TextArea ta1;
    @FXML
    private TextArea ta2;
    @FXML
    private TextArea ta3;
    @FXML
    private ImageView iv1;
    @FXML
    private ImageView iv2;
    @FXML
    private ImageView iv3;
    @FXML
    private Image image1;
    @FXML
    private Image image11;
    @FXML
    private Image image2;
    @FXML
    private Image image21;
    @FXML
    private Image image3;
    @FXML
    private Image image31;
    @FXML
    private ImageView view1;
    @FXML
    private ImageView view123;
    @FXML
    private ImageView view11;
    @FXML
    private ImageView view1123;
    @FXML
    private ImageView view111;  
    @FXML
    private ImageView view11123;
    @FXML
    private ImageView i1;
    @FXML
    private ImageView i2;
    @FXML
    private ImageView i3;
    @FXML
    private ImageView i10;
    @FXML
    private ImageView i20;
    @FXML
    private ImageView i30;
    @FXML
    private ImageView i4;
    @FXML
    private ImageView i40;
    @FXML
    private ImageView i50;
    @FXML
    private ImageView i60;
    @FXML
    private ImageView i41;
    @FXML
    private ImageView i5;
    @FXML
    private ImageView i51;
    @FXML
    private ImageView i6;
    @FXML
    private ImageView i61;
    @FXML
    private Label label5;
    @FXML
    private Button qk;
    @FXML
    private Button uploadkey;
    @FXML
    private Button browse1;
    @FXML
    private Button browse2;
    @FXML
    private Button browse3;
    @FXML
    private Button signkey;
    
   
    public void getmyname(String user)
    {    
        label5.setText(user);
    }
            
    
    int i=0,j=0,z=0,m=0,tn=0,o=0,mm=0,nn=0,oo=0,m1=0,tn1=0,o1=0,try1=0,try2=0,try3=0,cy1=0,cy2=0,cy3=0,gt1=0,gt2=0,gt3=0,yes=0;
    double facedist;
    double fingerdist;
    double irisdist;
    double facepercentage;
    double fingerpercentage;
    double irispercentage;
    
    @FXML
    private void signkeyaction(ActionEvent event) throws IOException 
    {
        
            Parent aboutpageparent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene aboutpagescene = new Scene(aboutpageparent);
            Stage aboutstage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            aboutstage.hide();
            aboutstage.setScene(aboutpagescene);
            aboutstage.show();  
    }
  
    @FXML
    private void preprocess(ActionEvent event) throws IOException 
    {
        if(i==1 && j==1 && z==1)
        {
            Parent aboutpageparent = FXMLLoader.load(getClass().getResource("preprocesswindow.fxml"));
            Scene aboutpagescene = new Scene(aboutpageparent);
            Stage aboutstage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            aboutstage.hide();
            aboutstage.setScene(aboutpagescene);
            aboutstage.show();   
        }
        else    
        if(i==0 || j==0 || z==0)
        { 
            imagelabel.setTextFill(Color.web("#FF0000"));
            imagelabel.setStyle("-fx-font-size:12;");  
            imagelabel.setText("      Please browse all the images");
        }
        
    } 
    @FXML
    private void facebrowse(ActionEvent event) throws IOException 
    {   
       
                lv1.setMouseTransparent(true);
                FileChooser fc = new FileChooser();
                //SYSTEM DEPENDANT
                fc.setInitialDirectory(new File("C:\\Users"));
                fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("JPEG AND PNG FILES","*.jpeg","*.jpg","*.png","*.PNG"));
                File selectedFile= fc.showOpenDialog(null);
                if(selectedFile!=null)
                {   
                    String s= selectedFile.getAbsolutePath();
                    BufferedImage in;
                    File file = new File(s);
                    in = ImageIO.read(file);
                    medianjava b = new medianjava();
                    BufferedImage n = b.median(in, 1);
                    WritableImage wr1 = null;
                    if (n != null) 
                    {
                        wr1 = new WritableImage(n.getWidth(), n.getHeight());
                        PixelWriter pw1 = wr1.getPixelWriter();
                        for (int x = 0; x < n.getWidth(); x++)
                        {
                            for (int y = 0; y < n.getHeight(); y++)
                            {
                             pw1.setArgb(x, y, n.getRGB(x, y));
                            }
                        }
                    }
                    iv1.setImage(wr1);
                    i=1;
                    image1= new Image(selectedFile.toURI().toString());
                    view1.setImage(image1);
                    lv1.setText(selectedFile.getName());
                }
                else
                {
                    System.out.println("Not a valid file");
                }
        
    }
    @FXML
    private void loginface(ActionEvent event) throws IOException 
    {   

                FileChooser fc1 = new FileChooser();
                //SYSTEM DEPENDANT
                fc1.setInitialDirectory(new File("C:\\Users"));
                fc1.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("JPEG AND PNG FILES","*.jpeg","*.jpg","*.png","*.PNG"));
                File selectedFile= fc1.showOpenDialog(null);
                if(selectedFile!=null)
                {   
                    String s= selectedFile.getAbsolutePath();
                    BufferedImage in;
                    File file = new File(s);
                    in = ImageIO.read(file);
                    medianjava b = new medianjava();
                    BufferedImage n = b.medianLogin(in, 1);
                    
                    WritableImage wr1 = null;
                    if (n != null) 
                    {
                        wr1 = new WritableImage(n.getWidth(), n.getHeight());
                        PixelWriter pw1 = wr1.getPixelWriter();
                        for (int x = 0; x < n.getWidth(); x++)
                        {
                            for (int y = 0; y < n.getHeight(); y++)
                            {
                             pw1.setArgb(x, y, n.getRGB(x, y));
                            }
                        }
                    }
                   i41.setImage(wr1);  
                   try1=1;
                   image11= new Image(selectedFile.toURI().toString());
                   view123.setImage(image11);
                   ta1.setText(selectedFile.getName());
  
                }
                else
                {
                    System.out.println("Not a valid file");
                }

        
    }
    @FXML
    private void fingerbrowse(ActionEvent event) throws IOException 
    {   
      
                lv2.setMouseTransparent(true);
                FileChooser fc = new FileChooser();
                //SYSTEM DEPENDANT
                fc.setInitialDirectory(new File("C:\\Users"));
                fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("JPEG AND PNG FILES","*.jpeg","*.jpg","*.png","*.PNG"));
                File selectedFile= fc.showOpenDialog(null);
                if(selectedFile!=null)
                {
                    String ss= selectedFile.getAbsolutePath();
                    BufferedImage ins;
                    File files = new File(ss);
                    ins = ImageIO.read(files);
                    medianjava c = new medianjava();
                    BufferedImage n1 = c.median(ins, 2);
                    WritableImage wr2 = null;
                    if (n1 != null) 
                    {
                        wr2 = new WritableImage(n1.getWidth(), n1.getHeight());
                        PixelWriter pw2 = wr2.getPixelWriter();
                        for (int x = 0; x < n1.getWidth(); x++)
                        {
                        for (int y = 0; y < n1.getHeight(); y++)
                        {
                            pw2.setArgb(x, y, n1.getRGB(x, y));
                        }
                    }
                    }
                    iv2.setImage(wr2);
                    j=1;
                    image2= new Image(selectedFile.toURI().toString());
                    view11.setImage(image2);
                    lv2.setText(selectedFile.getName());
                    
                }
                else
                {
                    System.out.println("Not a valid file");
                }
         
    }
    @FXML
    private void loginfinger(ActionEvent event) throws IOException 
    {   
      
                FileChooser fc = new FileChooser();
                //SYSTEM DEPENDANT
                fc.setInitialDirectory(new File("C:\\Users"));
                fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("JPEG AND PNG FILES","*.jpeg","*.jpg","*.png","*.PNG"));
                File selectedFile= fc.showOpenDialog(null);
                if(selectedFile!=null)
                {
                    String ss= selectedFile.getAbsolutePath();
                    BufferedImage ins;
                    File files = new File(ss);
                    ins = ImageIO.read(files);
                    medianjava c = new medianjava();
                    BufferedImage n1 = c.medianLogin(ins, 2);
                    WritableImage wr2 = null;
                    if (n1 != null) 
                    {
                        wr2 = new WritableImage(n1.getWidth(), n1.getHeight());
                        PixelWriter pw2 = wr2.getPixelWriter();
                        for (int x = 0; x < n1.getWidth(); x++)
                        {
                        for (int y = 0; y < n1.getHeight(); y++)
                        {
                            pw2.setArgb(x, y, n1.getRGB(x, y));
                        }
                    }
                    }
                    i51.setImage(wr2);
                    try2=1;
                    image21= new Image(selectedFile.toURI().toString());
                    view1123.setImage(image21);
                    ta2.setText(selectedFile.getName());
                    
                }
                else
                {
                    System.out.println("Not a valid file");
                }


         
    }
    @FXML
    private void irisbrowse(ActionEvent event) throws IOException 
    {   
       
            lv3.setMouseTransparent(true);
            FileChooser fc = new FileChooser();
            //SYSTEM DEPENDANT
            fc.setInitialDirectory(new File("C:\\Users"));
            fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("JPEG AND PNG FILES","*.jpeg","*.jpg","*.png","*.PNG"));
            File selectedFile= fc.showOpenDialog(null);
            if(selectedFile!=null)
            {
                String sss= selectedFile.getAbsolutePath();
                BufferedImage inss;
                File filesd = new File(sss);
                inss = ImageIO.read(filesd);
                medianjava d = new medianjava();
                BufferedImage n2 = d.median(inss, 3);
                WritableImage wr3 = null;
                if (n2 != null) 
                {
                    wr3 = new WritableImage(n2.getWidth(), n2.getHeight());
                    PixelWriter pw3 = wr3.getPixelWriter();
                    for (int x = 0; x < n2.getWidth(); x++)
                    {
                        for (int y = 0; y < n2.getHeight(); y++)
                        {
                            pw3.setArgb(x, y, n2.getRGB(x, y));
                        }
                    }
                }
                iv3.setImage(wr3);
                z=1;
                image3= new Image(selectedFile.toURI().toString());
                view111.setImage(image3);
                lv3.setText(selectedFile.getName());
            }
            else
            {
                System.out.println("Not a valid file");
            }
         
    }
    @FXML
    private void loginiris(ActionEvent event) throws IOException 
    {   
       
            FileChooser fc = new FileChooser();
            //SYSTEM DEPENDANT
            fc.setInitialDirectory(new File("C:\\Users"));
            fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("JPEG AND PNG FILES","*.jpeg","*.jpg","*.png","*.PNG"));
            File selectedFile= fc.showOpenDialog(null);
            if(selectedFile!=null)
            {
                String sss= selectedFile.getAbsolutePath();
                BufferedImage inss;
                File filesd = new File(sss);
                inss = ImageIO.read(filesd);
                medianjava d = new medianjava();
                BufferedImage n2 = d.medianLogin(inss, 3);
                WritableImage wr3 = null;
                if (n2 != null) 
                {
                    wr3 = new WritableImage(n2.getWidth(), n2.getHeight());
                    PixelWriter pw3 = wr3.getPixelWriter();
                    for (int x = 0; x < n2.getWidth(); x++)
                    {
                        for (int y = 0; y < n2.getHeight(); y++)
                        {
                            pw3.setArgb(x, y, n2.getRGB(x, y));
                        }
                    }
                }
                i61.setImage(wr3);
                try3=1;
                image31= new Image(selectedFile.toURI().toString());
                view11123.setImage(image31);
                ta3.setText(selectedFile.getName());
            }
            else
            {
                System.out.println("Not a valid file");
            }

    }
    
    @FXML
    private void quickregister(ActionEvent event) throws IOException 
    {
            CannyEdgeDetector detector = new CannyEdgeDetector();
            detector.setLowThreshold(0.5f);
            detector.setHighThreshold(1f);
            BufferedImage img = ImageIO.read(new File("projectfiles\\median1.jpg"));
            detector.setSourceImage(img);
            detector.process();
            BufferedImage edges = detector.getEdgesImage();
            File output = new File("projectfiles\\facecanny.jpg");
            ImageIO.write(edges, "jpg", output);
            CannyEdgeDetector detector1 = new CannyEdgeDetector();
            detector1.setLowThreshold(0.5f);
            detector1.setHighThreshold(1f);
            BufferedImage img1 = ImageIO.read(new File("projectfiles\\median2.jpg"));
            detector1.setSourceImage(img1);
            detector1.process();
            BufferedImage edgess = detector1.getEdgesImage();
            File output1 = new File("projectfiles\\fingercanny.jpg");
            ImageIO.write(edgess, "jpg", output1);
            CannyEdgeDetector detector2 = new CannyEdgeDetector();
            detector2.setLowThreshold(0.5f);
            detector2.setHighThreshold(1f);
            BufferedImage img2 = ImageIO.read(new File("projectfiles\\median3.jpg"));
            detector2.setSourceImage(img2);
            detector2.process();
            BufferedImage edgesss = detector2.getEdgesImage();
            File output2 = new File("projectfiles\\iriscanny.jpg");
            ImageIO.write(edgesss, "jpg", output2);
            String p = "projectfiles\\facecanny.jpg";
            GaborFilterTest a = new GaborFilterTest();
            a.testImage(p, 1);
            String k = "projectfiles\\fingercanny.jpg";
            GaborFilterTest b = new GaborFilterTest();
            b.testImage(k, 2);
            String q = "projectfiles\\iriscanny.jpg";
            GaborFilterTest c = new GaborFilterTest();
            c.testImage(q, 3);
            String aa=SQLiteJDBC.s;
            String q1 = "projectfiles\\gabor1.jpg";
            String q2 = "projectfiles\\gabor2.jpg";
            String q3 = "projectfiles\\gabor3.jpg";
            File file0 = new File(q1);
            File file1 = new File(q2);
            File file2 = new File(q3);
            new File("src\\save\\"+aa).mkdir();
            BufferedImage ccva = ImageIO.read(file0);
            WritableImage wr8 = null;
            if (ccva != null) 
            {
                wr8 = new WritableImage(ccva.getWidth(), ccva.getHeight());
                PixelWriter pw8 = wr8.getPixelWriter();
                for (int x = 0; x < ccva.getWidth(); x++)
                {
                    for (int y = 0; y < ccva.getHeight(); y++)
                    {
                        pw8.setArgb(x, y, ccva.getRGB(x, y));
                    }
                }
            }
            ImageIO.write(ccva, "jpg", new File("src\\save\\"+aa+"\\"+1+".jpg"));
            FileUtils.copyFile(file1,  new File("src\\save\\"+aa+"\\"+2+".jpg"));
            FileUtils.copyFile(file2,  new File("src\\save\\"+aa+"\\"+3+".jpg"));
            imagelabel.setTextFill(Color.web("#008000"));
            imagelabel.setStyle("-fx-font-size:15;");  
            imagelabel.setText("USER QUICK REGISTRATION SUCCESSFUL");
            qk.setDisable(true);
            uploadkey.setDisable(true);
            browse1.setDisable(true);
            browse2.setDisable(true);
            browse3.setDisable(true);
            signkey.setVisible(true);
            
    }
    
    @FXML
    private void quicklogin(ActionEvent event) throws IOException, InterruptedException 
    {
            CannyEdgeDetector detector = new CannyEdgeDetector();
            detector.setLowThreshold(0.5f);
            detector.setHighThreshold(1f);
            BufferedImage img = ImageIO.read(new File("projectfiles\\login\\median1.jpg"));
            detector.setSourceImage(img);
            detector.process();
            BufferedImage edges = detector.getEdgesImage();
            File output = new File("projectfiles\\login\\facecanny.jpg");
            ImageIO.write(edges, "jpg", output);
            CannyEdgeDetector detector1 = new CannyEdgeDetector();
            detector1.setLowThreshold(0.5f);
            detector1.setHighThreshold(1f);
            BufferedImage img1 = ImageIO.read(new File("projectfiles\\login\\median2.jpg"));
            detector1.setSourceImage(img1);
            detector1.process();
            BufferedImage edges1 = detector1.getEdgesImage();
            File output1 = new File("projectfiles\\login\\fingercanny.jpg");
            ImageIO.write(edges1, "jpg", output1);
            CannyEdgeDetector detector2 = new CannyEdgeDetector();
            detector2.setLowThreshold(0.5f);
            detector2.setHighThreshold(1f);
            BufferedImage img2 = ImageIO.read(new File("projectfiles\\login\\median3.jpg"));
            detector2.setSourceImage(img2);
            detector2.process();
            BufferedImage edges2 = detector2.getEdgesImage();
            File output2 = new File("projectfiles\\login\\iriscanny.jpg");
            ImageIO.write(edges2, "jpg", output2);
            String p = "projectfiles\\login\\facecanny.jpg";
            GaborFilterTest a = new GaborFilterTest();
            a.testImage1(p, 1);
            String k = "projectfiles\\login\\fingercanny.jpg";
            GaborFilterTest b = new GaborFilterTest();
            b.testImage1(k, 2);
            String q = "projectfiles\\login\\iriscanny.jpg";
            GaborFilterTest c = new GaborFilterTest();
            c.testImage1(q, 3);
            String s=FXMLDocumentController.user;
            String q1 = "projectfiles\\login\\gabor1.jpg";
            String q2 = "projectfiles\\login\\gabor2.jpg";
            String q3 = "projectfiles\\login\\gabor3.jpg";
            File file0 = new File(q1);
            File file1 = new File(q2);
            File file2 = new File(q3);
            if( new File("src\\loginsave\\"+s).exists())
            {
               new File("src\\loginsave\\"+s).delete();
            }
            new File("src\\loginsave\\"+s).mkdir();
            BufferedImage ccva = ImageIO.read(file0);
            WritableImage wr8 = null;
            if (ccva != null) 
            {
                wr8 = new WritableImage(ccva.getWidth(), ccva.getHeight());
                PixelWriter pw8 = wr8.getPixelWriter();
                for (int x = 0; x < ccva.getWidth(); x++)
                {
                    for (int y = 0; y < ccva.getHeight(); y++)
                    {
                        pw8.setArgb(x, y, ccva.getRGB(x, y));
                    }
                }
            }
            ImageIO.write(ccva, "jpg", new File("src\\loginsave\\"+s+"\\"+1+".jpg"));
            FileUtils.copyFile(file1,  new File("src\\loginsave\\"+s+"\\"+2+".jpg"));
            FileUtils.copyFile(file2,  new File("src\\loginsave\\"+s+"\\"+3+".jpg"));
            String snew=FXMLDocumentController.user;
            FR f= new FR();
            Similarity sim= new Similarity();
            int result = f.compareImage("src\\save\\"+snew+"\\"+2+".jpg", "src\\loginsave\\"+snew+"\\"+2+".jpg");
            double resultv = sim.similarityFinder(new File("src\\save\\"+snew+"\\"+1+".jpg"),"src\\loginsave\\"+snew+"\\"+1+".jpg" );
            double resultb = sim.similarityFinder(new File("src\\save\\"+snew+"\\"+3+".jpg"),"src\\loginsave\\"+snew+"\\"+3+".jpg" );       
            System.out.println("Here matched result ( face,fingerprint,iris) "+resultv+" and "+result+ " and "+resultb);
            System.out.println("Matching accuracy: ");
            facedist= 1000-resultv;
            fingerdist= 1000-result;
            irisdist= 1000-resultb;
            facepercentage= (facedist/1000)*100;
            fingerpercentage= (fingerdist/1000)*100;
            irispercentage= (irisdist/1000)*100;
            if(facepercentage<=100 && facepercentage>=0 && fingerpercentage<=100 && fingerpercentage>=0 && irispercentage<=100 && irispercentage>=0)
            {
               System.out.println("Face :"+ facepercentage+"\n"+ "Fingerprint :" + fingerpercentage+"\n"+ "Iris: " + irispercentage+"\n" );
            }
            else
            System.out.println("VERY LARGE AMOUNT OF MISMATCH FOUND IN ONE OR MORE BIOMETRIC TRAITS");
            Thread.sleep(3000);
            if(result >= 100 )
            {
                System.out.println("Fingerprint mismatch");
            }
            if(resultb >= 100 )
            {
                System.out.println("Iris mismatch"); 
            }
            if(resultv>600)
            {
                System.out.println("Face mismatch"); 
            }
            if(result <= 100 && resultv<=600 && resultb <=100) 
            {
               System.out.println("BIOMETRIC MATCH SUCCESSFUL");
               Stage primarystage = (Stage) ((Node) event.getSource()).getScene().getWindow();
               FXMLLoader loader= new FXMLLoader();
               Parent root = loader.load(getClass().getResource("bank.fxml").openStream());
               BankController hp= (BankController)loader.getController();
               hp.sff(facepercentage,fingerpercentage,irispercentage);
               Scene scene;
               scene = new Scene(root);
               primarystage.hide();
               primarystage.setScene(scene);
               primarystage.show();
            }
            else
            {
               System.out.println("BIOMETRIC MATCH UNSUCCESSFUL");
               Stage primarystage = (Stage) ((Node) event.getSource()).getScene().getWindow();
               FXMLLoader loader= new FXMLLoader();
               Parent root = loader.load(getClass().getResource("sorry.fxml").openStream());
               SorryController hc= (SorryController)loader.getController();
               hc.sfn(facepercentage,fingerpercentage,irispercentage);
               Scene scene;
               scene = new Scene(root);
               primarystage.hide();
               primarystage.setScene(scene);
               primarystage.show();
            }
            
            
    }
    
  
    @FXML
    private void c1(ActionEvent event) throws IOException 
    {
            m=1;
            CannyEdgeDetector detector = new CannyEdgeDetector();
            detector.setLowThreshold(0.5f);
            detector.setHighThreshold(1f);
            BufferedImage img = ImageIO.read(new File("projectfiles\\median1.jpg"));
            detector.setSourceImage(img);
            detector.process();
            BufferedImage edges = detector.getEdgesImage();
            File output = new File("projectfiles\\facecanny.jpg");
            ImageIO.write(edges, "jpg", output);
            WritableImage wr4 = null;
            if (edges != null) 
            {
                wr4 = new WritableImage(edges.getWidth(), edges.getHeight());
                PixelWriter pw4 = wr4.getPixelWriter();
                for (int x = 0; x < edges.getWidth(); x++)
                {
                    for (int y = 0; y < edges.getHeight(); y++)
                    {
                        pw4.setArgb(x, y, edges.getRGB(x, y));
                    }
                }
            }
            i1.setImage(wr4);
    }
    @FXML
    private void cannyface(ActionEvent event) throws IOException 
    {
            cy1=1;
            CannyEdgeDetector detector = new CannyEdgeDetector();
            detector.setLowThreshold(0.5f);
            detector.setHighThreshold(1f);
            BufferedImage img = ImageIO.read(new File("projectfiles\\login\\median1.jpg"));
            detector.setSourceImage(img);
            detector.process();
            BufferedImage edges = detector.getEdgesImage();
            File output = new File("projectfiles\\login\\facecanny.jpg");
            ImageIO.write(edges, "jpg", output);
            WritableImage wr4 = null;
            if (edges != null) 
            {
                wr4 = new WritableImage(edges.getWidth(), edges.getHeight());
                PixelWriter pw4 = wr4.getPixelWriter();
                for (int x = 0; x < edges.getWidth(); x++)
                {
                    for (int y = 0; y < edges.getHeight(); y++)
                    {
                        pw4.setArgb(x, y, edges.getRGB(x, y));
                    }
                }
            }
            i10.setImage(wr4);
    }
    @FXML
    private void c2(ActionEvent event) throws IOException 
    {
            tn=1;
            CannyEdgeDetector detector1 = new CannyEdgeDetector();
            detector1.setLowThreshold(0.5f);
            detector1.setHighThreshold(1f);
            BufferedImage img1 = ImageIO.read(new File("projectfiles\\median2.jpg"));
            detector1.setSourceImage(img1);
            detector1.process();
            BufferedImage edgess = detector1.getEdgesImage();
            File output1 = new File("projectfiles\\fingercanny.jpg");
            ImageIO.write(edgess, "jpg", output1);
            WritableImage wr5 = null;
            if (edgess != null) 
            {
                wr5 = new WritableImage(edgess.getWidth(), edgess.getHeight());
                PixelWriter pw5 = wr5.getPixelWriter();
                for (int x = 0; x < edgess.getWidth(); x++)
                {
                    for (int y = 0; y < edgess.getHeight(); y++)
                    {
                        pw5.setArgb(x, y, edgess.getRGB(x, y));
                    }
                }
            }
            i2.setImage(wr5);
    }
    @FXML
    private void cannyfinger(ActionEvent event) throws IOException 
    {
            cy2=1;
            CannyEdgeDetector detector = new CannyEdgeDetector();
            detector.setLowThreshold(0.5f);
            detector.setHighThreshold(1f);
            BufferedImage img = ImageIO.read(new File("projectfiles\\login\\median2.jpg"));
            detector.setSourceImage(img);
            detector.process();
            BufferedImage edges = detector.getEdgesImage();
            File output = new File("projectfiles\\login\\fingercanny.jpg");
            ImageIO.write(edges, "jpg", output);
            WritableImage wr4 = null;
            if (edges != null) 
            {
                wr4 = new WritableImage(edges.getWidth(), edges.getHeight());
                PixelWriter pw4 = wr4.getPixelWriter();
                for (int x = 0; x < edges.getWidth(); x++)
                {
                    for (int y = 0; y < edges.getHeight(); y++)
                    {
                        pw4.setArgb(x, y, edges.getRGB(x, y));
                    }
                }
            }
            i20.setImage(wr4);
    }
    @FXML
    private void c3(ActionEvent event) throws IOException 
    {
            o=1;
            CannyEdgeDetector detector2 = new CannyEdgeDetector();
            detector2.setLowThreshold(0.5f);
            detector2.setHighThreshold(1f);
            BufferedImage img2 = ImageIO.read(new File("projectfiles\\median3.jpg"));
            detector2.setSourceImage(img2);
            detector2.process();
            BufferedImage edgesss = detector2.getEdgesImage();
            File output2 = new File("projectfiles\\iriscanny.jpg");
            ImageIO.write(edgesss, "jpg", output2);
            WritableImage wr5 = null;
            if (edgesss != null) 
            {
                wr5 = new WritableImage(edgesss.getWidth(), edgesss.getHeight());
                PixelWriter pw5 = wr5.getPixelWriter();
                for (int x = 0; x < edgesss.getWidth(); x++)
                {
                    for (int y = 0; y < edgesss.getHeight(); y++)
                    {
                        pw5.setArgb(x, y, edgesss.getRGB(x, y));
                    }
                }
            }
            i3.setImage(wr5);
    }
    @FXML
    private void cannyiris(ActionEvent event) throws IOException 
    {
            cy3=1;
            CannyEdgeDetector detector = new CannyEdgeDetector();
            detector.setLowThreshold(0.5f);
            detector.setHighThreshold(1f);
            BufferedImage img = ImageIO.read(new File("projectfiles\\login\\median3.jpg"));
            detector.setSourceImage(img);
            detector.process();
            BufferedImage edges = detector.getEdgesImage();
            File output = new File("projectfiles\\login\\iriscanny.jpg");
            ImageIO.write(edges, "jpg", output);
            WritableImage wr4 = null;
            if (edges != null) 
            {
                wr4 = new WritableImage(edges.getWidth(), edges.getHeight());
                PixelWriter pw4 = wr4.getPixelWriter();
                for (int x = 0; x < edges.getWidth(); x++)
                {
                    for (int y = 0; y < edges.getHeight(); y++)
                    {
                        pw4.setArgb(x, y, edges.getRGB(x, y));
                    }
                }
            }
            i30.setImage(wr4);
    }
    @FXML
    private void g1(ActionEvent event) throws IOException 
    {       
            mm=1;
            String p = "projectfiles\\facecanny.jpg";
            GaborFilterTest a = new GaborFilterTest();
            a.testImage(p, 1);
            String s = "projectfiles\\gabor1.jpg";
            File file = new File(s);
            BufferedImage inss = ImageIO.read(file);
            WritableImage wr6 = null;
            if (inss != null) 
            {
                wr6 = new WritableImage(inss.getWidth(), inss.getHeight());
                PixelWriter pw6 = wr6.getPixelWriter();
                for (int x = 0; x < inss.getWidth(); x++)
                {
                    for (int y = 0; y < inss.getHeight(); y++)
                    {
                        pw6.setArgb(x, y, inss.getRGB(x, y));
                    }
                }
            }
            i4.setImage(wr6);
            
    }
    @FXML
    private void g2(ActionEvent event) throws IOException 
    {
            nn=1;
            String k = "projectfiles\\fingercanny.jpg";
            GaborFilterTest b = new GaborFilterTest();
            b.testImage(k, 2);
            String d = "projectfiles\\gabor2.jpg";
            File file = new File(d);
            BufferedImage ccv = ImageIO.read(file);
            WritableImage wr7 = null;
            if (ccv != null) 
            {
                wr7 = new WritableImage(ccv.getWidth(), ccv.getHeight());
                PixelWriter pw7 = wr7.getPixelWriter();
                for (int x = 0; x < ccv.getWidth(); x++)
                {
                    for (int y = 0; y < ccv.getHeight(); y++)
                    {
                        pw7.setArgb(x, y, ccv.getRGB(x, y));
                    }
                }
            }
            i5.setImage(wr7);
            
    }
    @FXML
    private void g3(ActionEvent event) throws IOException 
    {
         
            oo=1;
            String q = "projectfiles\\iriscanny.jpg";
            GaborFilterTest c = new GaborFilterTest();
            c.testImage(q, 3);
            String s = "projectfiles\\gabor3.jpg";
            File file = new File(s);
            BufferedImage ccva = ImageIO.read(file);
            WritableImage wr8 = null;
            if (ccva != null) 
            {
                wr8 = new WritableImage(ccva.getWidth(), ccva.getHeight());
                PixelWriter pw8 = wr8.getPixelWriter();
                for (int x = 0; x < ccva.getWidth(); x++)
                {
                    for (int y = 0; y < ccva.getHeight(); y++)
                    {
                        pw8.setArgb(x, y, ccva.getRGB(x, y));
                    }
                }
            }
            i6.setImage(wr8);
            
    }
    @FXML
    private void finalreg(ActionEvent event) throws IOException 
    {
        if(mm==1 && nn==1 && oo==1)
        { 
        String s=SQLiteJDBC.s;
            String q1 = "projectfiles\\gabor1.jpg";
            String q2 = "projectfiles\\gabor2.jpg";
            String q3 = "projectfiles\\gabor3.jpg";
            
            File file0 = new File(q1);
              File file1 = new File(q2);
                File file2 = new File(q3);
            
             new File("src\\save\\"+s).mkdir();
               BufferedImage ccva = ImageIO.read(file0);
            WritableImage wr8 = null;
            if (ccva != null) 
            {
                wr8 = new WritableImage(ccva.getWidth(), ccva.getHeight());
                PixelWriter pw8 = wr8.getPixelWriter();
                for (int x = 0; x < ccva.getWidth(); x++)
                {
                    for (int y = 0; y < ccva.getHeight(); y++)
                    {
                        pw8.setArgb(x, y, ccva.getRGB(x, y));
                    }
                }
            }
        
  ImageIO.write(ccva, "jpg", new File("src\\save\\"+s+"\\"+1+".jpg"));
              FileUtils.copyFile(file1,  new File("src\\save\\"+s+"\\"+2+".jpg"));
               FileUtils.copyFile(file2,  new File("src\\save\\"+s+"\\"+3+".jpg"));
    gaberor.setText("");
    lab.setStyle("-fx-font-size:20;");
    lab.setTextFill(Color.web("#008000"));
    lab.setText("  USER REGISTRATION SUCCESSFUL");
        }
        else
        {   
            gaberor.setTextFill(Color.web("#FF0000"));
            gaberor.setStyle("-fx-font-size:12;");  
            gaberor.setText("Please do gabor to all the images");
        }
    }
    @FXML
    private void savedb(ActionEvent event) throws IOException 
    {
        if(gt1==1 && gt2==1 && gt3==1)
        {
            yes=1;
            glabel.setText("");
            saveme.setStyle("-fx-font-size:20;");
            saveme.setTextFill(Color.web("#008000"));
            saveme.setText(" IMAGES SAVED !!!!");
            String s=FXMLDocumentController.user;
            String q1 = "projectfiles\\login\\gabor1.jpg";
            String q2 = "projectfiles\\login\\gabor2.jpg";
            String q3 = "projectfiles\\login\\gabor3.jpg";
            File file0 = new File(q1);
            File file1 = new File(q2);
            File file2 = new File(q3);
            if( new File("src\\loginsave\\"+s).exists())
            {
               new File("src\\loginsave\\"+s).delete();
            }
            new File("src\\loginsave\\"+s).mkdir();
            BufferedImage ccva = ImageIO.read(file0);
            WritableImage wr8 = null;
            if (ccva != null) 
            {
                wr8 = new WritableImage(ccva.getWidth(), ccva.getHeight());
                PixelWriter pw8 = wr8.getPixelWriter();
                for (int x = 0; x < ccva.getWidth(); x++)
                {
                    for (int y = 0; y < ccva.getHeight(); y++)
                    {
                        pw8.setArgb(x, y, ccva.getRGB(x, y));
                    }
                }
            }
            ImageIO.write(ccva, "jpg", new File("src\\loginsave\\"+s+"\\"+1+".jpg"));
            FileUtils.copyFile(file1,  new File("src\\loginsave\\"+s+"\\"+2+".jpg"));
            FileUtils.copyFile(file2,  new File("src\\loginsave\\"+s+"\\"+3+".jpg"));
        }
        else
        {
            saveme.setText("");
            glabel.setTextFill(Color.web("#FF0000"));
            glabel.setStyle("-fx-font-size:12;");  
            glabel.setText("Please do gabor to all the images");
        }
    }
    @FXML
    private void bac(ActionEvent event) throws IOException 
    {
            Parent backipageparent = FXMLLoader.load(getClass().getResource("imagewindow.fxml"));
            Scene backipagescene = new Scene(backipageparent);
            Stage backistage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            backistage.hide();
            backistage.setScene(backipagescene);
            backistage.show(); 
    }
    @FXML
    private void loginbank(ActionEvent event) throws IOException, InterruptedException 
    {
        if(yes==1)
        {
         String s=FXMLDocumentController.user;
         FR f= new FR();
         Similarity sim= new Similarity();
         int result = f.compareImage("src\\save\\"+s+"\\"+2+".jpg", "src\\loginsave\\"+s+"\\"+2+".jpg");
         double resultv = sim.similarityFinder(new File("src\\save\\"+s+"\\"+1+".jpg"),"src\\loginsave\\"+s+"\\"+1+".jpg" );
         double resultb = sim.similarityFinder(new File("src\\save\\"+s+"\\"+3+".jpg"),"src\\loginsave\\"+s+"\\"+3+".jpg" );       
         System.out.println("Here matched result ( face,fingerprint,iris) "+resultv+" and "+result+ " and "+resultb);
         System.out.println("Matching accuracy: ");
         facedist= 1000-resultv;
         fingerdist= 1000-result;
         irisdist= 1000-resultb;
         facepercentage= (facedist/1000)*100;
         fingerpercentage= (fingerdist/1000)*100;
         irispercentage= (irisdist/1000)*100;
         if(facepercentage<=100 && facepercentage>=0 && fingerpercentage<=100 && fingerpercentage>=0 && irispercentage<=100 && irispercentage>=0)
         {
            System.out.println("Face :"+ facepercentage+"\n"+ "Fingerprint :" + fingerpercentage+"\n"+ "Iris: " + irispercentage+"\n" );
         }
         else
         System.out.println("VERY LARGE AMOUNT OF MISMATCH FOUND IN ONE OR MORE BIOMETRIC TRAITS");
         Thread.sleep(3000);
         if(result >= 100 )
         {
             System.out.println("Fingerprint mismatch");
         }
         if(resultb >= 100 )
         {
             System.out.println("Iris mismatch"); 
         }
         if(resultv>600)
         {
             System.out.println("Face mismatch"); 
         }
         if(result <= 100 && resultv<=600 && resultb <=100) 
         {
            System.out.println("BIOMETRIC MATCH SUCCESSFUL");
            Stage primarystage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader= new FXMLLoader();
            Parent root = loader.load(getClass().getResource("bank.fxml").openStream());
            BankController hp= (BankController)loader.getController();
            hp.sff(facepercentage,fingerpercentage,irispercentage);
            Scene scene;
            scene = new Scene(root);
            primarystage.hide();
            primarystage.setScene(scene);
            primarystage.show();
         }
         else
         {
            System.out.println("BIOMETRIC MATCH UNSUCCESSFUL");
            Stage primarystage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader= new FXMLLoader();
            Parent root = loader.load(getClass().getResource("sorry.fxml").openStream());
            SorryController hc= (SorryController)loader.getController();
            hc.sfn(facepercentage,fingerpercentage,irispercentage);
            Scene scene;
            scene = new Scene(root);
            primarystage.hide();
            primarystage.setScene(scene);
            primarystage.show();
         }     
        }
        else
        {
            glabel.setText("");
            saveme.setTextFill(Color.web("#FF0000"));
            saveme.setStyle("-fx-font-size:20;");  
            saveme.setText("Save the images first");
        }
    }
    @FXML
    private void back(ActionEvent event) throws IOException 
    {
            Parent backipageparent = FXMLLoader.load(getClass().getResource("register.fxml"));
            Scene backipagescene = new Scene(backipageparent);
            Stage backistage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            backistage.hide();
            backistage.setScene(backipagescene);
            backistage.show(); 
    }
    @FXML
    private void mmm(ActionEvent event) throws IOException 
    {
            Parent backipageparent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene backipagescene = new Scene(backipageparent);
            Stage backistage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            backistage.hide();
            backistage.setScene(backipagescene);
            backistage.show(); 
    }
    @FXML
    private void demo(ActionEvent event) throws IOException 
    { 
         Parent backipageparent = FXMLLoader.load(getClass().getResource("register.fxml"));
            Scene backipagescene = new Scene(backipageparent);
            Stage backistage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            backistage.hide();
            backistage.setScene(backipagescene);
            backistage.show(); 
    }
    @FXML
    private void cannylog(ActionEvent event) throws IOException 
    { 
        if(try1==1 && try2==1 && try3==1)
        {
         Parent backipageparent = FXMLLoader.load(getClass().getResource("logincanny.fxml"));
            Scene backipagescene = new Scene(backipageparent);
            Stage backistage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            backistage.hide();
            backistage.setScene(backipagescene);
            backistage.show(); 
        }
        else
        {
            blabel.setTextFill(Color.web("#FF0000"));
            blabel.setStyle("-fx-font-size:12;");  
            blabel.setText("Please browse all the images"); 
        }
    }
    @FXML
    private void next(ActionEvent event) throws IOException 
    { 
        if(cy1==1 && cy2==1 && cy3==1)
        {
            Parent backipageparent = FXMLLoader.load(getClass().getResource("logingabor.fxml"));
            Scene backipagescene = new Scene(backipageparent);
            Stage backistage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            backistage.hide();
            backistage.setScene(backipagescene);
            backistage.show(); 
        }
        else
        {
            cannylabel.setTextFill(Color.web("#FF0000"));
            cannylabel.setStyle("-fx-font-size:12;");  
            cannylabel.setText("Please do canny to all the images"); 
        }
    }
    @FXML
    private void gaborface(ActionEvent event) throws IOException 
    {       
            gt1=1;
            String p = "projectfiles\\login\\facecanny.jpg";
            GaborFilterTest a = new GaborFilterTest();
            a.testImage1(p, 1);
            String s = "projectfiles\\login\\gabor1.jpg";
            File file = new File(s);
            BufferedImage inss = ImageIO.read(file);
            WritableImage wr6 = null;
            if (inss != null) 
            {
                wr6 = new WritableImage(inss.getWidth(), inss.getHeight());
                PixelWriter pw6 = wr6.getPixelWriter();
                for (int x = 0; x < inss.getWidth(); x++)
                {
                    for (int y = 0; y < inss.getHeight(); y++)
                    {
                        pw6.setArgb(x, y, inss.getRGB(x, y));
                    }
                }
            }
            i40.setImage(wr6);
            
    }
    @FXML
    private void gaborfinger(ActionEvent event) throws IOException 
    {
           
            gt2=1;
            String k = "projectfiles\\login\\fingercanny.jpg";
            GaborFilterTest b = new GaborFilterTest();
            b.testImage1(k, 2);
            String d = "projectfiles\\login\\gabor2.jpg";
            File file = new File(d);
            BufferedImage ccv = ImageIO.read(file);
            WritableImage wr7 = null;
            if (ccv != null) 
            {
                wr7 = new WritableImage(ccv.getWidth(), ccv.getHeight());
                PixelWriter pw7 = wr7.getPixelWriter();
                for (int x = 0; x < ccv.getWidth(); x++)
                {
                    for (int y = 0; y < ccv.getHeight(); y++)
                    {
                        pw7.setArgb(x, y, ccv.getRGB(x, y));
                    }
                }
            }
            i50.setImage(wr7);
            
    }
    @FXML
    private void gaboriris(ActionEvent event) throws IOException 
    {
         
            gt3=1;
            String q = "projectfiles\\login\\iriscanny.jpg";
            GaborFilterTest c = new GaborFilterTest();
            c.testImage1(q, 3);
            String s = "projectfiles\\login\\gabor3.jpg";
            File file = new File(s);
            BufferedImage ccva = ImageIO.read(file);
            WritableImage wr8 = null;
            if (ccva != null) 
            {
                wr8 = new WritableImage(ccva.getWidth(), ccva.getHeight());
                PixelWriter pw8 = wr8.getPixelWriter();
                for (int x = 0; x < ccva.getWidth(); x++)
                {
                    for (int y = 0; y < ccva.getHeight(); y++)
                    {
                        pw8.setArgb(x, y, ccva.getRGB(x, y));
                    }
                }
            }
            i60.setImage(wr8);
            
    }
    @FXML
    private void gb(ActionEvent event) throws IOException 
    {       
            if(m==1 && tn==1 && o==1)
            {
                Parent backipageparent = FXMLLoader.load(getClass().getResource("extractwindow.fxml"));
                Scene backipagescene = new Scene(backipageparent);
                Stage backistage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                backistage.hide();
                backistage.setScene(backipagescene);
                backistage.show(); 
            }
            else
            {
                gaborlabel.setTextFill(Color.web("#FF0000"));
                gaborlabel.setStyle("-fx-font-size:12;"); 
                gaborlabel.setText("Please do canny to all the images");
            }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {}    
    
}
