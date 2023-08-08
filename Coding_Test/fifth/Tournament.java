package fifth;

import java.util.*;
import java.io.*;

public class Tournament {
	static int str(String s) {
		return Integer.parseInt(s);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		@SuppressWarnings("unused")
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		@SuppressWarnings("unused")
		int n = str(st.nextToken());
		int a = str(st.nextToken());
		int b = str(st.nextToken());

		int round = 0;

		while (a != b) {
			a = a / 2 + a % 2;
			b = b / 2 + b % 2;
			round++;
		}
		System.out.println(round);
	}
}
