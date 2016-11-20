/*AKHIL SREELAKAM */
package testingdb;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable 
{
    public static String user=null;
    
    @FXML
    private TextField username_box;
    
    
    @FXML
    private PasswordField password_box;
    
    @FXML 
    private ImageView iv1;
    
    @FXML 
    private ImageView iv2;
        
    @FXML 
    private ImageView iv3;
    
    @FXML
    private Label invalid_label;
    
    @FXML
    private Label warning;
    
    @FXML
    private Button aboutbutton;
    
    @FXML
    private Button registerbutton;
     
    @FXML
    private Button button;
    
    @FXML
    private Button newuserbutton;
    
    @FXML
    private Label logoutlabel;
    
    @FXML
    private Label l1;
    
    @FXML
    private Label l2;
        
    @FXML
    private Label l3;
            
    @FXML
    private Label l4;
                
    @FXML
    private Label l5;
                    
    @FXML
    private Label l6;
    
    int f=0;
    String blockeduser;
    
    public void logoutmessage(int passed)
    {    
        if(passed==1)
        logoutlabel.setTextFill(Color.web("#008000"));
        logoutlabel.setStyle("-fx-font-size:16;"); 
        logoutlabel.setText("SUCESSFULLY LOGGED OUT");
    }
    
    @FXML
    private void lastwindow(ActionEvent event) throws IOException
    {
        Stage s = new Stage();
        s.initModality(Modality.APPLICATION_MODAL);
        Parent aboutpageparent = FXMLLoader.load(getClass().getResource("exitwindow.fxml"));
        s.getIcons().add(new Image("file:icons/exiting.png"));
        Scene aboutpagescene = new Scene(aboutpageparent);
        s.setResizable(false);
        s.hide();
        s.setScene(aboutpagescene);
        s.show(); 
    }
    
    @FXML
    private void finalexit(ActionEvent event) throws IOException 
    {
        System.exit(0);  
    }
    
    @FXML
    private void m1(ActionEvent event) throws IOException 
    {
       l1.setText("8089727343");
       l2.setText("akhilsreelakam93@gmail.com");
       File file = new File("developer\\1.jpg");
       Image image = new Image(file.toURI().toString());
       iv1.setImage(image);
    }
    
    @FXML
    private void m2(ActionEvent event) throws IOException 
    {
       l3.setText("8281714727");
       l4.setText("meenupchandran77@gmail.com");
       File file = new File("developer\\2.jpg");
       Image image = new Image(file.toURI().toString());
       iv2.setImage(image);
    }
    
    @FXML
    private void m3(ActionEvent event) throws IOException 
    {
       l5.setText("8129926173");
       l6.setText("abdulrazeen81@gmail.com");
       File file = new File("developer\\3.PNG");
       Image image = new Image(file.toURI().toString());
       iv3.setImage(image);
    }
    

    
    @FXML
    private void about(ActionEvent event) throws IOException 
    {
        Parent aboutpageparent = FXMLLoader.load(getClass().getResource("aboutpage.fxml"));
        Scene aboutpagescene = new Scene(aboutpageparent);
        Stage aboutstage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        aboutstage.hide();
        aboutstage.setScene(aboutpagescene);
        aboutstage.show();    
    } 
    
    @FXML
    private void newback(ActionEvent event) throws IOException 
    {
        Stage s= (Stage) ((Node) event.getSource()).getScene().getWindow();
        s.close();
    } 
    
    @FXML
    private void back(ActionEvent event) throws IOException 
    {
        Parent backpageparent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene backpagescene = new Scene(backpageparent);
        Stage backstage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        backstage.hide();
        backstage.setScene(backpagescene);
        backstage.show();    
    } 
    
    @FXML
    private void regi(ActionEvent event) throws IOException
    {
        Parent regipageparent = FXMLLoader.load(getClass().getResource("register.fxml"));
        Scene regipagescene = new Scene(regipageparent);
        Stage registage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        registage.hide();
        registage.setScene(regipagescene);
        registage.show();    
    } 
    
    @FXML
    private void newuseraction(ActionEvent event) throws IOException
    {
          f=0;
          newuserbutton.setDisable(true);
          username_box.setDisable(false);
          username_box.setText("");
          password_box.setDisable(false);
          password_box.setText("");
          aboutbutton.setDisable(false);
          registerbutton.setDisable(false);
          button.setDisable(false);
          warning.setText("");
          invalid_label.setText(""); 
    }
    
    @FXML
    private void signin(ActionEvent event) throws IOException, SQLException 
    {   
        user=username_box.getText();
        if(user.equals(blockeduser))
        {
            invalid_label.setTextFill(Color.web("#FF0000"));
            invalid_label.setText("   This user is already blocked");
        }
        else
        {
        if (f<3)
        {  
        isfakeaccess(); 
        if(username_box.getText().matches("") && password_box.getText().matches(""))
        {
            warning.setTextFill(Color.web("#FF0000"));
            warning.setText("Enter username and password");
        }
        else if(username_box.getText().matches(""))
        { 
            warning.setTextFill(Color.web("#FF0000"));
            invalid_label.setText("");
            warning.setText("            Enter username"); 
        }
        else if(password_box.getText().matches(""))
        {
            warning.setTextFill(Color.web("#FF0000"));
            invalid_label.setText("");
            warning.setText("            Enter password"); 
        }
        else if(username_box.getText().length()>8 || password_box.getText().length()!=4)
        {
            warning.setTextFill(Color.web("#FF0000"));
            invalid_label.setTextFill(Color.web("#FF0000"));
            invalid_label.setText("              Try again");
            warning.setText("  Expected lengths mismatch"); 
        }
        else
        if (isValidCredentials())
        {   
            Stage primarystage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader= new FXMLLoader();
            Parent root = loader.load(getClass().getResource("loginnext.fxml").openStream());
            ImagewindowController hpc= (ImagewindowController)loader.getController();
            Connection c;
            Statement stmt;
            c = DriverManager.getConnection("jdbc:sqlite:mynewdb.sqlite");
            c.setAutoCommit(false);
     
            stmt = c.createStatement();
            try (ResultSet ra = stmt.executeQuery("SELECT NAME FROM USER WHERE USERNAME= " + "'" + username_box.getText() + "'" + " AND PASSWORD= " + "'" + password_box.getText() + "'")) 
            {
                String myname=ra.getString("NAME");
                hpc.getmyname(myname);
                Scene scene;
                scene = new Scene(root);
                primarystage.hide();
                primarystage.setScene(scene);
                primarystage.show();
            } 
            stmt.close();
        }
        else if(username_box.getText().length()!= 0 && password_box.getText().length()!= 0 && f!=3 )
        {   warning.setText("");
            username_box.clear();
            password_box.clear();
            invalid_label.setTextFill(Color.web("#FF0000"));
            invalid_label.setText("         Invalid credentials"); 
        }
        }
       }
    }
    
    private boolean isValidCredentials()
    {   
        boolean let_in = false;
        
        Connection c;
        Statement stmt;
        try
        {
            c = DriverManager.getConnection("jdbc:sqlite:mynewdb.sqlite");
            c.setAutoCommit(false);
           
            stmt = c.createStatement();
            try (ResultSet rs = stmt.executeQuery( "SELECT * FROM USER WHERE USERNAME= " + "'" + username_box.getText() + "'" + " AND PASSWORD= " + "'" + password_box.getText() + "'")) 
            {
                while ( rs.next() )
                {
                     if (rs.getString("USERNAME") != null && rs.getString("PASSWORD") != null)
                     {
                        String  username = rs.getString("USERNAME");
                        
                        String password = rs.getString("PASSWORD");
                        
                        let_in = true;
                     }  
                }
            }
            c.close();
         }
         catch ( Exception e ) 
         {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
         }
         return let_in;
        
    }
    
     private void isfakeaccess()
    {
        Connection c;
        Statement stmt;
        try
        {
            c = DriverManager.getConnection("jdbc:sqlite:mynewdb.sqlite");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            try (ResultSet rs = stmt.executeQuery( "SELECT USERNAME, PASSWORD FROM USER WHERE USERNAME= " + "'" + username_box.getText() + "'"))
            {
                while ( rs.next() )
                {
                     if (rs.getString("USERNAME") != null)
                     {
                        if(rs.getString("PASSWORD")!=password_box.getText())
                        f++;
                        if(f==3)
                        {
                                warning.setStyle("-fx-font-size:12;");
                                warning.setTextFill(Color.web("#FF0000"));
                                invalid_label.setStyle("-fx-font-size:12;");
                                invalid_label.setTextFill(Color.web("#FF0000"));
                                warning.setText("    User blocked for previous");
                                invalid_label.setText("       three wrong attempts"); 
                                blockeduser= username_box.getText();
                                newuserbutton.setVisible(true);
                                newuserbutton.setDisable(false);
                                username_box.setDisable(true);
                                password_box.setDisable(true);
                                aboutbutton.setDisable(true);
                                registerbutton.setDisable(true);
                                button.setDisable(true);
                        }
                     }  
                }
            }
            c.close();
         }
         catch ( Exception e ) 
         {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
         }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {}    
    
}
