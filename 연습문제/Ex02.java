package One;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int su = s.nextInt();
		if (su % 11 == 0)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		s.close();
	}
}
