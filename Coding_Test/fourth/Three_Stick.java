package fourth;

import java.io.*;
import java.util.StringTokenizer;

public class Three_Stick {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int max = 0;
		if (a > b) {
			if (b > c)
				max = a;
			else
				max = (a > c) ? a : c;
		} else
			max = (b > c) ? b : c;
		if (a + b + c - max > max)
			System.out.println(a + b + c);
		else
			System.out.println((a + b + c - max) * 2 - 1);
		br.close();
	}
}
