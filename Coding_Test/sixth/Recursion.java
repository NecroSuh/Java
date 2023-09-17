package sixth;

import java.util.*;

public class Recursion {
	static int result;

	public static int res(String s, int l, int r) {
		result++;
		if (l >= r)
			return 1;
		else if (s.charAt(l) != s.charAt(r))
			return 0;
		else
			return res(s, l + 1, r - 1);
	}

	public static int isPalindrome(String s) {
		return res(s, 0, s.length() - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			result = 0;
			System.out.println(isPalindrome(sc.next()) + " " + result);
		}
		sc.close();
	}
}
