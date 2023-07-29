package fourth;

import java.io.*;
import java.util.StringTokenizer;

interface A5 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		@SuppressWarnings("unused")
		StringBuilder sb = new StringBuilder();
		@SuppressWarnings("unused")
		StringTokenizer st;

		long n = Long.parseLong(br.readLine());

		System.out.println(n * n * n);
		System.out.println(3);
	}
}