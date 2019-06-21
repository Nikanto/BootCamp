package userimport;

/**
 *
 * @author Nikos Katsantonis
 */
import administration.Course;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseImport {

    public Course courseInput(Scanner sc) {
        Course course = new Course();
        sc.nextLine();
        System.out.println("Please write courses's Title:");
        course.setTitle(sc.nextLine());
        System.out.println("Please write courses's Stream:");
        course.setStream(sc.nextLine());
        System.out.println("Please write course's Type:");
        course.setType(sc.nextLine());
        System.out.println("Please write courses's Start Date dd/MM/yyyy:");
        course.setStart_date(sc.nextLine());
        System.out.println("Please write courses's End Date dd//MM/yyyy:");
        course.setEnd_date(sc.nextLine());

        return (course);

    }

    public ArrayList<Course> multiCoursesInput(Scanner sc, ArrayList<Course> multiCourses) {
        Course course = new Course();

        boolean checkUserInput;
        do {
            course = courseInput(sc);
            multiCourses.add(course);
            System.out.println(course);
            System.out.println("Press 1 to import another Course:");
            System.out.println("Press 2 to enter the Print Menu:");

            checkUserInput = sc.next().equals("2");

        } while (!checkUserInput);

        return (multiCourses);
    }

}
