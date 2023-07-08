package second;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int max = 0;
		int index = 0;

		for (int i = 1; i <= 9; i++) {
			int num = s.nextInt();
			if (num > max) {
				max = num;
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index);
		s.close();
	}
}
