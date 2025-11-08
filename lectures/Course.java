package lectures;

public class Course {
	static int maxCapacity = 100;
	String courseName;
	int enrollments;
	String[] enrolledStudents;
	
	Course(String courseName) {
		this.courseName = courseName;
		this.enrollments = 0;
		this.enrolledStudents = new String[maxCapacity];
	}
	
	static void setMaxCapacity(int maxCapacity) {
		Course.maxCapacity = maxCapacity;
	}
	
	void enrollStudent(String studentName) {
		enrolledStudents[enrollments] = studentName;
		enrollments++;
	}
	
	void unenrollStudent(String studentName) {
		System.out.println("Student removed");
		enrollments--;
	}
	
	
	public static void main(String[] args) {
	
		System.out.println(maxCapacity);
		Course c = new Course("Angular");
		c.setMaxCapacity(200);
		System.out.println(maxCapacity);
		System.out.println(c.courseName);
		System.out.println(c.enrollments);
		
		c.enrollStudent("raam");
		c.enrollStudent("shyaam");
		System.out.println(c.enrolledStudents[0]);

		System.out.println(c.enrolledStudents[1]);
		System.out.println(c.enrollments);
		
	}

}
