package tap;

public class Raj {

	public static void main(String[] args) {
		int ar[] = {2, 4, 3, 6, 9};
		
		int max=ar[0];
		for (int i = 1; i < ar.length; i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println("Max Element : "+max);
	}

}
