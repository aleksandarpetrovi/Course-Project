package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.LocalEvent;
import application.SampleController;
import javafx.event.Event;
import javafx.event.EventType;

class ControllerTest {

	@Test
	public void addEventTest() {
		
		String a = "Testing trial";
		SampleController test = new SampleController();
		list.add(new LocalEvent(taskTextField.getText()));
		 eventList.setItems(list);
		 refresh();
		
	}

}
