# **Student Management System**

## **Overview**
This is a Java-based Student Management System that allows the user to perform CRUD (Create, Read, Update, Delete) operations on student records. The system includes functionalities such as adding students, displaying student information, searching for students by PRN, name, or position, and updating or deleting student records.

The program uses custom exceptions to handle errors and improve the system's robustness. These exceptions include:
1. `InvalidStudentDataException` for invalid or null student data.
2. `StudentNotFoundException` for cases where a student is not found.
3. `InvalidPositionException` for invalid index when searching by position.
4. `InvalidInputException` for invalid or empty inputs when updating student records.

## **Project Structure**

### 1. **Student.java**
This class represents a student and contains the following attributes and methods:
- **Attributes:**
  - `prn`: A unique identification number (PRN) for each student.
  - `name`: The name of the student.
  - `dob`: The date of birth of the student.
  - `marks`: The marks of the student.
  
- **Constructor:**
  - Initializes the student's attributes (`prn`, `name`, `dob`, `marks`).

- **Getters and Setters:**
  - Methods to access and modify each attribute:
    - `getPRN()`, `getName()`, `getDoB()`, `getMarks()`
    - `setName()`, `setDoB()`, `setMarks()`

- **display():**
  - Prints the details of the student.

### 2. **Exceptions**
There are four custom exceptions used to handle errors in different scenarios:
1. **InvalidStudentDataException.java**
   - Thrown when student data is invalid or null.
2. **StudentNotFoundException.java**
   - Thrown when a student is not found using PRN or name.
3. **InvalidPositionException.java**
   - Thrown when an invalid position is given for searching a student by index.
4. **InvalidInputException.java**
   - Thrown when the user enters invalid or empty input during the update process.

### 3. **StudentOperations.java**
This class manages the operations on student records. It provides various methods for adding, displaying, searching, updating, and deleting students.

- **Attributes:**
  - `students`: An `ArrayList` to store the list of student objects.
  - `scan`: A `Scanner` object to handle user input.

- **Methods:**
  - **addStudent(Student student):** Adds a student to the list. Throws an `InvalidStudentDataException` if the student data is null.
  - **displayStudents():** Displays all students in the list. If the list is empty, a message is shown.
  - **searchByPRN(long prn):** Searches for a student by their PRN and displays their details. Throws a `StudentNotFoundException` if the student is not found.
  - **searchByName(String name):** Searches for a student by their name (case-insensitive). Throws a `StudentNotFoundException` if the student is not found.
  - **searchByPosition(int pos):** Searches for a student at a specific position in the list. Throws an `InvalidPositionException` if the position is invalid.
  - **updateStudent(long prn):** Updates the details of a student identified by PRN. Throws a `StudentNotFoundException` if the student is not found and an `InvalidInputException` for invalid input.
  - **deleteStudent(long prn):** Deletes a student from the list by PRN. Throws a `StudentNotFoundException` if the student is not found.

### 4. **Main.java**
This is the entry point of the program, where the user interacts with the system via a menu-driven interface.

- **Methods:**
  - **main(String[] args):** The main method that runs the program in a loop. It displays a menu with various options and calls the appropriate methods from the `StudentOperations` class based on user input.

### **Menu Options:**
1. **Add Student:** Prompts the user to enter the student’s name, PRN, Date of Birth, and marks, and then adds the student.
2. **Display All Students:** Displays a list of all students.
3. **Search Student by PRN:** Prompts the user to enter a PRN to search for a student.
4. **Search Student by Name:** Prompts the user to enter a name to search for a student.
5. **Search Student by Position:** Prompts the user to enter a position and displays the student at that position.
6. **Update Student:** Prompts the user to enter a PRN and allows updating the student’s details.
7. **Delete Student:** Prompts the user to enter a PRN and removes the student from the list.
8. **Exit:** Exits the program.

### **Exception Handling in Main:**
The `main` method uses a `try-catch` block to catch the four custom exceptions (`InvalidStudentDataException`, `StudentNotFoundException`, `InvalidPositionException`, and `InvalidInputException`) and displays appropriate error messages to the user.

## **Usage**
1. **Running the Program:**
   - Compile and run the `Main.java` file.
   - The user will be presented with a menu to interact with the system.

2. **Handling Errors:**
   - If an error occurs (like an invalid position or student not found), the program will print an error message and continue.


## **Custom Exceptions**
- **InvalidStudentDataException:** Thrown if student data is null.
- **StudentNotFoundException:** Thrown if a student is not found by PRN or name.
- **InvalidPositionException:** Thrown if an invalid position is provided for search.
- **InvalidInputException:** Thrown if invalid or empty input is provided when updating student details.

## **Conclusion**
This Student Management System is a simple, yet effective way to manage student records. It uses custom exceptions to handle errors gracefully and allows the user to perform various operations like adding, searching, updating, and deleting student information.
