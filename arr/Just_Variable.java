package arr;
class Student
{
	String name;
	static String college = " ABC college";
	
	void addStudInfo() {
		//static String city = "Pune";  // static variables can't be declare in method's...
	}
}
public class Just_Variable {
	
	public static void main(String[] args) {
		
		 Student s1 = new Student();
	       s1.name = "Rahul";

	        Student s2 = new Student();
	        s2.name = "Priya";

	        System.out.println(s1.name + " - " + s1.college);
	        System.out.println(s2.name + " - " + s2.college);

	        // Change static variable
	        s2.college = "XYZ College";

	        System.out.println(s1.name + " - " + s1.college);
	        System.out.println(s2.name + " - " + s2.college);
	        
	        System.out.println("------------");
	        
	        Student s3 = new Student();
	        s3.college = "PQR College";
	        
	        System.out.println(s1.name + " - " + s1.college);
	        System.out.println(s2.name + " - " + s2.college);
	        System.out.println(s3.name+ "  - " + s3.college);
	        
	        
	        
	  
		
	}

}
