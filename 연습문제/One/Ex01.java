package One;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int i = s.nextInt();
		double d = i / 1100;
		System.out.printf("%d원은 $%s입니다.", i, d);
		s.close();
	}
}
