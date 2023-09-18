package seventh;

import java.io.*;

public class Palindrome {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder(br.readLine());

		bw.write(((sb.toString().equals(sb.reverse().toString()) ? 1 : 0) + "\n"));
		bw.flush();
		bw.close();
		br.close();
	}
}
