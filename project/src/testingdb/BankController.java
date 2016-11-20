
/* AKHIL SREELAKAM */
package testingdb;

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
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BankController implements Initializable {
    
    @FXML
    private Label facerate;
    
    @FXML
    private Label fingerrate;
    
    @FXML
    private Label irisrate;
    
    @FXML
    private Label f1;
    
    @FXML
    private Label f2;
    
    @FXML
    private Label f3;
    
    @FXML
    private Label f4;
    
    @FXML 
    private Button statb;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {}   
    
    public void myfn()
    {
       statb.setVisible(false);
       facerate.setVisible(false);
       fingerrate.setVisible(false);
       irisrate.setVisible(false);
       f1.setVisible(false);
       f2.setVisible(false);
       f3.setVisible(false);
       f4.setVisible(false);   
    }
    public void sff(double facepercentage, double fingerpercentage, double irispercentage)
    {    
        facerate.setTextFill(Color.web("#008000"));
        facerate.setText(facepercentage+"%");
        fingerrate.setTextFill(Color.web("#008000"));
        fingerrate.setText(fingerpercentage+"%");
        irisrate.setTextFill(Color.web("#008000"));
        irisrate.setText(irispercentage+"%"); 
    }

    @FXML
    private void signout(ActionEvent event) throws IOException
    {
        Parent aboutpageparent = FXMLLoader.load(getClass().getResource("signoutwindow.fxml"));
        Scene aboutpagescene = new Scene(aboutpageparent);
        Stage aboutstage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        aboutstage.hide();
        aboutstage.setScene(aboutpagescene);
        aboutstage.show(); 
    }
    
    @FXML
    private void showstatistics(ActionEvent event)
    {
         facerate.setVisible(true);
         fingerrate.setVisible(true);
         irisrate.setVisible(true);
         f1.setVisible(true);
         f2.setVisible(true);
         f3.setVisible(true);
         f4.setVisible(true);
         
    }
    
}
