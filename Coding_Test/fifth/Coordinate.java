package fifth;

import java.io.*;
import java.util.*;

public class Coordinate {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]);
			arr[i][1] = Integer.parseInt(str[1]);
		}
		Arrays.sort(arr, (e1, e2) -> {
			if (e1[0] == e2[0])
				return e1[1] - e2[1];
			else
				return e1[0] - e2[0];
		});
		for (int i = 0; i < n; i++)
			System.out.println(arr[i][0] + " " + arr[i][1]);
	}
}
