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

    //methods to seatch by name prn and position
    public void searchByPRN(long prn) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                student.display();
                return;
            }
        }
        throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }

    public void searchByName(String name) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.display();
                return;
            }
        }
        throw new StudentNotFoundException("Student with name '" + name + "' not found.");
    }

    public void searchByPosition(int pos) throws InvalidPositionException {
        if (pos >= 0 && pos < students.size()) {
            students.get(pos).display();
        } else {
            throw new InvalidPositionException("Invalid position. No student found at the given index.");
        }
    }
}