package aaa;

public class pass2023nove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		import java.util.ArrayList;
		import java.util.List;

		// Abstract class Person
		abstract class Person {
		    protected int ID;
		    protected String name;

		    // Default constructor
		    public Person() {}

		    // Overloaded constructor
		    public Person(int ID, String name) {
		        this.ID = ID;
		        this.name = name;
		    }

		    // Abstract method to display details
		    public abstract void displayDetails();
		}

		// Abstract class Course
		abstract class Course {
		    protected String code;
		    protected String courseName;

		    // Default constructor
		    public Course() {}

		    // Overloaded constructor
		    public Course(String code, String courseName) {
		        this.code = code;
		        this.courseName = courseName;
		    }

		    // Abstract method to display course details
		    public abstract void displayCourseDetails();
		}

		// Concrete class Student
		class Student extends Person {
		    private List<Course> enrolledCourses;

		    // Default constructor
		    public Student() {
		        enrolledCourses = new ArrayList<>();
		    }

		    // Overloaded constructor
		    public Student(int ID, String name) {
		        super(ID, name);
		        enrolledCourses = new ArrayList<>();
		    }

		    // Method to enroll in a course
		    public void enrollInCourse(Course c) {
		        enrolledCourses.add(c);
		    }

		    // Override displayDetails method
		    @Override
		    public void displayDetails() {
		        System.out.println("Student ID: " + ID);
		        System.out.println("Student Name: " + name);
		        System.out.println("Enrolled Courses:");
		        for (Course c : enrolledCourses) {
		            c.displayCourseDetails();
		        }
		    }
		}

		// Concrete class Teacher
		class Teacher extends Person {
		    private List<Course> coursesTaught;

		    // Default constructor
		    public Teacher() {
		        coursesTaught = new ArrayList<>();
		    }

		    // Overloaded constructor
		    public Teacher(int ID, String name) {
		        super(ID, name);
		        coursesTaught = new ArrayList<>();
		    }

		    // Method to teach a course
		    public void teachCourse(Course c) {
		        coursesTaught.add(c);
		    }

		    // Override displayDetails method
		    @Override
		    public void displayDetails() {
		        System.out.println("Teacher ID: " + ID);
		        System.out.println("Teacher Name: " + name);
		        System.out.println("Courses Taught:");
		        for (Course c : coursesTaught) {
		            c.displayCourseDetails();
		        }
		    }
		}

		// Concrete Course class
		class SpecificCourse extends Course {
		    // Overloaded constructor
		    public SpecificCourse(String code, String courseName) {
		        super(code, courseName);
		    }

		    // Override displayCourseDetails method
		    @Override
		    public void displayCourseDetails() {
		        System.out.println("Course Code: " + code + ", Course Name: " + courseName);
		    }
		}

		// Main class
		public class InstitutionManagementApp {
		    public static void main(String[] args) {
		        // Create courses
		        Course course1 = new SpecificCourse("CS101", "Introduction to Computer Science");
		        Course course2 = new SpecificCourse("MATH101", "Calculus I");

		        // Create students and enroll them in courses
		        Student student1 = new Student(1, "Alice");
		        student1.enrollInCourse(course1);
		        student1.enrollInCourse(course2);

		        Student student2 = new Student(2, "Bob");
		        student2.enrollInCourse(course1);

		        // Create teachers and assign them courses to teach
		        Teacher teacher1 = new Teacher(101, "Dr. Smith");
		        teacher1.teachCourse(course1);

		        Teacher teacher2 = new Teacher(102, "Dr. Johnson");
		        teacher2.teachCourse(course2);

		        // Display details
		        System.out.println("Student Details:");
		        student1.displayDetails();
		        student2.displayDetails();

		        System.out.println("\nTeacher Details:");
		        teacher1.displayDetails();
		        teacher2.displayDetails();
		    }
		}

	}

}
