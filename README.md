Student Marks Management Application
This Java application, developed in NetBeans, facilitates the management of student marks using linked lists and follows the Model-View-Controller (MVC) architecture. The application includes various forms for adding, deleting, updating, viewing, and searching student records. Below is an overview of the project structure and instructions on how to run the application.

Project Structure
Controller:

StudentController.java: Manages user interactions, handling input from the View and updating the Model accordingly.
DB (Database):

DBConnection.java: Singleton class managing the database connection.
StudentDB.java: Manages student records using a linked list structure.
StudentList.java: Implements linked lists for efficient student object management.
Model:

Student.java: Defines the structure of a student, including attributes like name, ID, and marks.
View:

Forms for:
AddStudentForm.java: Adds a new student record.
DeleteStudentForm.java: Deletes an existing student record.
UpdateStudentForm.java: Updates details of an existing student.
ViewStudentsForm.java: Displays a list of all student records.
SearchStudentForm.java: Searches for a speci
