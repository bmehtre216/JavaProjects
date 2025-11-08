package tap;

public class Subarray {

	public static void main(String[] args) {
		
		int ar[] = {5,1,2,4,9,3,1,3,3};
		int size = 3;  //sub array size
		
		int i;
		int j;
		for(i=0; i<ar.length-size; i++)
		{
			for(j=i; j<i+3; j++)
			{
				System.out.print(ar[j]);
			}
			System.out.println();
		}
	}

}
