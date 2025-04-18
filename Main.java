// Name: Vidish Ketankumar Mistry
// PRN: 23070126146
// Batch: B-3 

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Search Student by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        String name = scan.nextLine();
                        System.out.print("Enter PRN: ");
                        long prn = scan.nextLong();
                        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
                        String dob = scan.next();
                        System.out.print("Enter Marks: ");
                        double marks = scan.nextDouble();

                        Student student = new Student(prn, name, dob, marks);
                        operations.addStudent(student);
                        break;

                    case 2:
                        operations.displayStudents();
                        break;

                    case 3:
                        System.out.print("Enter PRN to search: ");
                        long searchPRN = scan.nextLong();
                        operations.searchByPRN(searchPRN);
                        break;

                    case 4:
                        System.out.print("Enter Name to search: ");
                        String searchName = scan.nextLine();
                        operations.searchByName(searchName);
                        break;

                    case 5:
                        System.out.print("Enter Position to search: ");
                        int position = scan.nextInt();
                        operations.searchByPosition(position);
                        break;

                    case 6:
                        System.out.print("Enter PRN of student to update: ");
                        long updatePRN = scan.nextLong();
                        operations.updateStudent(updatePRN);
                        break;

                    case 7:
                        System.out.print("Enter PRN of student to delete: ");
                        long deletePRN = scan.nextLong();
                        operations.deleteStudent(deletePRN);
                        break;

                    case 0:
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (InvalidStudentDataException | StudentNotFoundException | InvalidPositionException | InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 0);

        scan.close();
    }
}
