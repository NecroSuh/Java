package fourth;

import java.util.Scanner;

public class Fibonacci {

	static Integer[][] dp = new Integer[41][2];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;

		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			fibo(n);
			System.out.println(dp[n][0] + " " + dp[n][1]);
		}
		s.close();
	}

	static Integer[] fibo(int n) {
		if (dp[n][0] == null || dp[n][1] == null) {
			dp[n][0] = fibo(n - 1)[0] + fibo(n - 2)[0];
			dp[n][1] = fibo(n - 1)[1] + fibo(n - 2)[1];
		}
		return dp[n];
	}
}
