package nestedClass;

public class ArrayOperationsTest {

	public static void main(String[] args) {
		
		ArrayOperations outer = new ArrayOperations(new int[] {1,2,3,6});
		ArrayOperations.Statistics inner = outer.new Statistics();
		System.out.println(inner.mean());
	}
}
