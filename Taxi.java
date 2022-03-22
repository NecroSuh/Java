package dice;

import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 택시요금 계산하기
		// 2km까지는 기본요금 3500원, 2km를 초과하는 경우 142m 마다 100원 추가.
		float dist; // 거리
		int fare = 3500; // 택시요금

		System.out.print("거리 : ");
		dist = scan.nextFloat();
		/*
		 * if (dist <= 2) { fare = 3500; } else { fare = (int) (3500 + ((dist - 2) *
		 * 1000) / 142 * 100); if (((dist - 2) * 1000) % 142 != 0) fare += 100; }
		 */
		if (dist > 2) {
			fare = (int) (3500 + ((dist - 2) * 1000) / 142 * 100);
			if (((dist - 2) * 1000) % 142 != 0)
				fare += 100;
		}
		System.out.println("요금 = " + fare + "원");
		scan.close();
	}

}
