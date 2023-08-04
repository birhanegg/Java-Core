package polymorphism.problem;

public class Triangle {

	double side;

	public Triangle(double side) {
		this.side = side;
	}

	public double area() {
		return 0.5 * side * side;
	}
}
