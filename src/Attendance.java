import java.util.Date;

public class Attendance {

    private Date date;
    private boolean present;
    private Student student;
    private Course course;

    public void markPresent(){
        this.present = true;
    }
    public void markAbsent(){
        this.present = false;
    }

    public String getAttendanceDetails(){

        return "Date : " + date + " Course " + course.getCourseDetails() + " Student : " + student.getDetails() + " Present : " + present;
    }
}
