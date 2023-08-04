package polymorphism.problem2;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//use Shape type/class for object
		Shape circle = new Circle(4);
		System.out.println("area of circle : " + circle.area());

		Shape square = new Square(4);
		System.out.println("area of square: " + square.area());

		Shape triangle = new Triangle(4);
		System.out.println("area of triangle: " + triangle.area());

		//use parameterize list instead of array //List<Shape>  shapes = Arrays.asList(c,q,t);
		List <Shape> objects = Arrays.asList(circle, square, triangle);
		System.out.println("Total sum: " + Compute.getTotalArea(objects));
	}
}
