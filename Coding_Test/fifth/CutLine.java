package fifth;

import java.util.*;

public class CutLine {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		Integer arr[] = new Integer[n];
		for (int i = 0; i < n; i++)
			arr[i] = s.nextInt();
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(arr[k - 1]);
		s.close();
	}
}
