
public class Ex14 {

	public static void main(String[] args) {
		
		int arr[][]={{10,20,50},{30,40,60}};
		
		System.out.println("length="+arr.length);
		System.out.println("0th row c length="+arr[0].length);
		System.out.println("1st row c length="+arr[1].length);
		
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
