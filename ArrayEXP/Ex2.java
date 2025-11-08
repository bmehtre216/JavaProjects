package ArrayEXP;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int []z=new int[20];
		int pos=0;
		int neg=0;
		int odd=0;
		int even=0;
		int zero=0;
		/*for(int i=0;i<z.length;i++)
		{
			z[i]=s.nextInt();
			System.out.println("print the value of z["+i+"]="+z[i]);
			
		}*/
		for(int i=0;i<z.length;i++) {
			z[i]=s.nextInt();
			
			if(z[i]>0)
			{
				System.out.println("pos");
			}
			else if(z[i]<0){
				System.out.println("neg");
			}
			else
				System.out.println("zero");
		}
		System.out.println("enter nos");
		
	}
	

}
