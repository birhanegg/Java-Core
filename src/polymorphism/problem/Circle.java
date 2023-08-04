package polymorphism.problem;

public class Circle {

	double side;

	public Circle(double side) {
		this.side = side;
	}

	public double area() {
		return 3.14 * side * side;
	}

}
