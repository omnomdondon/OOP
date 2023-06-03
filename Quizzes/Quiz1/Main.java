package Quiz1;

public class Main {
	public static void main(String[] args) {
		
		// Parent
		Parent p = new Parent();
		p.attitude = "Jolly";
		p.hairColor = "Gray";
		p.bloodType = "A+";
		p.property = "BMW";
		
		// Child 1
		Child1 c1 = new Child1();
		c1.name = "Andrew";
		c1.age = 42;
		c1.birthday = "July 12, 1980";
		c1.attitude = "Moody";
		c1.hairColor = "Black";
		c1.bloodType = "AB+";
		c1.property = "BMW";
		
		// Child 2
		Child2 c2 = new Child2();
		c2.name = "Liza";
		c2.age = 23;
		c2.birthday = "August 19, 2000";
		c2.attitude = "Jolly";
		c2.hairColor = "Gray";
		c2.bloodType = "O+";
		c2.property = "Toyota Trueno";
		
		// Calling out Parent object
		System.out.println("Parent info");
		p.attributes();                      // Calls out the info() method 
		System.out.println();  				 // Random print line to separate objects from each other
		
		// Calling out Child1 object
		System.out.println("Child 1 info");
		c1.attributes();                     // Calls out the info() method
		System.out.println();                // Random print line to separate objects from each other
		c1.introduce();                      // Calls out the introduce() method
		System.out.println();                // Random print line to separate objects from each other
		
		// Calling out Child2 object
		System.out.println("Child 2 info");
		c2.attributes();                     // Calls out info() method
		System.out.println();                // Random print line to separate objects from each other
		c2.introduce();                      // Calls out introduce() method
	}
}
