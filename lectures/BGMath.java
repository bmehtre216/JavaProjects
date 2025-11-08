package lectures;

public class BGMath {

	public static void main(String[] args) {
		System.out.println("Welcome to Math() function \n");
		System.out.println(Math.abs(-99));
		System.out.println(Math.ceil(11.023));
		System.out.println(Math.floor(11.023));
		System.out.println(Math.round(11.023));
		System.out.println(Math.max(9, 10));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(25));
		System.out.println("PI: "+Math.PI);
		System.out.println("E: "+Math.E);
		System.out.println(Math.random()); //generate random value b/w  0 -to- 1.0
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Math.random());
		}
	}
	

}
