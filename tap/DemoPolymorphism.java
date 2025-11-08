package tap;

class Plane
{
	void fly()
	{
		System.out.println("Plane is flying");
	}
}
class CargoPlane extends Plane
{
	void fly()
	{
		System.out.println("CargoPlane is flying at low heights");
	}
}
class PassengerPlane extends Plane
{
	void fly()
	{
		System.out.println("PassengerPlane is flying at medium heights");
	}
}
class FighterPlane extends Plane
{
	void fly()
	{
		System.out.println("FighterPlane is flying at great heights");
	}
}
public class DemoPolymorphism {
	
	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane(); 
		FighterPlane fP = new FighterPlane();
		
		Plane ref;
		
		ref = cp;
		ref.fly();
		
		ref = pp;
		ref.fly();
		
		ref = fP;
		ref.fly();
	}
}
/* Polymorphism - in java same method can behave in different way
 * 1.compiletime - multiple methods having same name but signature diff
 * 2.runtime - 	method name and signature also same
 */

