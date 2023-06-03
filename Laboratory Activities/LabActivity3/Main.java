package LabActivity3;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		try (Scanner console = new Scanner(System.in)) {
			
			int choice;
			
			do {
				System.out.println("Choose a shape.");
				System.out.println("[1] Triangle");
				System.out.println("[2] Rectangle");
				System.out.println("[3] Circle");
				System.out.println("[4] Trapezoid");
				System.out.println("[0] Exit");
				choice = console.nextInt();
				
				switch (choice) {
					case 1:
						Area triangle = new Triangle();
						triangle.getArea();
						triangle.solveArea();
						break;
					case 2:
						Area rectangle = new Rectangle();
						rectangle.getArea();
						rectangle.solveArea();
						break;
					case 3:
						Area circle = new Circle();
						circle.getArea();
						circle.solveArea();
						break;
					case 4:
						Area trapezoid = new Trapezoid();
						trapezoid.getArea();
						trapezoid.solveArea();
						break;
				}
			}while (choice != 0);
			System.out.println("Exit");
		}
	}
}
