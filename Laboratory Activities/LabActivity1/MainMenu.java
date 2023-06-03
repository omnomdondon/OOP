package LabActivity1;

public class MainMenu {

	public static void main(String[] args) {
		
		FoodMenu order1 = new Order1();
		FoodMenu order2 = new Order2();
		
		order1.MainMenu();
		order1.getOrder();
		System.out.println();
		
		order2.MainMenu();
		order2.getOrder();
		order2.getAmount();
	}
}
