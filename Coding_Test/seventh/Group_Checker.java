package seventh;

import java.util.Scanner;

public class Group_Checker {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int count = 0;
		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
			if (check() == true)
				count++;
		}
		System.out.println(count);
	}

	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = s.next();

		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);

			if (prev != now) {
				if (check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				} else
					return false;
			} else
				continue;
		}
		return true;
	}
}
