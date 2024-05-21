import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    private String subjectTeach;
    private List<Course> courses;
    private double salary;

    public Teacher(int id, String name, String phone, String address, String subjectTeach, double salary){
        super(id, name, phone, address);
        this.subjectTeach = subjectTeach;
        this.courses = new ArrayList<>();
        this.salary = salary;
    }
      public void setSubjectTeach(String subjectTeach){
        this.subjectTeach = subjectTeach;
      }

      public String getSubjectTeach(){
        return subjectTeach;
      }

      public void asignCourses(Course course){
        courses.add(course);
      }

      public List<Course> getCourses(){
        return courses;
      }
}
