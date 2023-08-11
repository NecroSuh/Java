package sixth;

import java.util.*;

public class Zero {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Stack<Integer> stack = new Stack<Integer>();
		int k = s.nextInt();

		for (int i = 0; i < k; i++) {
			int num = s.nextInt();
			if (num == 0)
				stack.pop();
			else
				stack.push(num);
		}
		int sum = 0;
		for (int o : stack)
			sum += o;
		System.out.println(sum);
		s.close();
	}
}
