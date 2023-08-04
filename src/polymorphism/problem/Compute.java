package polymorphism.problem;

import java.util.List;

public class Compute {

	public static double getTotalArea(Object[] objects) {
		double sum = 0;

		for (Object obj : objects) {

			if (obj instanceof Circle) {
				Circle c = (Circle) obj; // casting object into circle type
				sum += c.area();
			}
			if (obj instanceof Square) {
				Square s = (Square) obj; // down casting object into circle type
				sum += s.area();
			}
			if (obj instanceof Triangle) {
				Triangle t = (Triangle) obj; // casting object into circle type
				sum += t.area();
			}
		}
		return sum;
	}
}
