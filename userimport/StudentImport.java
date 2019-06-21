package userimport;

/**
 *
 * @author Nikos Katsantonis
 */
import administration.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentImport {

    public Student studentInput(Scanner sc) {
        boolean validInputDouble = true;
        sc.nextLine();
        Student student = new Student();
        System.out.println("Please write student's First Name:");
        student.setFirstName(sc.nextLine());
        System.out.println("Please write student's Last Name:");
        student.setLastName(sc.nextLine());
        System.out.println("Please write student's Date of Birth in format dd/MM/yyyy:");
        student.setDateOfBirth(sc.nextLine());

        do {
            try {

                System.out.println("Please write student's Tuition Fees:");
                validInputDouble = sc.hasNextDouble();
                student.setTuitionFees(sc.nextDouble());

            } catch (Exception e) {
                System.out.println("Tuition fees must be a number!");
                sc.next();
            }
        } while (!validInputDouble);

        return (student);

    }

    public ArrayList<Student> multiStudentsInput(Scanner sc, ArrayList<Student> multiStudents) {
        Student student = new Student();

        boolean checkUserInput;
        do {
            student = studentInput(sc);
            multiStudents.add(student);
            System.out.println(student);
            System.out.println("Press 1 to import another Student:");
            System.out.println("Press 2 to enter the Print Menu:");

            checkUserInput = sc.next().equals("2");

        } while (!checkUserInput);

        return (multiStudents);
    }
}
