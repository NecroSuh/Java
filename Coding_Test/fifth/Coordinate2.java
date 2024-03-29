package fifth;

import java.util.*;

public class Coordinate2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][1] = s.nextInt();
			arr[i][0] = s.nextInt();
		}
		Arrays.sort(arr, (e1, e2) -> {
			if (e1[0] == e2[0])
				return e1[1] - e2[1];
			else
				return e1[0] - e2[0];
		});
		for (int i = 0; i < n; i++)
			System.out.println(arr[i][1] + " " + arr[i][0]);
		s.close();
	}
}
