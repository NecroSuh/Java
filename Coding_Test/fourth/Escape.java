package fourth;

import java.io.*;
import java.util.StringTokenizer;

public class Escape {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int x_min = Math.min((w - x), x);
		int y_min = Math.min((h - y), y);

		System.out.println(Math.min(x_min, y_min));
	}
}
