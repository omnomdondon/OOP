package LabActivity3;

public class Circle implements Area {

	float area, r;

	@Override
	public void getArea() {
		System.out.println("Solving for the area of a cirle");
		System.out.print("Enter the radius : ");
		r = input.nextFloat();
	}

	@Override
	public void solveArea() {
		area = (3.14159465f * (r * r));
		System.out.println("Area of the circle : " + area);
		System.out.println();
	}
	
	
}
