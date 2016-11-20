/*AKHIL SREELAKAM*/

package testingdb;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class testingdb extends Application 
{
    
    @Override
    public void start(Stage stage) throws Exception
    {
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            stage.getIcons().add(new Image("file:icons/java.png"));
            Scene scene_login = new Scene(root);
            stage.setResizable(false);
            stage.setScene(scene_login);
            stage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
