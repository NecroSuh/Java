package second;

import java.util.Scanner;

public class Avg {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] score = new int[n];

		int max = 0;
		double sum = 0;

		for (int i = 0; i < n; i++)
			score[i] = s.nextInt();

		for (int i = 0; i < n; i++) {
			if (score[i] > max)
				max = score[i];
		}
		for (int i = 0; i < n; i++) {
			sum += (double) score[i] / max * 100;
		}
		double avg = sum / n;
		System.out.println(avg);

		s.close();
	}
}
