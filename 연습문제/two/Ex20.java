package two;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[4][4];
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				arr[i][j] = (int) (Math.random() * 10 + 1);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		s.close();
	}
}
