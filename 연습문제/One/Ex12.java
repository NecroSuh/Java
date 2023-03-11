package One;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		System.out.print("연산>>");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		String s = in.next();
		int b = in.nextInt();
		int ans = 0;
		if (s.equals("+")) {
			ans = a + b;
		} else if (s.equals("-")) {
			ans = a - b;
		} else if (s.equals("*")) {
			ans = a * b;
		} else if (s.equals("/")) {
			if (b == 0) {
				System.out.print("0으로 나눌 수 없습니다.");
				in.close();
				return;
			} else {
				ans = a / b;
			}
		} else {
			System.out.print("잘못된 입력입니다.");
			in.close();
			return;
		}
		System.out.print(a + s + b + "의 계산 결과는 " + ans);

		in.close();
	}
}
