package polymorphism.problem;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(4);
		System.out.println("area of circle : " + circle.area());

		Square square = new Square(4);
		System.out.println("area of square: " + square.area());

		Triangle triangle = new Triangle(4);
		System.out.println("area of triangle: " + triangle.area());

		Object[] objects = { circle, square, triangle };
		System.out.println("Total sum: " + Compute.getTotalArea(objects));
	}
}
