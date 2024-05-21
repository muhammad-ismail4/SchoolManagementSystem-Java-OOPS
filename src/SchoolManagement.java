public class SchoolManagement {
    public static void main(String[] args) {

        System.out.println("=============================================================================");
        System.out.println("School Details");
        School school = new School("MAster Model shcool", "Mardan");
        System.out.println(school.getSchoolDetails());

        System.out.println("=============================================================================");
        System.out.println("Student Details");
        Person student = new Student(1,"Ismail","03189379479", "Mardan", "A+");
        System.out.println(student.getDetails());


    }
}
