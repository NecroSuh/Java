package eighth;

import java.io.*;
import java.util.*;

public class Select_Sort2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), cnt = 0;
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(st.nextToken());

		for (int i = n - 1; i >= 0; i--) {
			int max = 0, idx = 0;
			for (int j = 0; j < i; j++) {
				if (max < a[j]) {
					max = a[j];
					idx = j;
				}
			}
			if (a[i] < a[idx]) {
				int tmp = a[i];
				a[i] = a[idx];
				a[idx] = tmp;
				cnt++;
			}
			if (cnt == k)
				break;
		}
		if (cnt < k)
			System.out.println(-1);
		else {
			for (int i = 0; i < n; i++)
				sb.append(a[i] + " ");
			System.out.println(sb.toString());
		}
	}
}
