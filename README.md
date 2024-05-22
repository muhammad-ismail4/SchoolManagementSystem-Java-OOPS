Classes and Relationships
Person (Base Class)

Attributes: id, name, address, phone
Methods: getDetails(), updateDetails()
Student (Derived from Person)

Attributes: grade, courses (List of Course objects), attendance (List of Attendance objects)
Methods: enrollCourse(Course course), markAttendance(Attendance attendance), getGrades()
Teacher (Derived from Person)

Attributes: subjectSpecialization, courses (List of Course objects), salary
Methods: assignCourse(Course course), getCourseList()
Course

Attributes: courseId, courseName, teacher (Teacher object), students (List of Student objects), schedule (List of Schedule objects)
Methods: addStudent(Student student), removeStudent(Student student), getCourseDetails()
Schedule

Attributes: dayOfWeek, startTime, endTime, course (Course object)
Methods: getScheduleDetails()
Attendance

Attributes: date, present (boolean), student (Student object), course (Course object)
Methods: markPresent(), markAbsent()
School

Attributes: name, address, students (List of Student objects), teachers (List of Teacher objects), courses (List of Course objects)
Methods: addStudent(Student student), addTeacher(Teacher teacher), addCourse(Course course), getSchoolDetails()


Expalanation:

Person: This is the base class for Student and Teacher, encapsulating common attributes and methods.

Student: Extends Person, adding attributes and methods specific to students, such as enrolling in courses and marking attendance.

Teacher: Extends Person, adding attributes and methods specific to teachers, such as assigning courses.

Course: Represents a course with details like course ID, name, teacher, and enrolled students.

Schedule: Represents the schedule of a course, including the day, start time, and end time.

Attendance: Represents the attendance record of a student in a course on a particular date.

School: Manages the list of students, teachers, and courses, providing methods to add and retrieve these entities.

This structure ensures that the code follows OOP principles, promoting reusability, modularity, and maintainability.
