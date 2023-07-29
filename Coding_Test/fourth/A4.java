package fourth;

import java.io.*;

public class A4 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		@SuppressWarnings("unused")
		StringBuilder sb = new StringBuilder();
		@SuppressWarnings("unused")
		StreamTokenizer st;

		long n = Long.parseLong(br.readLine());

		System.out.println((n * (n - 1)) / 2);
		System.out.println(2);
	}
}
