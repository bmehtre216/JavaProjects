package practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main implements Cloneable {
	String name;
	
	public Main() {
		this.name=name;
	}
	
	void study() {
		System.out.println(name+" doing study.. ");
	}
	public static void main(String[] args) throws SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException  {
	
		/*
		 * Main obj = new Main("Raj"); 
		 * obj.study();
		 */
		/*
		 * System.out.println(); Main obj1 = Main.class.newInstance(); //no arg
		 * constructor o
		   bj1.study();
		 */
		
		/*
		 * System.out.println(); 
		 * Constructor<Main> cons = Main.class.getConstructor(String.class); Main obj2 =cons.newInstance("Raj");
		 * obj2.study();
		 */
		
		/*
		 * System.out.println(); 
		 * Main obj = new Main("Raj"); 
		 * Main clonable = (Main) obj.clone();
		 *  clonable.study();
		 */
	}
}
