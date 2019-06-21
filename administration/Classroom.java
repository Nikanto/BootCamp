package administration;

import java.util.ArrayList;

/**
 *
 * @author Nikos Katsantonis
 */
public class Classroom {

    private Course course;
    private ArrayList<Student> students;
    private ArrayList<Trainer> trainers;
    private ArrayList<Assignment> assignments;

    public Classroom() {

    }

    public Classroom(Course course, ArrayList<Student> students, ArrayList<Trainer> trainers, ArrayList<Assignment> assignments) {
        this.course = course;
        this.students = students;
        this.trainers = trainers;
        this.assignments = assignments;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(ArrayList<Trainer> trainers) {
        this.trainers = trainers;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        return "course=" + course + ", students=" + students + ", trainers=" + trainers + ", assignments=" + assignments;
    }

}
