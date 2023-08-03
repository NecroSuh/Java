package fifth;

import java.util.*;

public class Sort_Age {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		String[][] arr = new String[n][2];

		for (int i = 0; i < n; i++) {
			arr[i][0] = s.next();
			arr[i][1] = s.next();
		}
		Arrays.sort(arr, new Comparator<String[]>() {
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});
		for (int i = 0; i < n; i++)
			System.out.println(arr[i][0] + " " + arr[i][1]);
		s.close();
	}
}
