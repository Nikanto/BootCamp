package privateschool;

/**
 *
 * @author Nikos Katsantonis
 */
import administration.Assignment;
import administration.Classroom;
import administration.Course;
import administration.Student;
import administration.Trainer;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SyntheticData {

    public ArrayList<Student> syntheticStudents() throws ParseException {
        ArrayList<Student> multiStudents = new ArrayList<Student>();

        Student student1 = new Student();
        student1.setFirstName("John");
        student1.setLastName("Leader");
        student1.setDateOfBirth("01/01/1980");
        student1.setTuitionFees(2500);
        multiStudents.add(student1);

        Student student2 = new Student();
        student2.setFirstName("Chris");
        student2.setLastName("Creative");
        student2.setDateOfBirth("01/02/1981");
        student2.setTuitionFees(2500);
        multiStudents.add(student2);

        Student student3 = new Student();
        student3.setFirstName("Jack");
        student3.setLastName("Innovator");
        student3.setDateOfBirth("01/03/1982");
        student3.setTuitionFees(2500);
        multiStudents.add(student3);

        Student student4 = new Student();
        student4.setFirstName("Oliver");
        student4.setLastName("Genius");
        student4.setDateOfBirth("01/04/1983");
        student4.setTuitionFees(2500);
        multiStudents.add(student4);

        Student student5 = new Student();
        student5.setFirstName("Jim");
        student5.setLastName("Curious");
        student5.setDateOfBirth("01/05/1984");
        student5.setTuitionFees(2500);
        multiStudents.add(student5);

        Student student6 = new Student();
        student6.setFirstName("Oscar");
        student6.setLastName("Handsome");
        student6.setDateOfBirth("01/06/1985");
        student6.setTuitionFees(2500);
        multiStudents.add(student6);

        Student student7 = new Student();
        student7.setFirstName("James");
        student7.setLastName("Black");
        student7.setDateOfBirth("01/07/1986");
        student7.setTuitionFees(2500);
        multiStudents.add(student7);

        Student student8 = new Student();
        student8.setFirstName("William");
        student8.setLastName("White");
        student8.setDateOfBirth("01/08/1987");
        student8.setTuitionFees(2500);
        multiStudents.add(student8);

        Student student9 = new Student();
        student9.setFirstName("Jacob");
        student9.setLastName("Inventor");
        student9.setDateOfBirth("01/09/1988");
        student9.setTuitionFees(2500);
        multiStudents.add(student9);

        Student student10 = new Student();
        student10.setFirstName("Daniel");
        student10.setLastName("Fast");
        student10.setDateOfBirth("01/10/1989");
        student10.setTuitionFees(2500);
        multiStudents.add(student10);

        return multiStudents;
    }

    public ArrayList<Trainer> syntheticTrainers() throws ParseException {

        ArrayList<Trainer> multiTrainers = new ArrayList<Trainer>();

        Trainer trainer1 = new Trainer();
        trainer1.setFirstName("Joe");
        trainer1.setLastName("Logical");
        trainer1.setSubject("Introduction to Programming");
        multiTrainers.add(trainer1);

        Trainer trainer2 = new Trainer();
        trainer2.setFirstName("Alexander");
        trainer2.setLastName("Remarkable");
        trainer2.setSubject("Object Oriented Programming");
        multiTrainers.add(trainer2);

        Trainer trainer3 = new Trainer();
        trainer3.setFirstName("Harry");
        trainer3.setLastName("Serious");
        trainer3.setSubject("Web Design");
        multiTrainers.add(trainer3);

        Trainer trainer4 = new Trainer();
        trainer4.setFirstName("Richard");
        trainer4.setLastName("Typical");
        trainer4.setSubject("Web Development");
        multiTrainers.add(trainer4);

        Trainer trainer5 = new Trainer();
        trainer5.setFirstName("David");
        trainer5.setLastName("Formal");
        trainer5.setSubject("Databases");
        multiTrainers.add(trainer5);

        Trainer trainer6 = new Trainer();
        trainer6.setFirstName("Jacob");
        trainer6.setLastName("Practical");
        trainer6.setSubject("Debugging");
        multiTrainers.add(trainer6);

        return multiTrainers;
    }

    public ArrayList<Course> syntheticCourses() throws ParseException {

        ArrayList<Course> multiCourses = new ArrayList<Course>();

        Course course1 = new Course();
        course1.setTitle("MySQL");
        course1.setStream("Java");
        course1.setType("Full Time");
        course1.setStart_date("01/06/2019");
        course1.setEnd_date("30/12/2019");
        multiCourses.add(course1);

        Course course2 = new Course();
        course2.setTitle("Servlets");
        course2.setStream("Java");
        course2.setType("Part Time");
        course2.setStart_date("01/06/2019");
        course2.setEnd_date("30/09/2019");
        multiCourses.add(course2);

        Course course3 = new Course();
        course3.setTitle("Spring MVC");
        course3.setStream("C#");
        course3.setType("Full Time");
        course3.setStart_date("01/06/2019");
        course3.setEnd_date("30/12/2019");
        multiCourses.add(course3);

        Course course4 = new Course();
        course4.setTitle("HTML CSS");
        course4.setStream("C#");
        course4.setType("Part Time");
        course4.setStart_date("01/06/2019");
        course4.setEnd_date("30/09/2019");
        multiCourses.add(course4);

        Course course5 = new Course();
        course5.setTitle("MongoDB");
        course5.setStream("Java");
        course5.setType("Full Time");
        course5.setStart_date("01/06/2019");
        course5.setEnd_date("30/12/2019");
        multiCourses.add(course5);

        Course course6 = new Course();
        course6.setTitle("Angular");
        course6.setStream("C#");
        course6.setType("Part Time");
        course6.setStart_date("01/06/2019");
        course6.setEnd_date("30/09/2019");
        multiCourses.add(course6);

        return multiCourses;
    }

    public ArrayList<Assignment> syntheticAssignments() throws ParseException {

        ArrayList<Assignment> multiAssignments = new ArrayList<Assignment>();

        Assignment assignment1 = new Assignment();
        assignment1.setTitle("BackEnd Part A");
        assignment1.setDescription("Foundation");
        assignment1.setSubDateTime("15/4/2019");
        assignment1.setOralMark(60);
        assignment1.setTotalMark(80);
        multiAssignments.add(assignment1);

        Assignment assignment2 = new Assignment();
        assignment2.setTitle("BackEnd Part B");
        assignment2.setDescription("Advanced");
        assignment2.setOralMark(70);
        assignment2.setTotalMark(90);
        assignment2.setSubDateTime("30/3/2019");
        multiAssignments.add(assignment2);

        Assignment assignment3 = new Assignment();
        assignment3.setTitle("FrontEnd Part A");
        assignment3.setDescription("Foundation");
        assignment3.setSubDateTime("15/07/2019");
        assignment3.setOralMark(80);
        assignment3.setTotalMark(90);
        multiAssignments.add(assignment3);

        Assignment assignment4 = new Assignment();
        assignment4.setTitle("FronEnd Part B");
        assignment4.setDescription("Advanced");
        assignment4.setOralMark(70);
        assignment4.setTotalMark(90);
        assignment4.setSubDateTime("30/03/2019");
        multiAssignments.add(assignment4);

        Assignment assignment5 = new Assignment();
        assignment5.setTitle("Databases Part A");
        assignment5.setDescription("Foundation");
        assignment5.setSubDateTime("28/04/2019");
        assignment5.setOralMark(70);
        assignment5.setTotalMark(80);
        multiAssignments.add(assignment5);

        Assignment assignment6 = new Assignment();
        assignment6.setTitle("Databases Part B");
        assignment6.setDescription("Advanced");
        assignment6.setOralMark(80);
        assignment6.setTotalMark(90);
        assignment6.setSubDateTime("30/09/2019");
        multiAssignments.add(assignment6);

        return multiAssignments;
    }

    public ArrayList<Classroom> syntheticClassrooms(ArrayList<Course> multiCourses, ArrayList<Student> multiStudents, ArrayList<Assignment> multiAssignments, ArrayList<Trainer> multiTrainers) {

        ArrayList<Classroom> multiClassrooms = new ArrayList<Classroom>();

        Classroom classroom;

        Random rand = new Random();

        int n;

        int index = 0;

        Set<Integer> randomSet = new HashSet<>();

        for (Course course : multiCourses) {

            ArrayList<Student> classroomStudents = new ArrayList<Student>();
            ArrayList<Trainer> classroomTrainers = new ArrayList<Trainer>();
            ArrayList<Assignment> classroomAssignments = new ArrayList<Assignment>();

            randomSet.clear();

            randomSet.add(1);
            do {
                n = rand.nextInt(10);

                randomSet.add(n);

            } while (randomSet.size() < 3);

            classroomStudents.clear();

            randomSet.forEach((num) -> {

                classroomStudents.add(multiStudents.get(num));
            });

            randomSet.clear();

            do {
                n = rand.nextInt(6);

                randomSet.add(n);

            } while (randomSet.size() < 2);

            classroomTrainers.clear();

            randomSet.forEach((num) -> {

                classroomTrainers.add(multiTrainers.get(num));
            });

            classroomAssignments.add(multiAssignments.get(index));

            classroom = new Classroom(course, classroomStudents, classroomTrainers, classroomAssignments);

            multiClassrooms.add(classroom);

            index++;
        }

        return multiClassrooms;
    }

}
