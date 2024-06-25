import java.util.List;

public class Student {

    private String name;

    private List<Course> enrolledCourses;

    public Student(String name, List<Course> enrolledCourses) {
        this.name = name;
        this.enrolledCourses = enrolledCourses;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Enrolled Courses: ");
        for (Course course : enrolledCourses) {
            System.out.println(course.getCourseName());
        }
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 4);
        Course course2 = new Course("Python Programming", 3);
        List<Course> courses = List.of(course1, course2);
        Student student = new Student("Mayuri Samanta", courses);
        student.displayDetails();
    }
}
