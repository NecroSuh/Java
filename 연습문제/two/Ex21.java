package two;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[4][4];
		int result = 0;
		while (result < 10) {
			int p1 = (int) (Math.random() * 4);
			int p2 = (int) (Math.random() * 4);
			if (arr[p1][p2] == 0) {
				arr[p1][p2] = (int) (Math.random() * 10 + 1);
				result++;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		s.close();
	}
}
