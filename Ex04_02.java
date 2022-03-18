package conditional;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';

		System.out.print("점수를 입력하세요.>");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score > 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
		scan.close();
	}
}
