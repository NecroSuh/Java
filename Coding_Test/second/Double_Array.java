package second;

import java.util.Scanner;

public class Double_Array {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();

		int[][] a = new int[n][m];
		int[][] b = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				a[i][j] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				b[i][j] = s.nextInt();
		}
		int[][] result = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				result[i][j] = a[i][j] + b[i][j];
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				System.out.print(result[i][j] + " ");
			System.out.println();
		}
		s.close();
	}
}
