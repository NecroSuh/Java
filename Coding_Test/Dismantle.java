package first;

import java.util.Scanner;

public class Dismantle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int result = 0;

		for (int i = 1; i < n; i++) {
			int sum = i;
			int temp = i;
			while (temp > 0) {
				sum += temp % 10;
				temp /= 10;
			}

			if (sum == n) {
				result = i;
				break;
			}
		}
		System.out.println(result);
		s.close();
	}
}
