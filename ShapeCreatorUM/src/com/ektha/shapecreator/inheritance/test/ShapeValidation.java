package com.ektha.shapecreator.inheritance.test;

public class ShapeValidation {

	boolean validateShapes(int shapeTpye) {
		// Shapes s = new Shapes();
		if (shapeTpye == 1) {
			Shapes triangle = new Triangle();
			// Triangle triangle = new Triangle();
			triangle.getShapedrawing();
		}
		if (shapeTpye == 2) {
			Shapes rectangle = new Rectangle();
			// Rectangle rectangle = new Rectangle();
			rectangle.getShapedrawing();
		}
		if (shapeTpye == 3) {
			Shapes square = new Square();
			// Square square = new Square();
			square.getShapedrawing();

		}
		return false;
	}

}
