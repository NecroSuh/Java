package two;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("과목 이름>>");
			String a = s.next();
			if (a.equals("그만"))
				break;
			int f = 0;
			for (int i = 0; i < course.length; i++) {
				if (course[i].equals(a)) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
					f = 1;
				}
			}
			if (f == 0)
				System.out.println("없는 과목입니다.");
		}
		s.close();
	}
}
