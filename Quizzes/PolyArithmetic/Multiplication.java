package PolyArithmetic;

public class Multiplication extends Arithmetic{

	float x, y;
	
	void ArithCalculation(float x, float y) {
		this.x = x;
		this.y = y;
		float product = x * y;
		System.out.println("Product    : " + x + " * " + y + " = " + product);
	}
}
