package csd;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		QuadricEquationSolverApp.run();
	}

}

class QuadricEquationSolverApp {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Katsayıları giriniz: ");
		double a = Double.parseDouble(kb.nextLine());
		double b = Double.parseDouble(kb.nextLine());
		double c = Double.parseDouble(kb.nextLine());
		
		QuadricEquationSolver.printRoots(a, b, c);
	}
}

class QuadricEquationSolver {
	public static void differentRoots(double delta, double a, double b)
	{
		double sqrtDelta = Math.sqrt(delta);
		
		double x1 = (-b + sqrtDelta) / (2 * a);
		double x2 = (-b - sqrtDelta) / (2 * a);
		
		System.out.printf("x1 = %f, x2 = %f%n", x1, x2);
		
	}
	
	public static void sameRoots(double a, double b)
	{	
		double x = -b / (2 * a);
		
		System.out.printf("x1 = x2 = %f%n", x);
		
	}
	
	public static double calculateDelta(double a, double b, double c)
	{
		return b * b - 4 * a * c;
	}
	
	public static void printRoots(double a, double b, double c)
	{
		double delta = calculateDelta(a, b, c);
		
		if (delta > 0)
			differentRoots(delta, a, b);
		else if (delta == 0)
			sameRoots(a, b);
		else
			System.out.println("Gerçek kök yoktur");
		
	}
}
