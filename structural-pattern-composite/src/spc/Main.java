package spc;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Square square = new Square(4);
		
		ShapeGroup shapeGroup = new ShapeGroup();
		shapeGroup.addShape(circle);
		shapeGroup.addShape(square);
		
		Circle circle2 = new Circle(3);
		ShapeGroup shapeGroup2 = new ShapeGroup();
		shapeGroup2.addShape(circle2);
		
		ShapeGroup mainGroup = new ShapeGroup();
		mainGroup.addShape(shapeGroup);
		mainGroup.addShape(shapeGroup2);
		
		System.out.println("Total area : " + mainGroup.getArea());
	}

}
