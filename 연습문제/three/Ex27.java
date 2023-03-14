package three;

import java.util.Scanner;

class Grade {
	private int math;
	private int sci;
	private int eng;

	Grade(int a, int b, int c) {
		math = a;
		sci = b;
		eng = c;
	}

	public int average() {
		return (math + sci + eng) / 3;
	}
}

public class Ex27 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = s.nextInt();
		int sci = s.nextInt();
		int eng = s.nextInt();

		Grade me = new Grade(math, sci, eng);
		System.out.println("평균은 " + me.average());

		s.close();
	}
}
