
//Array :Array is a collection of variables of same data type.
//print array elements

public class Ex1 {

	public static void main(String[] args) {
		int arr[];                               //Array declaration
		arr=new int[4];                          //Memory creation
		
		//Array initialization
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		//int arr[]={1,2,3,4};
		System.out.println("length="+arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		String s= "Hello Sir";
		System.out.println("String size = "+s.length());
	}

}
