package com.ektha.shapecreator.inheritance.test;

import java.util.Scanner;

public class TypeOfShape {
	public void getShape() {
		Scanner scanner = new Scanner(System.in);

		int shapeType = 0;
		System.out.print("enter the Shape Type: 1-Triangle , 2-Rectangle, 3-Square ");
		shapeType = scanner.nextInt();
		boolean accepted = false;
		do {
			try {

				if (shapeType >= 1 || shapeType <= 2 || shapeType <= 3)

					accepted = true;
				else {
					System.out.println("enter the valid number");
					scanner.nextLine();
				}

			} catch (Exception ex) {
				System.out.println("enter the valid input");
				scanner.nextLine();
			}
		} while (!accepted);
		ShapeValidation validation = new ShapeValidation();

		validation.validateShapes(shapeType);

		scanner.close();
	}
}
