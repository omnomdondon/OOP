package InterfaceInheritance;

public class Toyota implements Car {

	@Override
	public void wiper() {
		System.out.println("This Toyota turned on its wiper");
	}

	@Override
	public void pass() {
		System.out.println("This Toyota did a pass light signal");
	}

	@Override
	public void start() {
		System.out.println("This Toyota started its engine");
	}

	@Override
	public void drive() {
		System.out.println("This Toyota drove off");
	}

	
}
