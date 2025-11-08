package arr;

public class IsSortedArray {

	public static void main(String[] args) {
											   System.out.println("Welcome to Array sorting check \n");
		int[] numArr = ArrayUtility.inputArray();
		boolean isAsc = isIncreasing(numArr);
		                                       System.out.println("isAsc: "+isAsc);
		boolean isDec = isDecreasing(numArr);
		                                       System.out.println("isDec: "+isDec);
		if( isAsc || isDec) {
			System.err.println("your array is sorted ");
		}else {
			System.err.println("your array is not sorted ");
		}
	}
	public static boolean isIncreasing(int[] numArr) {
		int i = 1;
		while(i < numArr.length) {
			if(numArr[i] < numArr[i-1]) {
				return false;
			}
			i++;
		}
		return true;
	}
	public static boolean isDecreasing(int[] numArr) {
		
		  int i = 1;
		  while(i < numArr.length) {
			  if(numArr[i] > numArr[i-1]) {
				  return false; 
			} i++;
		}
		return true;
	}

}
