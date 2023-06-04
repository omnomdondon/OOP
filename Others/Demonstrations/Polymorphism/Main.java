package Polymorphism;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* For Inheritance
		Person male = new Male();
		Person female = new Female();
		
		male.voiceSound();
		female.voiceSound();
		*/
		
		/* For Polymorphism
		Person person = new Person();
		Person male = new Male();
		Person female = new Female();
		
		person.voiceSound();
		male.voiceSound();
		female.voiceSound(); */
		
		Person male = new Male();
		Person female = new Female();
		
		int talent;
		
		System.out.println("What is your talent? ");
		System.out.println("[1] can sing");
		System.out.println("[2] can dance");
		System.out.println("[3] can twerk");
		talent = input.nextInt();
		
		switch (talent) {
			case 1:
				male.talent = "can sing";
				male.talent();
				break;
			case 2:
				male.talent = " can dance";
				male.talent();
				break;
			case 3:
				male.talent = "can twerk";
				male.talent();
				break;
		}
	}

}
