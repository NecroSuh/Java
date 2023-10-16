package seventh;

import java.io.*;
import java.util.*;

public class NM5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int num[] = new int[n];

		for (int i = 0; i < n; i++)
			num[i] = Integer.parseInt(br.readLine());
		Arrays.sort(num);

		for (int i = 0; i < n; i++)
			sb.append(num[i]).append("\n");
		System.out.println(sb);
	}
}
