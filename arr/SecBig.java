package arr;

public class SecBig {

	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		int[] n = {5,9,6,4,7,9};
		System.out.println(secondLargest(n));
	}
	
	public static int secondLargest(int[] n) {
		
		int max1=0, max2=0;
		if(n[0] > n[1]) {
			max1 = n[0];
			max2 = n[1];
		}
		else {
			max1 = n[1];
			max2 = n[0];
		}
		
		for(int i = 2; i < n.length; i++) {
			if(n[i] > max1) {
				max2 = max1;
				max1 = n[i];
			}
			else if(n[i] > max2) {
				max2 = n[i];
			}
		}
		return max2;
	}
}
