import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int won, mrate, usd, change;

		System.out.print("원화 : ");
		won = scan.nextInt();
		System.out.print("환율 : ");
		mrate = scan.nextInt();
		usd = won / mrate; // 정수 나눗셈. 고정형 연산
		change = won % mrate;
		System.out.println("달러 : " + usd + "USD");
		System.out.println("잔액 : " + change + "WON");

		scan.close();
	}

}
