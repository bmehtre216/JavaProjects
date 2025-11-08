package arr;

public class ExceptionMultipleDemo {

	public static void main(String[] args) {
		
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int res = n1/n2;
			
			System.out.println("Result = "+res);  //if exception occurs in above lines 
			System.out.println("Statement After caught exception in catch");  //these lines will not be execute
		}
		catch (ArithmeticException e) 
		{
			System.err.println("Divide by zero not allowed");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.err.println("Require two numbers");
		}
		catch (NumberFormatException e) 
		{
			System.err.println("Enter only numbers");
		}
		catch (RuntimeException e) 
		{
			System.err.println("Runtime exception occured");
		}
		catch (Exception e)
		{
			System.out.println("Exception occured");
		}
	}

}
