import java.util.Arrays;

public class Solutions {

	 public static int[] twoSum(int[] nums, int target) {
	        // Step 1: try every pair (i, j)
	        for (int i = 0; i < nums.length; i++) {             // Step 1.a
	            for (int j = i + 1; j < nums.length; j++) {     // Step 1.b
	                if (nums[i] + nums[j] == target) {         // Step 1.c
	                    return new int[]{i, j};                // Step 1.d
	                }
	            }
	        }
	        throw new IllegalArgumentException("No two sum solution");
	    }

	    public static void main(String[] args) {
	        int[] nums = {2, 7, 11, 15};
	        int target = 9;
	        int[] result = twoSum(nums, target);
	        System.out.println(Arrays.toString(result)); // prints [0, 1]
	    }

}
