package second;

import java.util.Scanner;

public class Max_Array_Double {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] grid = new int[9][9];
		int max = 0;
		int maxRow = 0;
		int maxCol = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++)
				grid[i][j] = s.nextInt();
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (grid[i][j] > max) {
					max = grid[i][j];
					maxRow = i + 1;
					maxCol = j + 1;
				}
			}
		}
		System.out.println(max);
		System.out.println(maxRow + " " + maxCol);
		s.close();
	}
}
