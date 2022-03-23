package loop;

import java.util.Scanner;
import java.util.Random;

public class Loop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		/*
		 * // 타일 번호가 15 배수 자리는 아웃 자리 System.out.print("타일 수 :"); int tiles =
		 * scan.nextInt(); // 바닥에 깔린 타일 수 int moveTiles = 0; // 이동한 타일 수 int count = 0;
		 * // 시도한 횟수 boolean isBroken = false; // 플래그(깃발) 변수 while (moveTiles <= tiles)
		 * { // 주사위 던지고 이동하기 moveTiles += r.nextInt(6) + 1; if (moveTiles % 15 == 0) {
		 * isBroken = true; // 깃발을 들었음 break; } count++; } if (!isBroken)
		 * System.out.println("시도횟수 = " + count + "번"); else
		 * System.out.println("아웃되었습니다. = " + count + "번");
		 */

		// 창고에 보관된 물풀들의 수량을 입력받고 총 합계를 구하자
		// 종료조건으로 -99 입력을 하자.
		int sum = 0;
		int num;
		// num = scan.nextInt(); // 반복제어변수 초기화
		/*while ((num=scan.nextInt()) != -99) {
			sum += num; // 수량 누적
			// num = scan.nextInt(); //반복제어 변수 변경
		}
		*/
		while(true) {
			if((num=scan.nextInt()) == -99)
				break;
			sum += num;
		}
		System.out.println("총수량= " + sum);

		scan.close();
	}
}
