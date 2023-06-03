package LabActivity1;

import java.util.*;
public abstract class FoodMenu extends MainMenu {
	
	String menuName;
	int amountOfServing;
	
	Scanner orderInput = new Scanner(System.in);
	Scanner amountInput = new Scanner(System.in);
	
	abstract void MainMenu();
	
	void setOrder(String menuName) {
		this.menuName = menuName;
	}
	
	void getOrder() {
		System.out.println("Your order " + menuName);
	}
	
	void setAmount(int amount) {
		this.amountOfServing = amount;
	}
	
	void getAmount() {
		System.out.println("Amount of Serving : " + amountOfServing);
	}
}
