package practice;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("raj");
		employee.setAge(27);
		employee.setSalary(9000);
		
		System.out.println(employee.getEmpDetails());
		
		employee.setName("prashant sir");
		System.out.println(employee.getEmpDetails());
	}

}
