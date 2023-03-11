package One;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x, y;
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		x = s.nextInt();
		y = s.nextInt();

		if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200))
			System.out.println("(" + x + "," + y + ")" + "는 사각형 안에 있습니다.");

		s.close();
	}
}
