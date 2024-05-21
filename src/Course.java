import java.util.ArrayList;
import java.util.List;

public class Course {

    private int courseId;
    private String courseName;
    private Teacher teacher;
    private List<Student> students;
    private List<TimeTable> times;

    public Course(int courseId, String courseName ,Teacher teacher){
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = new ArrayList<>();
        this.times = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }
    public void addTimeTable(TimeTable timeTable){
        times.add(timeTable);
    }

    public void removeTableTable(TimeTable timeTable){
        times.remove(timeTable);
    }

    public String getCourseDetails(){
        return "Course ID : " + courseId + " Course Name : " + courseName + " Teacher "  + teacher.getDetails();

    }
}
