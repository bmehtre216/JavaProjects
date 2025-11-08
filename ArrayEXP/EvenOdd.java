package ArrayEXP;

public class EvenOdd {

	public static void main(String[] args) {
		int arr[]= {5,12,4,21,8,2,3,7,9,-8};
		
		System.out.println("arr elements");
		for(int i=0;i<arr.length;i++)          //print arr elements
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("even no from an array");
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0)                  //Even check
			{
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Odd no from an array");
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2!=0)                  //odd check
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("print even index position");
		for(int i=0;i<arr.length;i++) {
			
			if(i%2==0)                        //print only even index elements
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("print only 2 digit nos");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>9 && arr[i]<100)            //two digit no's with index position
			{
				System.out.println(i+" "+arr[i]);
			}
		}
		System.out.println("positive nos");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {                       //+ve nos
				System.out.println(arr[i]);
			}
		}
		System.out.println("-ve nos");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {                        //-ve nos
				System.out.println(arr[i]);
			}
		}
		System.out.println("divisible by 5 ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%5 == 0) {                    //divisible by 5
				System.out.println(arr[i]);
			}
		}
		System.out.println("elements divisible by 7");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%7==0) {
				System.out.println(arr[i]);
			}
		}
		double prod=1;
		/*for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {                          //even no
				prod=prod*arr[i];
			}
		}
		System.out.println("product :"+prod);     //-6144
		
		/*for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 != 0) {                               //Odd no
				prod=prod*arr[i];
			}
		}
		System.out.println("product :"+prod);     //19845 
		
		/*for (int i = 0; i < arr.length; i++) {
			if(arr[i]>9 && arr[i]<100) {            //two digit nos
				prod=prod*arr[i];
			}
		}
		System.out.println("product :"+prod); */   //252 
		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0) {                           //positive nos
				prod=prod*arr[i];
			}
		}
		System.out.println("product :"+prod); 
		
	}

}
