import java.util.List;

public class TimeTable {

    private String days;
    private String startTime;
    private String endTime;
    private Course course;

    public TimeTable(String days, String startTime, String endTime, Course course){
        this.days = days;
        this.startTime = startTime;
        this.endTime = endTime;
        this.course = course;
    }

    public String getDetails(){

        return "Week Day " + days + " Starting Time : " + startTime + " Ending Time : " + endTime + " Course " + course.getCourseDetails();
    }
}
