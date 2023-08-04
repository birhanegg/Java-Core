package polymorphism.problem2;

import java.util.List;

public class Compute {

	// change param into list of shape //List<Shape> shapes
	public static double getTotalArea(List<Shape> objects) {
		double sum = 0;

		// use for each shape
		for (Shape obj : objects) {

			sum += obj.area();
		}
		return sum;
	}
}
