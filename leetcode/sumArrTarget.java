package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class sumArrTarget {
	public static int[] twoSum(int nums[], int target) {
		HashMap<Integer, Integer> hMap = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if(hMap.containsKey(complement)) 
			{
				return new int[] {hMap.get(complement), i};
			}
			hMap.put(nums[i], i);
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int target = input.nextInt();
		int[] nums = new int[4];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}
		
		System.out.println(twoSum(nums, target));
	}

}