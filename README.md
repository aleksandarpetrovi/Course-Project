# Just-Do-To-Do Application Project

## Description:

Just-Do-To-Do is a streamlined to-do list that allows you to quickly add and remove items off a list. It will keep your life organized and ensure that productivity is at the top of your list.

## Installation:

Download the *Just-Do-To-Do.jar* file to get started. Once it is downloaded locally, simply run the application and your Just-Do-To-Do application will be up and running.

## Usage:

To use Just-Do-To-Do:

Click on the textfield in the top right corner and enter your task via the keyboard. 
![Capture](https://user-images.githubusercontent.com/71899121/99915426-d1cabd80-2cc0-11eb-964d-c1d6fbf9415e.PNG)



Click the **ADD** button to add your task to the list.
![Capture2](https://user-images.githubusercontent.com/71899121/99915462-076fa680-2cc1-11eb-997a-6a8f2ba99aba.PNG)



Your task will now be visible on the listview. To add more tasks, repeat the same process.
![Capture3](https://user-images.githubusercontent.com/71899121/99915489-3dad2600-2cc1-11eb-88e8-18a153dae4c6.PNG)




To delete a task, click on your task located on the list view and then click the **Delete** button at the bottom of the page.
![Capture4](https://user-images.githubusercontent.com/71899121/99915514-60d7d580-2cc1-11eb-9781-f0def33ed2b8.PNG)
![Capture5](https://user-images.githubusercontent.com/71899121/99915515-63d2c600-2cc1-11eb-800d-30372ffd5417.PNG)



Your selected task will now be removed.
![Capture6](https://user-images.githubusercontent.com/71899121/99915539-89f86600-2cc1-11eb-8711-9cb9f7d381b8.PNG)



## Building:

#### Setup
To start building this project you will need to setup three things:
- Download the JDK
- Download your IDE of choice (Netbeans, Eclipse, InteliJ, etc...)
- Download and link Scenebuilder to your IDE

Using these things you will be able to build this application.

#### In Your IDE

Create a new javaFX project and add the javaFX library to get started on your project. In the "application" package of your project, a **Main.java** class will be automatically added which will be the starting point of your build. This class will be in charge of the visual aspect of your application, as well as launching an individual instance of it within the main method. You'll then want to open a new FXML file within your project and right click on the file. Go to "Open with **Scenebuilder**" and you will be greeted with a new environment for building your application. 

In Scenebuilder, you will be able to build the layout of your application as well as add things like buttons, textfields, tables, etc... All of these items will need to be linked to your Main.java class as well as a **Controller** class which determines what each of those items will do.

Back in your IDE, you will need to create Object classes that will define the different parts of your application. For my to-do list, I needed to create a class that defines what fields a "task" has as well as the methods associated with it. My Controller class defined the actions for each of the controls in my application and linked them to methods that were defined in the LocalEvent.java class. 

As you make changes in Scenebuilder, your FXML will be automatically updated to contain the necessary code in order to display your application. 

#### Finishing Up

Once you have completed your application, you will need to export the project as a **.JAR file** in order to run the program locally on your machine. Right clicking on the project and then clicking **Export** in the menu will take you to a new screen where you can finilaze exporting your application. Once exported, you can run and use your application like any other application on your device!



