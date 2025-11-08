
public class Ex4 {

	public static void main(String[] args) {
		int arr[],sum=0;                                 //arr declaration
		arr=new int[7];                             //memory creation
		
		// arr initialization
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		arr[6]=70;
		
		System.out.println("arr length="+arr.length);
		
		int i;
		for(i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];	
		}
		System.out.println(sum);
	}
}
