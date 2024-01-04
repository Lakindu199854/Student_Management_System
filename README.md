<!DOCTYPE html>
<html>


<body>

  <h1>Student Marks Management Application</h1>

  <p>This Java application, developed in NetBeans, facilitates the management of student marks using linked lists and follows the Model-View-Controller (MVC) architecture. The application includes various forms for adding, deleting, updating, viewing, and searching student records.</p>

  <h2>Project Structure</h2>

  <h3>Controller:</h3>
  <ul>
    <li><code>StudentController.java</code>: Manages user interactions, handling input from the View and updating the Model accordingly.</li>
  </ul>

  <h3>DB (Database):</h3>
  <ul>
    <li><code>DBConnection.java</code>: Singleton class managing the database connection.</li>
    <li><code>StudentDB.java</code>: Manages student records using a linked list structure.</li>
    <li><code>StudentList.java</code>: Implements linked lists for efficient student object management.</li>
  </ul>

  <h3>Model:</h3>
  <ul>
    <li><code>Student.java</code>: Defines the structure of a student, including attributes like name, ID, and marks.</li>
  </ul>

  <h3>View:</h3>
  <p>Forms for:</p>
  <ul>
    <li><code>AddStudentForm.java</code>: Adds a new student record.</li>
    <li><code>DeleteStudentForm.java</code>: Deletes an existing student record.</li>
    <li><code>UpdateStudentForm.java</code>: Updates details of an existing student.</li>
    <li><code>ViewStudentsForm.java</code>: Displays a list of all student records.</li>
    <li><code>SearchStudentForm.java</code>: Searches for a specific student record.</li>
  </ul>

</body>

</html>
