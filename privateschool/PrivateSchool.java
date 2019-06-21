package privateschool;

/**
 *
 * @author Nikos Katsantonis
 */
import userimport.AssignmentImport;
import userimport.CourseImport;
import userimport.TrainerImport;
import userimport.StudentImport;
import java.util.ArrayList;
import java.util.Scanner;
import administration.Student;
import administration.Course;
import administration.Assignment;
import administration.Classroom;
import administration.Trainer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrivateSchool {

    public static void main(String[] args) throws ParseException {

        ArrayList<Student> multiStudents = new ArrayList<Student>();
        ArrayList<Course> multiCourses = new ArrayList<Course>();
        ArrayList<Assignment> multiAssignments = new ArrayList<Assignment>();
        ArrayList<Trainer> multiTrainers = new ArrayList<Trainer>();
        ArrayList<Classroom> multiClassrooms = new ArrayList<Classroom>();

        boolean continuePrompt = true;

        Scanner sc = new Scanner(System.in);
        String choice;

        System.out.println("Press 1 to import Data.");
        System.out.println("Press 2 to use Synthetic Data.");

        choice = sc.next();

        switch (choice) {
            case "1":

                System.out.println("Press 1 to import Students.");
                System.out.println("Press 2 to import Courses.");
                System.out.println("Press 3 to import Assignements.");
                System.out.println("Press 4 to import Trainers.");

                choice = sc.next();
                switch (choice) {

                    case "1":

                        StudentImport studentImport = new StudentImport();
                        multiStudents = studentImport.multiStudentsInput(sc, multiStudents);

                        break;

                    case "2":

                        CourseImport courseInput = new CourseImport();
                        multiCourses = courseInput.multiCoursesInput(sc, multiCourses);

                        break;

                    case "3":

                        AssignmentImport assignmentInput = new AssignmentImport();
                        multiAssignments = assignmentInput.multiAssignmentsInput(sc, multiAssignments);

                        break;

                    case "4":

                        TrainerImport trainerInput = new TrainerImport();
                        multiTrainers = trainerInput.multiTrainerInput(sc, multiTrainers);

                        break;
                }

                break;

            case "2":

                SyntheticData syntheticData = new SyntheticData();
                multiStudents = syntheticData.syntheticStudents();
                multiTrainers = syntheticData.syntheticTrainers();
                multiCourses = syntheticData.syntheticCourses();
                multiAssignments = syntheticData.syntheticAssignments();
                multiClassrooms = syntheticData.syntheticClassrooms(multiCourses, multiStudents, multiAssignments, multiTrainers);

                break;
        }

        do {
            continuePrompt = true;

            System.out.println("Press 0 to enter Import Menu:");
            System.out.println("Press 1 to print all the Students:");
            System.out.println("Press 2 to print all the Trainers:");
            System.out.println("Press 3 to print all the Assignments:");
            System.out.println("Press 4 to print all the Courses:");
            System.out.println("Press 5 to print all the Students per Course:");
            System.out.println("Press 6 to print all the Trainers per Course:");
            System.out.println("Press 7 to print all the Assignments per Course:");
            System.out.println("Press 8 to print all the Students that belong to more than one Courses:");
            System.out.println("Press 9 to query Students that have Assignments on a specific week:");
            System.out.println("Press 10 to Exit Program:");

            choice = sc.next();

            switch (choice) {

                case "0":
                    System.out.println("Press 1 to import Students.");
                    System.out.println("Press 2 to import Courses.");
                    System.out.println("Press 3 to import Assignements.");
                    System.out.println("Press 4 to import Trainers.");

                    continuePrompt = false;

                    choice = sc.next();
                    switch (choice) {

                        case "1":

                            StudentImport studentImport = new StudentImport();
                            multiStudents = studentImport.multiStudentsInput(sc, multiStudents);

                            break;

                        case "2":
                            CourseImport courseInput = new CourseImport();
                            multiCourses = courseInput.multiCoursesInput(sc, multiCourses);

                            break;

                        case "3":
                            AssignmentImport assignmentInput = new AssignmentImport();
                            multiAssignments = assignmentInput.multiAssignmentsInput(sc, multiAssignments);

                            break;

                        case "4":

                            TrainerImport trainerInput = new TrainerImport();
                            multiTrainers = trainerInput.multiTrainerInput(sc, multiTrainers);

                            break;
                    }

                    break;

                case "1":
                    for (Student student : multiStudents) {
                        System.out.println(student.toString());
                    }

                    break;
                case "2":
                    for (Trainer trainer : multiTrainers) {
                        System.out.println(trainer.toString());
                    }

                    break;
                case "3":
                    for (Assignment assignment : multiAssignments) {
                        System.out.println(assignment.toString());
                    }

                    break;
                case "4":
                    for (Course course : multiCourses) {
                        System.out.println(course.toString());
                    }

                    break;
                case "5":
                    for (Classroom classroom : multiClassrooms) {
                        System.out.println(classroom.getCourse().getTitle() + ": ");
                        classroom.getStudents().forEach((student) -> {
                            System.out.println(student.toString());
                        });
                    }

                    break;
                case "6":
                    for (Classroom classroom : multiClassrooms) {
                        System.out.println(classroom.getCourse().getTitle() + ": ");
                        classroom.getTrainers().forEach((trainer) -> {
                            System.out.println(trainer.toString());
                        });
                    }

                    break;
                case "7":
                    for (Classroom classroom : multiClassrooms) {
                        System.out.println(classroom.getCourse().getTitle() + ": ");
                        classroom.getAssignments().forEach((assignment) -> {
                            System.out.println(assignment.toString());
                        });
                    }

                    break;
                case "8":
                    int counter;

                    for (Student student : multiStudents) {

                        counter = 0;

                        for (Classroom classroom : multiClassrooms) {

                            if (classroom.getStudents().contains(student)) {
                                counter++;
                            }
                            if (counter > 1) {
                                break;
                            }
                        }
                        if (counter > 1) {
                            System.out.println(student.toString());

                        }
                    }

                    break;

                case "9":

                    boolean validInputDate = true;

                    do {
                        validInputDate = true;
                        try {

                            System.out.println("Enter date in format dd/MM/yyyy:");
                            String date = sc.next();
                            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                            Date newDate = formatter.parse(date);
                            DateFormat formatter2 = new SimpleDateFormat("EEEE");
                            String finalDay = formatter2.format(newDate);

                            System.out.println(finalDay);
                            int day = Integer.parseInt(date.substring(0, 2));
                            int startDay = 0;
                            int endDay = 0;

                            switch (finalDay) {
                                case "Monday":

                                    startDay = day - 1;
                                    endDay = day + 5;
                                    break;
                                case "Tuesday":

                                    startDay = day - 2;
                                    endDay = day + 4;
                                    break;
                                case "Wednesday":

                                    startDay = day - 3;
                                    endDay = day + 3;
                                    break;
                                case "Thursday":

                                    startDay = day - 4;
                                    endDay = day + 2;
                                    break;
                                case "Friday":

                                    startDay = day - 5;
                                    endDay = day + 1;
                                    break;
                                case "Saturday":

                                    startDay = day - 6;
                                    endDay = day;
                                    break;
                                case "Sunday":

                                    startDay = day - 7;
                                    endDay = day + 12;
                                    break;

                            }
                            String monday = String.valueOf(startDay) + date.substring(2);
                            String friday = String.valueOf(endDay) + date.substring(2);
                            ArrayList<Student> students = new ArrayList<>();
                            Date mondayDate = formatter.parse(monday);
                            Date fridayDate = formatter.parse(friday);
                            for (Classroom classroom : multiClassrooms) {
                                for (Assignment assignment : classroom.getAssignments()) {
                                    Date subDate = formatter.parse(assignment.getSubDateTime());
                                    if (subDate.before(fridayDate) && subDate.after(mondayDate)) {
                                        for (Student student : classroom.getStudents()) {
                                            if (!students.contains(student)) {
                                                students.add(student);
                                            }
                                        }
                                    }
                                }

                            }
                            if (students.isEmpty()) {
                                System.out.println("No student has any assignment on this week");
                            } else {
                                for (Student student : students) {
                                    System.out.println(student.toString());
                                }
                            }

                        } catch (Exception e) {
                            System.out.println("The date should be in this format: dd/MM/yyyy");
                            validInputDate = false;
                            sc.next();
                        }
                    } while (!validInputDate);

                    break;
                case "10":
                    continuePrompt = false;
                    break;
            }

            boolean checkUserInput;

            if (continuePrompt == true) {

                System.out.println("Press \"ENTER\" to continue...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();

            }

        } while (!"10".equals(choice));

    }
}
