package fifth;

import java.io.*;
import java.util.*;

public class Sort_num3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);

		for (int i = 0; i < n; i++)
			sb.append(arr[i]).append('\n');
		System.out.println(sb);
	}
}