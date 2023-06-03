package InterfaceInheritance;

public class MainAppInterface {

	public static void main(String[] args) {
		
		// For Toyota class
		Car toyota = new Toyota();
		toyota.wiper();
		toyota.pass();
		toyota.start();
		toyota.drive();
		
		System.out.println();
		
		// For Honda class
		Car honda = new Honda();
		honda.wiper();
		honda.pass();
		honda.start();
		honda.drive();
	}

}
