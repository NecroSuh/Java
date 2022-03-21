package conditional;

import java.util.Scanner;

public class Ex04_08 {

	public static void main(String[] args) {
		int input = 0, answer = 0;

		answer = (int) (Math.random() * 100) + 1;	//1~100 사이의 임의의 수를 저장
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("1과 100사이의 정수를 입력하에요.>");
			input = scan.nextInt();

			if (input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if (input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요");
			}
		} while (input != answer);

		System.out.println("정답입니다!");
		scan.close();
	}

}
