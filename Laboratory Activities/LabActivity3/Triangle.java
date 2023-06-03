package LabActivity3;

public class Triangle implements Area {

	float area, b, h;
	
	@Override
	public void getArea() {
		System.out.println("Solving for the area of a triangle");
		System.out.print("Enter the base : ");
		b = input.nextFloat();
		
		System.out.print("Enter the height : ");
		h = input.nextFloat();
	}

	@Override
	public void solveArea() {
		area = (b * h) / 2;
		System.out.println("Area of the triangle : " + area);
		System.out.println();
	}

	

}
