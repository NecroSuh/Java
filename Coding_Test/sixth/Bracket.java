package sixth;

import java.util.*;

public class Bracket {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		for (int i = 0; i < t; i++)
			System.out.println(solve(s.next()));
		s.close();
	}

	public static String solve(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(')
				stack.push(c);
			else if (stack.empty())
				return "NO";
			else
				stack.pop();
		}
		if (stack.empty())
			return "YES";
		else
			return "NO";
	}
}
