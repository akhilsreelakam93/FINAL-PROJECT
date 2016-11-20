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
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SorryController implements Initializable {
    
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {}   
    
    public void sfn(double facepercentage, double fingerpercentage, double irispercentage)
    {    
        if( facepercentage>=0 && facepercentage<=100)
           {
               if(facepercentage>=40)
               {
                    facerate.setTextFill(Color.web("#008000"));
                    facerate.setText(facepercentage+"%"); 
               }
               else
               {
                    facerate.setTextFill(Color.web("#FF0000"));
                    facerate.setText(facepercentage+"%");
               }
           }
           else
           {
               facerate.setTextFill(Color.web("#FF0000"));
               facerate.setText("VERY LARGE MISMATCH");
           }
           if( fingerpercentage>=0 && fingerpercentage<=100)
           {
               if(fingerpercentage>=90)
               {
                    fingerrate.setTextFill(Color.web("#008000"));
                    fingerrate.setText(fingerpercentage+"%"); 
               }
               else
               {
                    fingerrate.setTextFill(Color.web("#FF0000"));
                    fingerrate.setText(fingerpercentage+"%");
               }
           }
           else
           {
               fingerrate.setTextFill(Color.web("#FF0000"));
               fingerrate.setText("VERY LARGE MISMATCH");
           }
           if( irispercentage>=0 && irispercentage<=100)
           {
               if(irispercentage>=90)
               {
                    irisrate.setTextFill(Color.web("#008000"));
                    irisrate.setText(irispercentage+"%"); 
               }
               else
               {
                    irisrate.setTextFill(Color.web("#FF0000"));
                    irisrate.setText(irispercentage+"%"); 
               }
           }
           else
           {
               irisrate.setTextFill(Color.web("#FF0000"));
               irisrate.setText("VERY LARGE MISMATCH");
           }
    }

    @FXML
    private void loo(ActionEvent event) throws IOException
    {
        Parent aboutpageparent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
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
