package two;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String a;	// 문자열 읽기
		char c;		// 문자열의 첫 번째 문자
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		a = s.next();
		c = a.charAt(0);

		for (int i = 0; i <= c - 'a'; i++) {
			for (char j = 'a'; j <= c - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		s.close();
	}
}
