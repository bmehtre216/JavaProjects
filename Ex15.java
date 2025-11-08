
//Jagged array---If we are creating odd no of columns in 2D array then it is known as jagged array.
public class Ex15 {

	public static void main(String[] args) {
		
		int arr[][];
		arr=new int[4][4];
		
		arr[0]=new int[4];
		arr[1]=new int[2];
		arr[2]=new int[3];
		arr[3]=new int[1];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[0][3]=40;
		
		arr[1][0]=50;
		arr[1][1]=60;
		
		arr[2][0]=70;
		arr[2][1]=80;
		arr[2][2]=90;
		
		arr[3][0]=100;
		
		int i,j;
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
