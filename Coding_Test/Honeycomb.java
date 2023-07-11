package second;

import java.util.Scanner;

public class Honeycomb {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int count = 1;
		int range = 1;
		int increment = 6;

		while (n > range) {
			range += increment;
			increment += 6;
			count++;
		}
		System.out.println(count);
		s.close();
	}
}
