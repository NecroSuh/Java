package five;

import java.util.Scanner;

public class Ex55 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		String sc = s.nextLine();
		for (int i = 0; i < sc.length(); i++) {
			System.out.print(sc.substring(i));
			System.out.println(sc.substring(0, i));
		}
		s.close();
	}
}
