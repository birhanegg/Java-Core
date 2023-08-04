package polymorphism.solution;

import java.util.List;

public class TotalArea {

	public static double getTotalArea(List<Shape> shapes) {
		double sum = 0;
		for (Shape shape : shapes) {
			sum = sum + shape.area();
		}
//		for (Object obj : shapes) {
//
//			if (obj instanceof Circle) {
//				Circle c = (Circle) obj; // casting object into circle type
//				sum += c.area();
//			}
//			if (obj instanceof Square) {
//				Square s = (Square) obj; // down casting object into circle type
//				sum += s.area();
//			}
//			if (obj instanceof Triangle) {
//				Triangle t = (Triangle) obj; // casting object into circle type
//				sum += t.area();
//			}
//		}
		return sum;
	}
}
