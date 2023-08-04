package polymorphism.problem2;

public class Triangle implements Shape {

	double side;

	public Triangle(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return 0.5 * side * side;
	}

}
