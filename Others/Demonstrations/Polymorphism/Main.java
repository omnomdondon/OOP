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
		
		char gender = 0;
		System.out.print("Enter gender [M/F] ");
		char inputGender = input.next().charAt(gender);

		if (inputGender == 'm') {
			System.out.println("Male :");
			male.voiceSound();
			male.talent();
		}else if (inputGender == 'f') {
			System.out.println("Female :");
			female.voiceSound();
			female.talent();

		}
		
		input.close();
		
	}

}
