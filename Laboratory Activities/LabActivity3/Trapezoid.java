package LabActivity3;

public class Trapezoid implements Area {
	
	float area, a, b, h;

	@Override
	public void getArea() {
		System.out.println("Solving for the area of a trapezoid");
		System.out.print("Enter the base (a) : ");
		a = input.nextFloat();
		
		System.out.print("Enter the base (b) : ");
		b = input.nextFloat();
		
		System.out.print("Enter the height : ");
		h = input.nextFloat();
		
	}

	@Override
	public void solveArea() {
		area = (a + b) / 2 * h;
		System.out.println("Area of the trapezoid : " + area);
		System.out.println();
	}
	
	
}
