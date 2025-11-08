package datastructure;

public class Wrapper {

	public static void main(String[] args) {
		try {
		
			int x = Integer.parseInt("123");
			System.out.println(x);
			
			Integer x1 = Integer.valueOf("456");
			System.out.println(x1);
			
			int x2 = x1;
			System.out.println(x2);
			
		}
		catch(NumberFormatException e) {
			System.out.println("error");
		}
	}

}
