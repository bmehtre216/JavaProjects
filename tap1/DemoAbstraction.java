package tap1;

abstract class Plane
{
	abstract void takeOff();
	abstract void fly();
	abstract void land();
}
class CargoPlane extends Plane{

	@Override
	void takeOff() {
		System.out.println("CargoPlane is taking off from a long sized runway");
	}

	@Override
	void fly() {
		System.out.println("CargoPlane is flying at low heights");
	}

	@Override
	void land() {
		System.out.println("CargoPlane is landing on long sized runway");
	}	
}

class PassengerPlane extends Plane
{
	@Override
	void takeOff() {
		System.out.println("PassengerPlane is taking off from a medium sized runway");
	}

	@Override
	void fly() {
		System.out.println("PassengerPlane is flying at medium heights");
	}

	@Override
	void land() {
		System.out.println("PassengerPlane is landing on medium sized runway");
	}
}

class FighterPlane extends Plane
{
	@Override
	void takeOff() {
		System.out.println("FighterPlane is taking off from a short sized runway");
	}

	@Override
	void fly() {
		System.out.println("FighterPlane is flying at great heights");
	}

	@Override
	void land() {
		System.out.println("FighterPlane is landing on short sized runway");
	}
}

class Airport{
	
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class DemoAbstraction {

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();	
		
		Airport ref = new Airport();
		ref.permit(cp);
		ref.permit(pp);
		ref.permit(fp);
	}

}
