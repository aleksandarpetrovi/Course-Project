package application;

/**
 * The LocalEvent class is meant to define a task.
 *
 * @author aleks
 *
 */

public class LocalEvent {

	/**
	 * A string that stores the task.
	 */
	private String task;
	
	/**
	 * retrieves the task.
	 * @return		the string associated with this task
	 */
	public String getTask() {
		return task;
	}
	
	/**
	 * Sets a task to the newly input string.
	 * @param task		the string associated with this task.
	 */
	/*public void setTask(String task) {
		this.task = task;
	}
	*/
	/**
	 * Creates a new task with the input task.
	 * @param task		the string associated with this task.
	 */
	public LocalEvent(String task) {
		this.task = task;
	}
	
	/**
	 * Displays the string value of each task.
	 */
	@Override
	public String toString() {
		
		return this.getTask();
	}
}
