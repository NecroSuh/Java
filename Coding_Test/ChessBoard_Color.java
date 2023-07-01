package first;

import java.util.Scanner;

public class ChessBoard_Color {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int m = s.nextInt();

		char[][] board = new char[n][m];

		for (int i = 0; i < n; i++) {
			String row = s.next();
			for (int j = 0; j < m; j++)
				board[i][j] = row.charAt(j);
		}

		int minCount = Integer.MAX_VALUE;

		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				int count = calculateCount(board, i, j);
				minCount = Math.min(minCount, count);
			}
		}
		System.out.println(minCount);

		s.close();
	}

	public static int calculateCount(char[][] board, int startX, int startY) {
		int c1 = 0;
		int c2 = 0;

		char[] colors1 = { 'B', 'W' };
		char[] colors2 = { 'W', 'B' };

		for (int i = startX; i < startX + 8; i++)
			for (int j = startY; j < startY + 8; j++) {
				if (board[i][j] != colors1[(i - startX + j - startY) % 2])
					c1++;
				if (board[i][j] != colors2[(i - startX + j - startY) % 2])
					c2++;
			}
		return Math.min(c1, c2);
	}
}
