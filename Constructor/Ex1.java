package Constructor;

class A{
	int a=10; String name="abc";
	A()                         //default constructor
	{
		a=0; name=null;
	}
	void fun() {
		System.out.println(a+" "+name);
	}
}
public class Ex1 {

	public static void main(String[] args) {
		A obj=new A();
		obj.fun();
		
	}
}
