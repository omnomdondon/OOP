package InterfaceInheritance;

public class Honda implements Car {

	@Override
	public void wiper() {
		System.out.println("This Honda Civic turned on its wiper");
	}

	@Override
	public void pass() {
		System.out.println("This Honda Civic did a pass light signal");
	}

	@Override
	public void start() {
		System.out.println("This Honda Civic started its engine");
	}

	@Override
	public void drive() {
		System.out.println("This Honda Civic drove off");
	}
	
}
