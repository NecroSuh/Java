package dice;
import java.util.Scanner;
import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();

		// System.out.println(r.nextInt(20)); //0~19 사이의 임의의 수
		// System.out.println(r.nextDouble()); //0~1 사이의 임의의 실수값
		// 주사워를 던져서 나온 숫자가 짝수인지 홀수인지 출력하기
		int dice = r.nextInt(6) + 1;
		if (dice % 2 == 0) {
			System.out.println(dice + "짝수입니다.");
			if (dice == 2)
				dice++;
		} else {
			System.out.println(dice + "홀수입니다.");
		}
		int score = 0;
		if (dice == 1 || dice == 2)
			score += 10;
		else if (dice == 3 || dice == 4)
			score += 20;
		else
			score += 30;
		System.out.println("Score = " + score);
		
		score=0;
		//switch statement
		switch (dice) {
		case 1:
		case 2:
			score += 10;
			break;
		case 3:
		case 4:
			score += 20;
		default:
			score += 30;
		}
		//switch expression
		score+=switch(dice) {
		case 1,2->10;
		case 3,4->20;
		default ->30;
		};
		System.out.println("Score= "+score);
		scan.close();
	}
}
