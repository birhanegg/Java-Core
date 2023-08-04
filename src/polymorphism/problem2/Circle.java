package polymorphism.problem2;

//impl Shape interface 
public class Circle implements Shape {

	double side;
	
	public Circle(double side) {
		this.side = side;
	}

	@Override
	public double area() {

		return 3.14 * side * side;
	}

}
