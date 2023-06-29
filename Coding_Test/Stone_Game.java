package first;

import java.util.Scanner;

public class Stone_Game {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("n의 값을 입력하시오.(1≤N≤1000): ");
		int n = s.nextInt();

		if (n % 2 == 0) {
			System.out.println("CY");
		} else {
			System.out.println("SK");
		}
	}

}
