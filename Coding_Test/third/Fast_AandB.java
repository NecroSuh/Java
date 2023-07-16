package third;

import java.io.*;

public class Fast_AandB {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);

			int sum = a + b;

			bw.write(String.valueOf(sum));
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
