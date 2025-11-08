package Constructor;

class box{
	int length,width,height;
	box()                        //default constructor
	{
		length=12;
		width=4;
		height=6;
		System.out.println("class property/variables");
	}
	public void showData()
	{
		System.out.println(length+" "+width+" "+height);
	}
}
public class Ex2 {

	public static void main(String[] args) {
		box obj=new box();
		obj.showData();
	}
}
