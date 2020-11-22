package application;
import javafx.fxml.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * Controls the functions of the buttons and fields of the application.
 * @author aleks
 *
 */
public class SampleController {
	
	@FXML
	Button addButton;
	
	@FXML
	Button delButton;
	
	@FXML
    TextField taskTextField;
	
	@FXML
	ListView<LocalEvent> eventList;
	ObservableList<LocalEvent> list = FXCollections.observableArrayList();
	 
	/**
	 * Adds an event (Task) to the viewList after recognizing the click
	 * and refreshes the taskTextField.
	 * @param e		On click.
	 */
	@FXML
	 private void addEvent(Event e) {
		 list.add(new LocalEvent(taskTextField.getText()));
		 eventList.setItems(list);
		 refresh();
	    }
	 
	/**
	 * Clears the textField after a task has been added to the viewList.
	 */
	 private void refresh() {
		 taskTextField.setText(null);
	 }
	
	 /**
	  * Deletes a task from the viewList.
	  */
	@FXML
	private void deleteEvent(ActionEvent e) {
		
		 eventList.getItems().removeAll(eventList.getSelectionModel().getSelectedItem());
	 }
	
	
}
