package exerciciosFor;

import java.util.Scanner;

public class ExerciciosFor2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int quantIn = 0;
		int quantOut = 0;

		for (int i = 0; i < x; i++) {
			int N = sc.nextInt();
			if (N >= 10 && N <= 20) {
				quantIn = quantIn + 1;
			} else {
				quantOut = quantOut + 1;
			}

		}
		System.out.println(quantIn + " in");
		System.out.println(quantOut + " out");

		sc.close();

	}

}
