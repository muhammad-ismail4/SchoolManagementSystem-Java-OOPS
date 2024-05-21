import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

    private String grade;
    private List<Course> courses;
    private List<Attendance> attendances;

    public Student(int id, String name, String phone, String address, String grade){
     super(id,name,phone,address);
     this.grade = grade;
     this.courses = new ArrayList<>();
     this.attendances = new ArrayList<>();
    }

    public void enrollCourse(Course course){
    courses.add(course);
    course.addStudent(this);
    }

    public List<Course> getCourses(){

        return courses;
    }

}
