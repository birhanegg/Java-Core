package polymorphism.solution;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Shape circle = new Circle(4);
		System.out.println("area of circle : " + circle.area());

		Shape square = new Square(4);
		System.out.println("area of square: " + square.area());

		Shape triangle = new Triangle(4);
		System.out.println("area of triangle: " + triangle.area());

		//Shape[] shapes = { circle, square, triangle };
		List<Shape> list = Arrays.asList(circle, square, triangle);

		System.out.println("Total sum: " + TotalArea.getTotalArea(list));
	}
}
