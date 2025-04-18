mport java.util.ArrayList;
import java.util.Scanner;

class StudentOperations {
    private ArrayList<Student> students;
    private Scanner scan;

    public StudentOperations() {
        students = new ArrayList<>();
        scan = new Scanner(System.in);
    }
    //method to add student with exception 
    public void addStudent(Student student) throws InvalidStudentDataException {
        if (student == null) {
            throw new InvalidStudentDataException("Student data cannot be null.");
        }
        students.add(student);
        System.out.println("Student added successfully.");
    }

    
    //method to display students
        public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : students) {
            student.display();
        }
    }

}