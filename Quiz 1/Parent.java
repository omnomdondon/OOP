package OOP;

public class Parent {
	
	// Attributes that Child1 and Child2 inherits.
	String attitude, hairColor, bloodType, property;
	
	/* info() method to display the parent's attributes when it is called 
	 * Child1 and Child2 also inherits this method*/
	void attributes() {
		System.out.println("Attitude   : " + attitude);
		System.out.println("Hair color : " + hairColor);
		System.out.println("Blood type : " + bloodType);
		System.out.println("Property   : " + property);
	}
	
}
