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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SQLiteJDBC 
{
    public static String s=null;
    @FXML
    private TextField holdername;

    @FXML
     private TextField holderusername;
    @FXML
     private TextField useragain;
    @FXML
     private TextField mobile;
    
    @FXML
     private PasswordField holderpassword;

    @FXML
     private Label label1;

    @FXML
     private Label label2;

    @FXML
     private Label label3;

    @FXML
     private Label label4;
    
    @FXML
     private Label genderlabel;
    
    @FXML
    private Label label6;
    
    @FXML
    private Label label7;
    
    @FXML
     private Button regbutton;
    
    @FXML
     private Button valuekey;
    
    @FXML
    private RadioButton rb1;
    
    @FXML
    private RadioButton rb2;
    
    @FXML
    private ImageView opr;
    
    int i=0,o=0,h=0,ss=0;
    
    private boolean isValid()
    {
        boolean let_in = false;
        
        Connection c;
        Statement stmt;
        try
        {
            c = DriverManager.getConnection("jdbc:sqlite:mynewdb.sqlite");
            c.setAutoCommit(false);
           
            stmt = c.createStatement();
          
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM USER WHERE USERNAME= " + "'" + holderusername.getText() + "'")) 
            {
                while ( rs.next() )
                {
                     if (rs.getString("USERNAME") != null)
                     {
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
    
    @FXML
    private void value(ActionEvent event) throws IOException, ClassNotFoundException, SQLException
    {
        
         if(mobile.getText().matches("[7][2][9][3][0-9]{6}"))
         {
             h=1;ss=1;
         }
         else
                if(mobile.getText().matches("[7][4][0][3][0-9]{6}"))   
                    {
             h=1;ss=1;
         }
         else
                if(mobile.getText().matches("[8][9][0][7][0-9]{6}")){
             h=1;ss=1;
         }
         else      
                if(mobile.getText().matches("[9][8][0][9][0-9]{6}"))
                    {
             h=1;ss=1;
         }
         else
                if(mobile.getText().matches("[8][1][2][9][0-9]{6}"))
                    {
             h=1;ss=2;
         }
         else
                if(mobile.getText().matches("[9][5][6][7][0-9]{6}"))
                    {
             h=1;ss=2;
         }
         else
                if(mobile.getText().matches("[9][6][3][3][0-9]{6}"))
                    {
             h=1;ss=2;
         }
         else
                if(mobile.getText().matches("[9][7][4][6][0-9]{6}"))
                    {
             h=1;ss=2;
         }
         else
                if(mobile.getText().matches("[9][8][9][5][0-9]{6}"))
                    {
             h=1;ss=2;
         }
         else
                if(mobile.getText().matches("[9][9][9][5][0-9]{6}"))
                    {
             h=1;ss=2;
         }
         else
                if(mobile.getText().matches("[8][6][0][6][0-9]{6}"))
                    {
             h=1;ss=3;
         }
         else
                if(mobile.getText().matches("[9][5][2][6][0-9]{6}"))
                    {
             h=1;ss=3;
         }
         else
                if(mobile.getText().matches("[9][5][4][4][0-9]{6}"))
                    {
             h=1;ss=3;
         }
         else
                if(mobile.getText().matches("[9][5][6][2][0-9]{6}"))
                    {
             h=1;ss=3;
         }
         else
                if(mobile.getText().matches("[9][6][0][5][0-9]{6}"))
                    {
             h=1;ss=3;
         }
         else
                if(mobile.getText().matches("[9][6][5][6][0-9]{6}"))
                    {
             h=1;ss=3;
         }
         else
                if(mobile.getText().matches("[9][7][4][4][0-9]{6}"))
                    {
             h=1;ss=3;
         }
         else
                if(mobile.getText().matches("[9][7][4][7][0-9]{6}"))
                    {
             h=1;ss=3;
         }
         else
                if(mobile.getText().matches("[9][8][4][7][0-9]{6}"))
                    {
             h=1;ss=3;
         }
         else
                if(mobile.getText().matches("[9][9][4][7][0-9]{6}"))
                    {
             h=1;ss=3;
         }
         else
                if(mobile.getText().matches("[9][9][6][1][0-9]{6}"))
                    {
             h=1;ss=3;
         }
         else
                if(mobile.getText().matches("[8][2][8][1][0-9]{6}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[8][4][5][7][0-9]{6}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[8][5][4][7][0-9]{6}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[9][1][8][8][0-9]{6}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[9][4][0][0][0-9]{6}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[9][4][4][6][0-9]{6}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[9][4][4][7][0-9]{6}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[9][4][9][5][0-9]{6}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[9][4][9][6][0-9]{6}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[9][4][9][7][0-9]{6}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[8][2][8][9][8][0-9]{5}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[8][2][8][9][9][0-9]{5}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[8][3][0][1][0][0-9]{5}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[8][3][0][1][8][0-9]{5}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[8][3][0][1][9][0-9]{5}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[8][3][0][4][0][0-9]{5}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[8][3][0][4][8][0-9]{5}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[8][3][0][4][9][0-9]{5}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[8][3][3][0][0][0-9]{5}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[8][3][3][0][8][0-9]{5}"))
                    {
             h=1;ss=4;
         }
         else
                if(mobile.getText().matches("[9][1][4][2][0-9]{6}"))
                    {
             h=1;ss=5;
         }
         else
                if(mobile.getText().matches("[7][4][2][9][0-9]{6}"))
                    {
             h=1;ss=6;
         }
         else
                if(mobile.getText().matches("[9][3][4][9][0-9]{6}"))
                    {
             h=1;ss=6;
         }
         else
                if(mobile.getText().matches("[9][3][8][7][0-9]{6}"))
                    {
             h=1;ss=6;
         }
         else
                if(mobile.getText().matches("[9][3][8][8][0-9]{6}"))
                    {
             h=1;ss=6;
         }
         else
                if(mobile.getText().matches("[8][8][9][3][0-9]{6}"))
                    {
             h=1;ss=7;
         }
         else
                   
                if(mobile.getText().matches("[9][0][2][0][0-9]{6}"))
                    {
             h=1;ss=7;
         }
         else
                if(mobile.getText().matches("[8][5][9][0][0-9]{6}"))
                    {
             h=1;ss=7;
         }
         else
                    
                if(mobile.getText().matches("[9][2][4][9][0-9]{6}"))
                    {
             h=1;ss=8;
         }
         else
                if(mobile.getText().matches("[9][2][8][7][0-9]{6}"))
                    {
             h=1;ss=8;
         }
         else
                   
                if(mobile.getText().matches("[9][2][8][8][0-9]{6}"))
                    {
             h=1;ss=8;
         }
         else
                if(mobile.getText().matches("[7][7][3][6][0-9]{6}"))
                    {
             h=1;ss=9;
         }
         else
                if(mobile.getText().matches("[8][0][8][9][0-9]{6}"))
                    {
             h=1;ss=9;
         }
         else
                if(mobile.getText().matches("[8][7][1][4][0-9]{6}"))
                    {
             h=1;ss=9;
         }
         else
                if(mobile.getText().matches("[8][8][9][1][0-9]{6}"))
                    {
             h=1;ss=9;
         }
         else
                if(mobile.getText().matches("[9][0][3][7][0-9]{6}"))
                    {
             h=1;ss=9;
         }
         else
   
                if(mobile.getText().matches("[7][3][5][6][0-9]{6}"))
                    {
             h=1;ss=10;
         }
         else
                if(mobile.getText().matches("[9][0][7][2][0-9]{6}"))
                    {
             h=1;ss=10;
         }
         else
                if(mobile.getText().matches("[8][0][8][6][0-9]{6}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[8][9][4][3][0-9]{6}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[9][0][4][8][0-9]{6}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[9][5][3][9][0-9]{6}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[9][6][4][5][0-9]{6}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[9][7][4][5][0-9]{6}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[9][8][4][6][0-9]{6}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[9][9][4][6][0-9]{6}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[8][5][8][9][0][0-9]{5}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[8][5][8][9][8][0-9]{5}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[8][5][8][9][9][0-9]{5}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[8][5][9][2][0][0-9]{5}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[8][5][9][2][8][0-9]{5}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[8][5][9][2][9][0-9]{5}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[8][5][9][3][0][0-9]{5}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[8][5][9][3][8][0-9]{5}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[8][5][9][3][9][0-9]{5}"))
                    {
             h=1;ss=11;
         }
         else
                if(mobile.getText().matches("[8][5][9][4][0][0-9]{5}"))
                    {
             h=1;ss=11;
         }
          if (holdername.getText().length()==0 && holderusername.getText().length()==0 && holderpassword.getText().length()==0 && genderlabel.getText().length()==0 && mobile.getText().length()==0 )
          {
              label4.setText("");
              label1.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label3.setTextFill(Color.web("#FF0000"));
              label6.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label1.setText("Enter the name");
              label2.setText("Enter the username");
              label3.setText("Enter the password");
              label6.setText("Enter the gender");
              label7.setText("Enter the mobile number");
          }
          else
          if (holdername.getText().length()==0 && holderusername.getText().length()==0 && holderpassword.getText().length()==0 && genderlabel.getText().length()==0)
          {
              label4.setText("");
              label7.setText("");
              label1.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label3.setTextFill(Color.web("#FF0000"));
              label6.setTextFill(Color.web("#FF0000"));
              label1.setText("Enter the name");
              label2.setText("Enter the username");
              label3.setText("Enter the password");
              label6.setText("Enter the gender");   
          }
          else
          if (holdername.getText().length()==0 && holderusername.getText().length()==0 && holderpassword.getText().length()==0 && mobile.getText().length()==0 )
          {
              label4.setText("");
              label6.setText("");
              label1.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label3.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label1.setText("Enter the name");
              label2.setText("Enter the username");
              label3.setText("Enter the password");
              label7.setText("Enter the mobile number");
          }
          else
          if (holdername.getText().length()==0 && holderusername.getText().length()==0&& genderlabel.getText().length()==0 && mobile.getText().length()==0 )
          {
              label4.setText("");
              label3.setText("");
              label1.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label6.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label1.setText("Enter the name");
              label2.setText("Enter the username");
              label6.setText("Enter the gender");
              label7.setText("Enter the mobile number");
          }
          else
          if (holdername.getText().length()==0 && holderpassword.getText().length()==0 && genderlabel.getText().length()==0 && mobile.getText().length()==0 )
          {
              label4.setText("");
              label2.setText("");

              label1.setTextFill(Color.web("#FF0000"));
              label3.setTextFill(Color.web("#FF0000"));
              label6.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label1.setText("Enter the name");
              label3.setText("Enter the password");
              label6.setText("Enter the gender");
              label7.setText("Enter the mobile number");
          }
          else
          if (holderusername.getText().length()==0 && holderpassword.getText().length()==0 && genderlabel.getText().length()==0 && mobile.getText().length()==0 )
          {
              label4.setText("");
              label1.setText("");

              label2.setTextFill(Color.web("#FF0000"));
              label3.setTextFill(Color.web("#FF0000"));
              label6.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label2.setText("Enter the username");
              label3.setText("Enter the password");
              label6.setText("Enter the gender");
              label7.setText("Enter the mobile number");
          }
          else
          if (holdername.getText().length()==0 && holderusername.getText().length()==0 && holderpassword.getText().length()==0 )
          {
              label4.setText("");
              label6.setText("");
              label7.setText("");
              label1.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label3.setTextFill(Color.web("#FF0000"));
              label1.setText("Enter the name");
              label2.setText("Enter the username");
              label3.setText("Enter the password");
          }
          else
          if (holderusername.getText().length()==0 && holderpassword.getText().length()==0 && genderlabel.getText().length()==0 )
          {
              label4.setText("");
              label1.setText("");
              label7.setText("");
              label6.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label3.setTextFill(Color.web("#FF0000"));
              label2.setText("Enter the username");
              label3.setText("Enter the password");
              label6.setText("Select the gender");
          }
          else
          if (genderlabel.getText().length()==0 && mobile.getText().length()==0 && holderpassword.getText().length()==0 )
          {
              label4.setText("");
              label1.setText("");
              label2.setText("");
              label7.setTextFill(Color.web("#FF0000"));
              label6.setTextFill(Color.web("#FF0000"));
              label3.setTextFill(Color.web("#FF0000"));
              label7.setText("Enter the mobile number");
              label6.setText("Select the gender");
              label3.setText("Enter the password");
          }
          else
          if (genderlabel.getText().length()==0 && holderusername.getText().length()==0 && holdername.getText().length()==0 )
          {
              label4.setText("");
              label3.setText("");
              label7.setText("");
              label1.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label6.setTextFill(Color.web("#FF0000"));
              label1.setText("Enter the name");
              label2.setText("Enter the username");
              label6.setText("Select the gender");
          }
          else
          if (mobile.getText().length()==0 && holderusername.getText().length()==0 && holdername.getText().length()==0 )
          {
              label4.setText("");
              label6.setText("");
              label3.setText("");
              label1.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label1.setText("Enter the name");
              label2.setText("Enter the username");
              label7.setText("Enter the mobile number");
          }
          else
          if (genderlabel.getText().length()==0 && holderusername.getText().length()==0 && mobile.getText().length()==0 )
          {
              label4.setText("");
              label1.setText("");
              label3.setText("");
              label6.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label6.setText("Select the gender");
              label2.setText("Enter the username");
              label7.setText("Enter the mobile number");
          }
          else
          if (genderlabel.getText().length()==0 && holdername.getText().length()==0 && mobile.getText().length()==0 )
          {
              label4.setText("");
              label3.setText("");
              label2.setText("");
              label6.setTextFill(Color.web("#FF0000"));
              label1.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label6.setText("Select the gender");
              label1.setText("Enter the name");
              label7.setText("Enter the mobile number");
          }
          else
          if (holderpassword.getText().length()==0 && holdername.getText().length()==0 && mobile.getText().length()==0 )
          {
              label4.setText("");
              label6.setText("");
              label2.setText("");
              label3.setTextFill(Color.web("#FF0000"));
              label1.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label3.setText("Enter the password");
              label1.setText("Enter the name");
              label7.setText("Enter the mobile number");
          }
          else
          if (holderpassword.getText().length()==0 && holdername.getText().length()==0 && genderlabel.getText().length()==0 )
          {
              label4.setText("");
              label2.setText("");
              label7.setText("");
              label3.setTextFill(Color.web("#FF0000"));
              label1.setTextFill(Color.web("#FF0000"));
              label6.setTextFill(Color.web("#FF0000"));
              label3.setText("Enter the password");
              label1.setText("Enter the name");
              label6.setText("Select the gender");
          }
          else
          if (holderpassword.getText().length()==0 && holderusername.getText().length()==0 && mobile.getText().length()==0 )
          {
              label1.setText("");
              label6.setText("");
              label4.setText("");
              label3.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label3.setText("Enter the password");
              label2.setText("Enter the username");
              label7.setText("Enter the mobile number");
          }
          else
          if (holdername.getText().length()==0 && holderusername.getText().length()==0  )
          {
            label3.setText("");
            label4.setText("");
            label7.setText("");
            label6.setText("");
            label1.setTextFill(Color.web("#FF0000"));
            label2.setTextFill(Color.web("#FF0000"));
            label1.setText("Enter the name");
            label2.setText("Enter the username");
          }
          else
          if (holderusername.getText().length()==0 && holderpassword.getText().length()==0  )
          {
            label1.setText("");
            label4.setText("");
            label7.setText("");
            label6.setText("");
            label2.setTextFill(Color.web("#FF0000"));
            label3.setTextFill(Color.web("#FF0000"));
            label2.setText("Enter the username");
            label3.setText("Enter the password");
          }  
          else
          if (holdername.getText().length()==0 && holderpassword.getText().length()==0  )
          {
            label2.setText("");
            label4.setText("");
            label7.setText("");
            label6.setText("");
            label1.setTextFill(Color.web("#FF0000"));
            label3.setTextFill(Color.web("#FF0000"));
            label1.setText("Enter the name");
            label3.setText("Enter the password");
          }
          else
          if (genderlabel.getText().length()==0 && holderpassword.getText().length()==0  )
          {
            label2.setText("");
            label4.setText("");
            label1.setText("");
            label7.setText("");
            label6.setTextFill(Color.web("#FF0000"));
            label3.setTextFill(Color.web("#FF0000"));
            label6.setText("Select the gender");
            label3.setText("Enter the password");
          }
          else
          if (genderlabel.getText().length()==0 && mobile.getText().length()==0  )
          {
            label2.setText("");
            label4.setText("");
            label3.setText("");
            label1.setText("");
            label7.setTextFill(Color.web("#FF0000"));
            label6.setTextFill(Color.web("#FF0000"));
            label6.setText("Select the gender");
            label7.setText("Enter the mobile number");
          }
          else
          if (genderlabel.getText().length()==0 && holderusername.getText().length()==0  )
          {
            label7.setText("");
            label4.setText("");
            label3.setText("");
            label1.setText("");
            label2.setTextFill(Color.web("#FF0000"));
            label6.setTextFill(Color.web("#FF0000"));
            label6.setText("Select the gender");
            label2.setText("Enter the username");
          }
          else
          if (holderpassword.getText().length()==0 && mobile.getText().length()==0  )
          {
            label2.setText("");
            label4.setText("");
            label6.setText("");
            label1.setText("");
            label3.setTextFill(Color.web("#FF0000"));
            label7.setTextFill(Color.web("#FF0000"));
            label3.setText("Enter the password");
            label7.setText("Enter the mobile number");
          }
          else
          if (holdername.getText().length()==0 && genderlabel.getText().length()==0  )
          {
            label2.setText("");
            label4.setText("");
            label7.setText("");
            label3.setText("");
            label1.setTextFill(Color.web("#FF0000"));
            label6.setTextFill(Color.web("#FF0000"));
            label1.setText("Enter the name");
            label6.setText("Select the gender");
          }
          else
          if (holderusername.getText().length()==0 && mobile.getText().length()==0  )
          {
            label6.setText("");
            label4.setText("");
            label1.setText("");
            label3.setText("");
            label2.setTextFill(Color.web("#FF0000"));
            label7.setTextFill(Color.web("#FF0000"));
            label2.setText("Enter the username");
            label7.setText("Enter the mobile number");
          }
          else
          if (holdername.getText().length()==0 && mobile.getText().length()==0  )
          {
            label6.setText("");
            label4.setText("");
            label2.setText("");
            label3.setText("");
            label1.setTextFill(Color.web("#FF0000"));
            label7.setTextFill(Color.web("#FF0000"));
            label1.setText("Enter the name");
            label7.setText("Enter the mobile number");
          }
          else
          if (holdername.getText().length()==0)
          {
            label7.setText("");
            label6.setText("");
            label4.setText("");
            label2.setText("");
            label3.setText("");
            label1.setTextFill(Color.web("#FF0000"));
            label1.setText("Enter the name");
          }
          else
          if (holderusername.getText().length()==0)
          {
            label7.setText("");
            label6.setText("");
            label4.setText("");
            label1.setText("");
            label3.setText("");
            label2.setTextFill(Color.web("#FF0000"));
            label2.setText("Enter the username");
          }
          else
          if (holderpassword.getText().length()==0)
          {
            label7.setText("");
            label6.setText("");
            label4.setText("");
            label1.setText("");
            label2.setText("");
            label3.setTextFill(Color.web("#FF0000"));
            label3.setText("Enter the password");
          }
          else
          if (genderlabel.getText().length()==0)
          {
            label7.setText("");
            label3.setText("");
            label4.setText("");
            label1.setText("");
            label2.setText("");
            label6.setTextFill(Color.web("#FF0000"));
            label6.setText("Select the gender");
          }
          else
          if (mobile.getText().length()==0)
          {
            label6.setText("");
            label3.setText("");
            label4.setText("");
            label1.setText("");
            label2.setText("");
            label7.setTextFill(Color.web("#FF0000"));
            label7.setText("Enter the mobile number");
          }
          else
          if((holdername.getText().length()>10)||(holderusername.getText().length()>8))
          {   
            label4.setTextFill(Color.web("#FF0000"));
            label4.setStyle("-fx-font-size:15;");
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label6.setText("");
            label7.setText("");
            label4.setText("Check the sizes of name or username fields");
          }
          else
          if(!holderpassword.getText().matches("[0-9]*"))
          { 
            label4.setTextFill(Color.web("#FF0000"));
            label4.setStyle("-fx-font-size:15;");  
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label6.setText("");
            label7.setText("");
            label4.setText("PIN should be not contain letters or symbols");
          } 
          else
          if(holderpassword.getText().length()!=4)
          {   
            label4.setStyle("-fx-font-size:15;");
            label4.setTextFill(Color.web("#FF0000"));
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label6.setText("");
            label7.setText("");
            label4.setText("Check the size of PIN number again");
          }
          else
          if(genderlabel.getText().length()==0)
          {
            label4.setStyle("-fx-font-size:17;");
            label4.setTextFill(Color.web("#FF0000"));
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label6.setText("");
            label7.setText("");
            label4.setText("Please select your gender");
          }
          else
          if(mobile.getText().length()==0)
          {
            label4.setStyle("-fx-font-size:15;");
            label4.setTextFill(Color.web("#FF0000"));
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label6.setText("");
            label7.setText("");
            label4.setText("Please enter your mobile number");
          }   
          else
          if(!mobile.getText().matches("[0-9]{10}"))
          {
            label4.setStyle("-fx-font-size:15;");
            label4.setTextFill(Color.web("#FF0000"));
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label6.setText("");
            label7.setText("");
            label4.setText("Ensure your mobile number is 10 digits");
          } 
          else
          if(!mobile.getText().matches("[0-9]*"))
          { 
            label4.setTextFill(Color.web("#FF0000"));
            label4.setStyle("-fx-font-size:12;");  
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label6.setText("");
            label7.setText("");
            label4.setText("Mobile number should not contain letters or symbols");    
          }
          else
          if(h==0)
          {
            label4.setTextFill(Color.web("#FF0000"));
            label4.setStyle("-fx-font-size:12;");  
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label6.setText("");
            label7.setText("");
            label4.setText("The mobile number does not exist in India");  
          }
          else 
          if(isValid())
          {
                label4.setStyle("-fx-font-size:20;");
                label4.setTextFill(Color.web("#FF0000"));
                label1.setText("");
                label2.setText("");
                label3.setText("");
                label4.setText("USERNAME ALREADY IN DB");
                regbutton.setDisable(true);
                i=1;
          }
          else
          {     
                if(ss==1)
                {
                     File file = new File("operators\\aircel.jpg");
                     Image image = new Image(file.toURI().toString());
                     //opr = new ImageView(image);
                     opr.setImage(image);
                }
                if(ss==2)
                {
                     File file = new File("operators\\airtel.jpg");
                     Image image = new Image(file.toURI().toString());
                     //opr = new ImageView(image);
                     opr.setImage(image);
                }
                if(ss==3)
                {
                     File file = new File("operators\\idea.jpg");
                     Image image = new Image(file.toURI().toString());
                     //opr = new ImageView(image);
                     opr.setImage(image);
                }
                if(ss==4)
                {
                     File file = new File("operators\\bsnl.jpg");
                     Image image = new Image(file.toURI().toString());
                     //opr = new ImageView(image);
                     opr.setImage(image);
                }
                if(ss==5)
                {
                     File file = new File("operators\\mts.jpg");
                     Image image = new Image(file.toURI().toString());
                    // opr = new ImageView(image);
                     opr.setImage(image);
                }
                if(ss==6)
                {
                     File file = new File("operators\\rcdma.jpg");
                     Image image = new Image(file.toURI().toString());
                     //opr = new ImageView(image);
                     opr.setImage(image);
                }
                if(ss==7)
                {
                     File file = new File("operators\\rgsm.jpg");
                     Image image = new Image(file.toURI().toString());
                     //opr = new ImageView(image);
                     opr.setImage(image);
                }
                if(ss==8)
                {
                     File file = new File("operators\\tata.jpg");
                     Image image = new Image(file.toURI().toString());
                     //ImageView opr = new ImageView(image);
                     opr.setImage(image);
                }
                if(ss==9)
                {
                     File file = new File("operators\\tata2.jpg");
                     Image image = new Image(file.toURI().toString());
                     //opr = new ImageView(image);
                     opr.setImage(image);
                }
                if(ss==10)
                {
                     File file = new File("operators\\vid.jpg");
                     Image image = new Image(file.toURI().toString());
                     //opr = new ImageView(image);
                     opr.setImage(image);
                }
                if(ss==11)
                {
                     File file = new File("operators\\voda.jpg");
                     Image image = new Image(file.toURI().toString());
                     //opr = new ImageView(image);
                     opr.setImage(image);
                }
                label4.setStyle("-fx-font-size:14;");
                label4.setTextFill(Color.web("#008000"));
                label1.setText("");
                label2.setText("");
                label3.setText("");
                label4.setText("NOT IN DB, YOU CAN NOW COMPLETE PART 1");
                regbutton.setDisable(false);
                holderusername.setDisable(true);
                mobile.setDisable(true);
                holderpassword.setDisable(true);
                holdername.setDisable(true);
                rb1.setDisable(true);
                rb2.setDisable(true);
                valuekey.setDisable(true);
                
                i=2;
          }
     
      }
    
    @FXML      
    private void rbuttn(ActionEvent event) throws IOException 
    {
        String message="";
        if(rb1.isSelected())
        {
            message+= rb1.getText()+"\n";
        }
        if(rb2.isSelected())
        {
            message+= rb2.getText()+"\n";
        }
        //genderlabel.setTextFill(Color.web("#08000"));
        genderlabel.setText(message);
    }
    
    @FXML      
    private void reg(ActionEvent event) throws IOException 
    {  
        if (holdername.getText().length()==0 && holderusername.getText().length()==0 && holderpassword.getText().length()==0 && genderlabel.getText().length()==0 && mobile.getText().length()==0 )
          {
              label4.setText("");
              label1.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label3.setTextFill(Color.web("#FF0000"));
              label6.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label1.setText("Enter the name");
              label2.setText("Enter the username");
              label3.setText("Enter the password");
              label6.setText("Enter the gender");
              label7.setText("Enter the mobile number");
          }
          else
          if (holdername.getText().length()==0 && holderusername.getText().length()==0 && holderpassword.getText().length()==0 && genderlabel.getText().length()==0)
          {
              label4.setText("");
              label7.setText("");
              label1.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label3.setTextFill(Color.web("#FF0000"));
              label6.setTextFill(Color.web("#FF0000"));
              label1.setText("Enter the name");
              label2.setText("Enter the username");
              label3.setText("Enter the password");
              label6.setText("Enter the gender");   
          }
          else
          if (holdername.getText().length()==0 && holderusername.getText().length()==0 && holderpassword.getText().length()==0 && mobile.getText().length()==0 )
          {
              label4.setText("");
              label6.setText("");
              label1.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label3.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label1.setText("Enter the name");
              label2.setText("Enter the username");
              label3.setText("Enter the password");
              label7.setText("Enter the mobile number");
          }
          else
          if (holdername.getText().length()==0 && holderusername.getText().length()==0&& genderlabel.getText().length()==0 && mobile.getText().length()==0 )
          {
              label4.setText("");
              label3.setText("");
              label1.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label6.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label1.setText("Enter the name");
              label2.setText("Enter the username");
              label6.setText("Enter the gender");
              label7.setText("Enter the mobile number");
          }
          else
          if (holdername.getText().length()==0 && holderpassword.getText().length()==0 && genderlabel.getText().length()==0 && mobile.getText().length()==0 )
          {
              label4.setText("");
              label2.setText("");

              label1.setTextFill(Color.web("#FF0000"));
              label3.setTextFill(Color.web("#FF0000"));
              label6.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label1.setText("Enter the name");
              label3.setText("Enter the password");
              label6.setText("Enter the gender");
              label7.setText("Enter the mobile number");
          }
          else
          if (holderusername.getText().length()==0 && holderpassword.getText().length()==0 && genderlabel.getText().length()==0 && mobile.getText().length()==0 )
          {
              label4.setText("");
              label1.setText("");

              label2.setTextFill(Color.web("#FF0000"));
              label3.setTextFill(Color.web("#FF0000"));
              label6.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label2.setText("Enter the username");
              label3.setText("Enter the password");
              label6.setText("Enter the gender");
              label7.setText("Enter the mobile number");
          }
          else
          if (holdername.getText().length()==0 && holderusername.getText().length()==0 && holderpassword.getText().length()==0 )
          {
              label4.setText("");
              label6.setText("");
              label7.setText("");
              label1.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label3.setTextFill(Color.web("#FF0000"));
              label1.setText("Enter the name");
              label2.setText("Enter the username");
              label3.setText("Enter the password");
          }
          else
          if (holderusername.getText().length()==0 && holderpassword.getText().length()==0 && genderlabel.getText().length()==0 )
          {
              label4.setText("");
              label1.setText("");
              label7.setText("");
              label6.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label3.setTextFill(Color.web("#FF0000"));
              label2.setText("Enter the username");
              label3.setText("Enter the password");
              label6.setText("Select the gender");
          }
          else
          if (genderlabel.getText().length()==0 && mobile.getText().length()==0 && holderpassword.getText().length()==0 )
          {
              label4.setText("");
              label1.setText("");
              label2.setText("");
              label7.setTextFill(Color.web("#FF0000"));
              label6.setTextFill(Color.web("#FF0000"));
              label3.setTextFill(Color.web("#FF0000"));
              label7.setText("Enter the mobile number");
              label6.setText("Select the gender");
              label3.setText("Enter the password");
          }
          else
          if (genderlabel.getText().length()==0 && holderusername.getText().length()==0 && holdername.getText().length()==0 )
          {
              label4.setText("");
              label3.setText("");
              label7.setText("");
              label1.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label6.setTextFill(Color.web("#FF0000"));
              label1.setText("Enter the name");
              label2.setText("Enter the username");
              label6.setText("Select the gender");
          }
          else
          if (mobile.getText().length()==0 && holderusername.getText().length()==0 && holdername.getText().length()==0 )
          {
              label4.setText("");
              label6.setText("");
              label3.setText("");
              label1.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label1.setText("Enter the name");
              label2.setText("Enter the username");
              label7.setText("Enter the mobile number");
          }
          else
          if (genderlabel.getText().length()==0 && holderusername.getText().length()==0 && mobile.getText().length()==0 )
          {
              label4.setText("");
              label1.setText("");
              label3.setText("");
              label6.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label6.setText("Select the gender");
              label2.setText("Enter the username");
              label7.setText("Enter the mobile number");
          }
          else
          if (genderlabel.getText().length()==0 && holdername.getText().length()==0 && mobile.getText().length()==0 )
          {
              label4.setText("");
              label3.setText("");
              label2.setText("");
              label6.setTextFill(Color.web("#FF0000"));
              label1.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label6.setText("Select the gender");
              label1.setText("Enter the name");
              label7.setText("Enter the mobile number");
          }
          else
          if (holderpassword.getText().length()==0 && holdername.getText().length()==0 && mobile.getText().length()==0 )
          {
              label4.setText("");
              label6.setText("");
              label2.setText("");
              label3.setTextFill(Color.web("#FF0000"));
              label1.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label3.setText("Enter the password");
              label1.setText("Enter the name");
              label7.setText("Enter the mobile number");
          }
          else
          if (holderpassword.getText().length()==0 && holdername.getText().length()==0 && genderlabel.getText().length()==0 )
          {
              label4.setText("");
              label2.setText("");
              label7.setText("");
              label3.setTextFill(Color.web("#FF0000"));
              label1.setTextFill(Color.web("#FF0000"));
              label6.setTextFill(Color.web("#FF0000"));
              label3.setText("Enter the password");
              label1.setText("Enter the name");
              label6.setText("Select the gender");
          }
          else
          if (holderpassword.getText().length()==0 && holderusername.getText().length()==0 && mobile.getText().length()==0 )
          {
              label1.setText("");
              label6.setText("");
              label4.setText("");
              label3.setTextFill(Color.web("#FF0000"));
              label2.setTextFill(Color.web("#FF0000"));
              label7.setTextFill(Color.web("#FF0000"));
              label3.setText("Enter the password");
              label2.setText("Enter the username");
              label7.setText("Enter the mobile number");
          }
          else
          if (holdername.getText().length()==0 && holderusername.getText().length()==0  )
          {
            label3.setText("");
            label4.setText("");
            label7.setText("");
            label6.setText("");
            label1.setTextFill(Color.web("#FF0000"));
            label2.setTextFill(Color.web("#FF0000"));
            label1.setText("Enter the name");
            label2.setText("Enter the username");
          }
          else
          if (holderusername.getText().length()==0 && holderpassword.getText().length()==0  )
          {
            label1.setText("");
            label4.setText("");
            label7.setText("");
            label6.setText("");
            label2.setTextFill(Color.web("#FF0000"));
            label3.setTextFill(Color.web("#FF0000"));
            label2.setText("Enter the username");
            label3.setText("Enter the password");
          }  
          else
          if (holdername.getText().length()==0 && holderpassword.getText().length()==0  )
          {
            label2.setText("");
            label4.setText("");
            label7.setText("");
            label6.setText("");
            label1.setTextFill(Color.web("#FF0000"));
            label3.setTextFill(Color.web("#FF0000"));
            label1.setText("Enter the name");
            label3.setText("Enter the password");
          }
          else
          if (genderlabel.getText().length()==0 && holderpassword.getText().length()==0  )
          {
            label2.setText("");
            label4.setText("");
            label1.setText("");
            label7.setText("");
            label6.setTextFill(Color.web("#FF0000"));
            label3.setTextFill(Color.web("#FF0000"));
            label6.setText("Select the gender");
            label3.setText("Enter the password");
          }
          else
          if (genderlabel.getText().length()==0 && mobile.getText().length()==0  )
          {
            label2.setText("");
            label4.setText("");
            label3.setText("");
            label1.setText("");
            label7.setTextFill(Color.web("#FF0000"));
            label6.setTextFill(Color.web("#FF0000"));
            label6.setText("Select the gender");
            label7.setText("Enter the mobile number");
          }
          else
          if (genderlabel.getText().length()==0 && holderusername.getText().length()==0  )
          {
            label7.setText("");
            label4.setText("");
            label3.setText("");
            label1.setText("");
            label2.setTextFill(Color.web("#FF0000"));
            label6.setTextFill(Color.web("#FF0000"));
            label6.setText("Select the gender");
            label2.setText("Enter the username");
          }
          else
          if (holderpassword.getText().length()==0 && mobile.getText().length()==0  )
          {
            label2.setText("");
            label4.setText("");
            label6.setText("");
            label1.setText("");
            label3.setTextFill(Color.web("#FF0000"));
            label7.setTextFill(Color.web("#FF0000"));
            label3.setText("Enter the password");
            label7.setText("Enter the mobile number");
          }
          else
          if (holdername.getText().length()==0 && genderlabel.getText().length()==0  )
          {
            label2.setText("");
            label4.setText("");
            label7.setText("");
            label3.setText("");
            label1.setTextFill(Color.web("#FF0000"));
            label6.setTextFill(Color.web("#FF0000"));
            label1.setText("Enter the name");
            label6.setText("Select the gender");
          }
          else
          if (holderusername.getText().length()==0 && mobile.getText().length()==0  )
          {
            label6.setText("");
            label4.setText("");
            label1.setText("");
            label3.setText("");
            label2.setTextFill(Color.web("#FF0000"));
            label7.setTextFill(Color.web("#FF0000"));
            label2.setText("Enter the username");
            label7.setText("Enter the mobile number");
          }
          else
          if (holdername.getText().length()==0 && mobile.getText().length()==0  )
          {
            label6.setText("");
            label4.setText("");
            label2.setText("");
            label3.setText("");
            label1.setTextFill(Color.web("#FF0000"));
            label7.setTextFill(Color.web("#FF0000"));
            label1.setText("Enter the name");
            label7.setText("Enter the mobile number");
          }
          else
          if (holdername.getText().length()==0)
          {
            label7.setText("");
            label6.setText("");
            label4.setText("");
            label2.setText("");
            label3.setText("");
            label1.setTextFill(Color.web("#FF0000"));
            label1.setText("Enter the name");
          }
          else
          if (holderusername.getText().length()==0)
          {
            label7.setText("");
            label6.setText("");
            label4.setText("");
            label1.setText("");
            label3.setText("");
            label2.setTextFill(Color.web("#FF0000"));
            label2.setText("Enter the username");
          }
          else
          if (holderpassword.getText().length()==0)
          {
            label7.setText("");
            label6.setText("");
            label4.setText("");
            label1.setText("");
            label2.setText("");
            label3.setTextFill(Color.web("#FF0000"));
            label3.setText("Enter the password");
          }
          else
          if (genderlabel.getText().length()==0)
          {
            label7.setText("");
            label3.setText("");
            label4.setText("");
            label1.setText("");
            label2.setText("");
            label6.setTextFill(Color.web("#FF0000"));
            label6.setText("Select the gender");
          }
          else
          if (mobile.getText().length()==0)
          {
            label6.setText("");
            label3.setText("");
            label4.setText("");
            label1.setText("");
            label2.setText("");
            label7.setTextFill(Color.web("#FF0000"));
            label7.setText("Enter the mobile number");
          }
          else
          if((holdername.getText().length()>10)||(holderusername.getText().length()>8))
          {   
            label4.setTextFill(Color.web("#FF0000"));
            label4.setStyle("-fx-font-size:15;");
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label6.setText("");
            label7.setText("");
            label4.setText("Check the sizes of name or username fields");
          }
          else
          if(!holderpassword.getText().matches("[0-9]*"))
          { 
            label4.setTextFill(Color.web("#FF0000"));
            label4.setStyle("-fx-font-size:15;");  
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label6.setText("");
            label7.setText("");
            label4.setText("PIN should be not contain letters or symbols");
          } 
          else
          if(holderpassword.getText().length()!=4)
          {   
            label4.setStyle("-fx-font-size:15;");
            label4.setTextFill(Color.web("#FF0000"));
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label6.setText("");
            label7.setText("");
            label4.setText("Check the size of PIN number again");
          }
          else
          if(genderlabel.getText().length()==0)
          {
            label4.setStyle("-fx-font-size:17;");
            label4.setTextFill(Color.web("#FF0000"));
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label6.setText("");
            label7.setText("");
            label4.setText("Please select your gender");
          }
          else
          if(mobile.getText().length()==0)
          {
            label4.setStyle("-fx-font-size:15;");
            label4.setTextFill(Color.web("#FF0000"));
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label6.setText("");
            label7.setText("");
            label4.setText("Please enter your mobile number");
          }   
          else
          if(!mobile.getText().matches("[0-9]{10}"))
          {
            label4.setStyle("-fx-font-size:15;");
            label4.setTextFill(Color.web("#FF0000"));
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label6.setText("");
            label7.setText("");
            label4.setText("Ensure your mobile number is 10 digits");
          } 
          else
          if(!mobile.getText().matches("[0-9]*"))
          { 
            label4.setTextFill(Color.web("#FF0000"));
            label4.setStyle("-fx-font-size:15;");  
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label6.setText("");
            label7.setText("");
            label4.setText("Mobile number should not contain letters or symbols");    
          }
        else 
        if(i==0)
        {
            label4.setStyle("-fx-font-size:20;");
            label4.setTextFill(Color.web("#FF0000"));
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label6.setText("");
            label7.setText("");
            label4.setText("VALIDATE FIRST");
        }
        else
        if((holdername.getText().length()<=10)&&(holderusername.getText().length()<=8)&&(holderpassword.getText().length()==4)&&(mobile.getText().length()==10)&&(i==2))
        {   o=1;
            label4.setText("");
            holdername.setText(holdername.getText().toUpperCase());
            Connection c;
            Statement stmt;
            try 
            {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:mynewdb.sqlite");
                c.setAutoCommit(false);
                
                stmt = c.createStatement();
                String aa=holdername.getText();
                String bb=holderusername.getText();
                String cc=holderpassword.getText();
                String dd=genderlabel.getText();
                String ee=mobile.getText();
                String sql = "INSERT INTO USER (NAME,USERNAME,PASSWORD,GENDER,MOBILE)" +"VALUES('"+aa+"','"+bb+"','"+cc+"','"+dd+"','"+ee+"')"; 
                stmt.executeUpdate(sql);
                holdername.clear();
                holderusername.clear();
                holderpassword.clear();
                stmt.close();
                c.commit();
                c.close();
            } 
            catch ( ClassNotFoundException | SQLException e ) 
            {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
            }
           
            label4.setStyle("-fx-font-size:12;");
            label4.setTextFill(Color.web("#008000"));
            label1.setText("");
            label2.setText("");
            label3.setText("");
            label4.setText("PART 1 COMPLETED SUCCESSFULLY, GO TO PART 2 NOW");
            regbutton.setDisable(true);
            holderusername.setDisable(true);
        }  
    } 

    @FXML
    private void backi(ActionEvent event) throws IOException
    {
        Parent backipageparent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene backipagescene = new Scene(backipageparent);
        Stage backistage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        backistage.hide();
        backistage.setScene(backipagescene);
        backistage.show(); 
    }
    
     
   @FXML
    private void part2(ActionEvent event) throws IOException 
    {   
        
        s=useragain.getText();
        if("".equals(s)){
        label4.setTextFill(Color.web("#FF0000"));
        label4.setStyle("-fx-font-size:20;");
        label4.setText("Ensure to enter username again");}
        else
        {
        
        if(o==0)
        {       
                label4.setStyle("-fx-font-size:20");
                label4.setTextFill(Color.web("#FF0000"));
                label4.setText("COMPLETE PART 1 FIRST");
        }
        else
        {
                Parent backipageparent = FXMLLoader.load(getClass().getResource("imagewindow.fxml"));
                Scene backipagescene = new Scene(backipageparent);
                Stage backistage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                backistage.hide();
                backistage.setScene(backipagescene);
                backistage.show(); 
        }
        }
    }
        
    
    public void initialize(URL url, ResourceBundle rb) {}
      
}
