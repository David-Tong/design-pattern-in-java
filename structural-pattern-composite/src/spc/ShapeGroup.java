package spc;

import java.util.ArrayList;
import java.util.List;

public class ShapeGroup implements Shape {
	
	private List<Shape> shapes = new ArrayList<Shape>();
	
	public void addShape(Shape shape) {
		shapes.add(shape);
	}

	@Override
	public double getArea() {
		double totalArea = 0;
		for (Shape shape : shapes) {
			totalArea += shape.getArea();
		}
		return totalArea;
	}

}
