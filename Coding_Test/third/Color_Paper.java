package third;

import java.util.Scanner;

public class Color_Paper {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[][] paper = new int[101][101];
		int area = 0;

		for (int i = 0; i < n; i++) {
			int x = s.nextInt();
			int y = s.nextInt();

			for (int j = x; j < x + 10; j++)
				for (int k = y; k < y + 10; k++)
					paper[j][k] = 1;
		}
		for (int i = 1; i <= 100; i++)
			for (int j = 1; j <= 100; j++)
				if (paper[i][j] == 1)
					area++;
		System.out.println(area);
		s.close();
	}
}
