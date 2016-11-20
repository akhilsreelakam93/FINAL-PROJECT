/*AKHIL SREELAKAM*/
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
import javafx.stage.Stage;

public class SignoutwindowController implements Initializable 
{
  
        
        @FXML
        private void tofirstpage(ActionEvent event) throws IOException
        {
            Stage aboutstage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader= new FXMLLoader();
            Parent root = loader.load(getClass().getResource("FXMLDocument.fxml").openStream());
            FXMLDocumentController myob= (FXMLDocumentController)loader.getController();
            int jj=1;
            myob.logoutmessage(jj);
            Scene scene;
            scene= new Scene(root);  
            aboutstage.hide();
            aboutstage.setScene(scene);
            aboutstage.show();
       
        }
        
        @FXML
        private void tosamepage(ActionEvent event) throws IOException 
        {
            Stage primarystage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader= new FXMLLoader();
            Parent root = loader.load(getClass().getResource("bank.fxml").openStream());
            BankController hpp= (BankController)loader.getController();
            hpp.myfn();
            Scene scene;
            scene = new Scene(root);
            primarystage.hide();
            primarystage.setScene(scene);
            primarystage.show();
        } 
    
        @Override
        public void initialize(URL url, ResourceBundle rb) {}    
    
}
