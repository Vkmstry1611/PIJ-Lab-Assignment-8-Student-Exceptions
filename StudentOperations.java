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

    
    public void updateStudent(long prn) throws StudentNotFoundException, InvalidInputException {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                System.out.println("Updating student details...");
                System.out.print("Enter new Name: ");
                String name = scan.nextLine();
                if (name.trim().isEmpty()) {
                    throw new InvalidInputException("Name cannot be empty.");
                }

                System.out.print("Enter new Date of Birth (YYYY-MM-DD): ");
                String dob = scan.next();
                if (dob.trim().isEmpty()) {
                    throw new InvalidInputException("Date of Birth cannot be empty.");
                }

                System.out.print("Enter new Marks: ");
                double marks = scan.nextDouble();
                if (marks < 0 || marks > 100) {
                    throw new InvalidInputException("Marks should be between 0 and 100.");
                }
                
                student.setName(name);
                student.setDoB(dob);
                student.setMarks(marks);
                System.out.println("Student details updated successfully.");
                return;
            }
        }
        throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }
    
    public void deleteStudent(long prn) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                students.remove(student);
                System.out.println("Student with PRN " + prn + " removed.");
                return;
            }
        }
        throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }
}