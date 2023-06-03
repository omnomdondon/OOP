package PolyArithmetic;

import java.util.*;

public class MainCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			Arithmetic add = new Addition();
			Arithmetic subtract = new Subtraction();
			Arithmetic multiply = new Multiplication();
			Arithmetic divide = new Division();
			
			float num1, num2;
			
			System.out.print("Enter first number : ");
			num1 = input.nextFloat();
			
			System.out.print("Enter second number : ");
			num2 = input.nextFloat();
			
			System.out.println();
			
			add.ArithCalculation(num1, num2);
			subtract.ArithCalculation(num1, num2);
			multiply.ArithCalculation(num1, num2);
			divide.ArithCalculation(num1, num2);
			
			input.close();
		}
		catch (Exception e) {
			System.out.println("Invalid input.");
		}
		
	}

}
