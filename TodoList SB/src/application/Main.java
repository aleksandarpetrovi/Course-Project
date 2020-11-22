package application;
	
import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

/**
 * Main class controlling the UI of the application
 * @author aleks
 *
 */
public class Main extends Application {
	/**
	 * Creates the UI.
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			// Create the FXMLLoader
			Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
			
			//Create the scene with a width of 1000 and height of 500
			Scene scene = new Scene(root,1000,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//Set the scene to the stage
			primaryStage.setScene(scene);
			primaryStage.show();
			
			//Set Min height
			primaryStage.setMinHeight(500);
			
			//Set Min width
			primaryStage.setMinWidth(1000);
			
			//Set the Title to the Stage
			primaryStage.setTitle("Just-Do To-Do");
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Launches the UI.
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
