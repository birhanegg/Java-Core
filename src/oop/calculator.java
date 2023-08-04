package oop;

// static/ compile time/ method over loading
public class calculator {
	static int sum(int a, int b) {
		return a + b;
	}

	static double sum(double a, double b) {
		return a + b;
	}

	static double sum(double a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println(calculator.sum(2, 5));
		System.out.println(calculator.sum(2.0, 66));
		System.out.println(calculator.sum(3.0, 4, 66));

	}

}
