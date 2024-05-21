import java.util.ArrayList;
import java.util.List;

public class School {

    private String schoolName;
    private String address;
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Course> courses;

    public School(String schoolName, String address){
        this.schoolName = schoolName;
        this.address = address;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student){
         students.add(student);
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public void addCourse(Course course){
        courses.add(course);
    }

    public String getSchoolDetails(){
        return " School Name : " + schoolName + "\n Address : " + address;
    }

}
