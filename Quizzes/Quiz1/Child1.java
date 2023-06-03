package Quiz1;

public class Child1 extends Parent {
	
	// Attributes that Child2 inherits.
	String name, birthday;
	int age;
	
	void introduce() {
		System.out.println("Hi, my name is " + name + "!");
		System.out.println("I am " + age + " years old.");
		System.out.println("I was born in " + birthday + ".");
	}
}
