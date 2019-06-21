package userimport;

/**
 *
 * @author Nikos Katsantonis
 */
import administration.Assignment;
import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentImport {

    public Assignment assignmentInput(Scanner sc) {
        boolean validInputDouble = false;
        sc.nextLine();
        Assignment assignment = new Assignment();
        System.out.println("Please write assignment's Title:");
        assignment.setTitle(sc.nextLine());
        System.out.println("Please write assignment's Description:");
        assignment.setDescription(sc.nextLine());
        System.out.println("Please write assignment's Submission Date:");
        assignment.setSubDateTime(sc.nextLine());
        do {
            try {
                System.out.println("Please write assignment's Oral Mark:");
                validInputDouble = sc.hasNextDouble();
                assignment.setOralMark(sc.nextInt());

            } catch (Exception e) {
                System.out.println("Oral Mark must be a number!");
                sc.next();
            }
        } while (!validInputDouble);

        do {
            try {
                System.out.println("Please write assignment's Total Mark:");

                validInputDouble = sc.hasNextDouble();
                assignment.setTotalMark(sc.nextInt());

            } catch (Exception e) {
                System.out.println("Total Mark must be a number!");
                sc.next();
            }
        } while (!validInputDouble);

        return (assignment);

    }

    public ArrayList<Assignment> multiAssignmentsInput(Scanner sc, ArrayList<Assignment> multiAssignments) {
        Assignment assignment = new Assignment();

        boolean checkUserInput;
        do {
            assignment = assignmentInput(sc);
            multiAssignments.add(assignment);
            System.out.println(assignment);
            System.out.println("Press 1 to import another Assignment:");
            System.out.println("Press 2 to enter the Print Menu:");
            checkUserInput = sc.next().equals("2");
        } while (!checkUserInput);

        return (multiAssignments);
    }

}
