package third;

import java.util.Scanner;

public class Max_Array {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num[][] = new int[10][10];
		int max = 0;
		int x = 0, y = 0;

		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++) {
				num[i][j] = s.nextInt();
				if (max < num[i][j]) {
					max = num[i][j];
					x = i;
					y = j;
				}
			}
		System.out.println(max);
		System.out.println((x + 1) + " " + (y + 1));
		s.close();
	}
}
