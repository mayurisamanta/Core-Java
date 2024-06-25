public class Course {

    private String courseName;

    private Integer credits;

    public Course(String courseName, Integer credits) {
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public Integer getCredits() {
        return credits;
    }
}
