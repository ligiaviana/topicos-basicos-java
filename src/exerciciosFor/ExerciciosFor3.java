package exerciciosFor;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosFor3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double produto = 0.0;
		
		for (int i = 0; i < N; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			produto = a * 0.2 + b * 0.3 + c * 0.5;
		}
		
		System.out.printf("%.1f%n", produto);
		
		sc.close ();
		
	}

}
