package five;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex54 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print(">>");
			String s1 = s.nextLine();
			if (s1.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			StringTokenizer st = new StringTokenizer(s1, " ");
			System.out.println("어절 개수는 " + st.countTokens());
		}
		s.close();
	}
}
