package ru.stqa.pft.sandbox;

class MyFirstProgram {
	public static void main(String[] args) {
		hello("Oleg");
		hello("Bob");

		double l = 5;
		System.out.println("Area = " + area(l));

		double a = 4;
		double b = 7;
		System.out.println("Area = " + area(a, b));
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area(double l) {
		return l * l;
	}

	public static double area(double a, double b) {
		return a * b;
	}
}	