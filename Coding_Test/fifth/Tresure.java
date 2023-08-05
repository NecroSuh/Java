package fifth;

import java.io.*;
import java.util.*;

public class Tresure {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(a);

		Integer[] b = new Integer[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			b[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(b, Comparator.reverseOrder());

		int ans = 0;
		for (int i = 0; i < n; i++)
			ans += a[i] * b[i];

		bw.write(ans + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
