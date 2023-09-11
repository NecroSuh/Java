package sixth;

import java.util.*;

public class Balance_World {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;

		while (true) {
			str = s.nextLine();
			if (str.equals("."))
				break;
			System.out.println(solve(str));
		}
		s.close();
	}

	public static String solve(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(' || c == '[')
				stack.push(c);
			else if (c == ')') {
				if (stack.empty() || stack.peek() != '(')
					return "no";
				else
					stack.pop();
			} else if (c == ']') {
				if (stack.empty() || stack.peek() != '[')
					return "no";
				else
					stack.pop();
			}
		}
		if (stack.empty())
			return "yes";
		else
			return "no";
	}
}
