package fourth;

import java.io.*;

interface A6 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		@SuppressWarnings("unused")
		StringBuilder sb = new StringBuilder();
		@SuppressWarnings("unused")
		StreamTokenizer st;

		long n = Long.parseLong(br.readLine()) - 2;

		System.out.println(((n * n * n) + (3 * n * n) + (2 * n)) / 6);
		System.out.println(3);
	}
}
