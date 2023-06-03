package PolyArithmetic;

public class Subtraction extends Arithmetic {

	float x, y;
	
	void ArithCalculation(float x, float y) {
		this.x = x;
		this.y = y;
		float difference = x - y;
		System.out.println("Difference : " + x + " - " + y + " = " + difference);
	}
}
