
public class Ex2 {

	public static void main(String[] args) {
		char arr[];                                 //arr declaration
		arr=new char[7];                             //memory creation
		
		// arr initialization
		arr[0]='B';
		arr[1]='A';
		arr[2]='L';
		arr[3]='B';
		arr[4]='H';
		arr[5]=' ';
		arr[6]='M';
		
		System.out.println(arr.length);
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		/*System.out.print(arr[0]);
		System.out.print(arr[1]);
		System.out.print(arr[2]);
		System.out.print(arr[3]);
		System.out.print(arr[4]);
		System.out.print(arr[5]);
		System.out.print(arr[6]);*/
	}

}
