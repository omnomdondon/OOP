package LabActivity3;

public class Rectangle implements Area {

	float area, l, w;
	
	@Override
	public void getArea() {
		System.out.println("Solving for the area of a rectangle");
		System.out.print("Enter the length : ");
		l = input.nextFloat();
		
		System.out.print("Enter the height : ");
		w = input.nextFloat();
	}

	@Override
	public void solveArea() {
		area = l * w;
		System.out.println("Area of the rectangle : " + area);
		System.out.println();
	}

}
