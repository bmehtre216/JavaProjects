package ArrayEXP;

public class MultiDimention1 {

	public static void main(String[] args) {
		
		int nums[][] = new int[3][4];
		
				//Assigning values
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				
				nums[i][j] = (int) (Math.random() * 10);
			}
		}
				//printing array using
		System.out.println("-----Normal for loop-----");
		
		for (int i = 0; i < nums.length; i++) {  
			for (int j = 0; j < nums[i].length; j++) {
				
				System.out.print(nums[i][j] +" ");	
			}
			System.out.println();
		}
		
		System.out.println("-----Enhanced for loop-----");
		
		for (int n[] : nums) {  
			for (int m : n) {
				
				System.out.print(m +" ");	
			}
			System.out.println();
		}
	}

}
