package One;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("원의 중심과 반지름 입력>>");
		double p1 = s.nextDouble();
		double p2 = s.nextDouble();
		double r = s.nextDouble();

		System.out.print("점 입력>>");
		double d1 = s.nextDouble();
		double d2 = s.nextDouble();

		double distance = Math.sqrt((d1 - p1) * (d1 - p1) + (d2 - p2) * (d2 - p2));

		if (distance < r)
			System.out.print("점 (" + d1 + ", " + d2 + ")는 원 안에 있다.");
		else
			System.out.print("점 (" + d1 + ", " + d2 + ")는 원 밖에 있다.");

		s.close();
	}

}
