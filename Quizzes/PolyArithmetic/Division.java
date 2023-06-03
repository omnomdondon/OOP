package PolyArithmetic;

public class Division extends Arithmetic {

	float x, y;
	
	void ArithCalculation(float x, float y) {
		this.x = x;
		this.y = y;
		float quotient = x / y;
		float roundOff = Math.round(quotient * 100.00f) / 100.00f;
		System.out.println("Division   : " + x + " / " + y + " = " + quotient + " or " + roundOff);
	}
}
