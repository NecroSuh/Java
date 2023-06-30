package first;

import java.util.Scanner;

public class Game_2048 {
	static int n;
	static int[][] board;
	static int answer;

	static void dfs(int count) {
		if (count == 5) {
			updateMaxBlock();
			return;
		}
		int[][] temp = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				temp[i][j] = board[i][j];
		}

		for (int dir = 0; dir < 4; dir++) {
			move(dir);
			dfs(count + 1);
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					board[i][j] = temp[i][j];
		}
	}

	static void move(int dir) {
		boolean[][] merged = new boolean[n][n];

		int dx = 0, dy = 0;
		if (dir == 0)
			dy = -1;
		else if (dir == 1)
			dx = 1;
		else if (dir == 2)
			dy = 1;
		else if (dir == 3)
			dx = 1;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				if (board[i][j] != 0) {
					int x = i;
					int y = j;
					int value = board[i][j];

					while (true) {
						int nx = x + dx;
						int ny = y + dy;

						if (nx < 0 || nx >= n || ny < 0 || ny >= n || (board[nx][ny] != 0 && board[nx][ny] != value))
							break;

						if (board[nx][ny] == value && !merged[nx][ny]) {
							board[nx][ny] += value;
							board[x][y] = 0;
							merged[nx][ny] = true;
							break;
						}

						if (board[nx][ny] == 0) {
							board[nx][ny] = value;
							board[x][y] = 0;
							x = nx;
							y = ny;
						}
					}
				}
			}
	}

	static void updateMaxBlock() {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				answer = Math.max(answer, board[i][j]);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		board = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = s.nextInt();
			}
		}
		answer = 0;

		dfs(0);
		System.out.println(answer);

		s.close();
	}
}
