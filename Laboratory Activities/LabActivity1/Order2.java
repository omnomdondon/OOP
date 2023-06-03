package LabActivity1;

public class Order2 extends FoodMenu {

	void MainMenu() {
		System.out.print("Enter second order : ");
		menuName = orderInput.nextLine();
		
		System.out.print("Enter amount of serving : ");
		amountOfServing = amountInput.nextInt();
	}
}
