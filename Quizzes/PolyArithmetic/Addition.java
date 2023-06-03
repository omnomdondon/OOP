package PolyArithmetic;

public class Addition extends Arithmetic {
	
	float x, y;
	
	void ArithCalculation(float x, float y) {
		this.x = x;
		this.y = y;
		float sum = x + y;
		System.out.println("Sum        : " + x + " + " + y + " = " + sum);
	}
}
