package operator;

import java.util.Scanner;

public class Pr03_05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int fahrenheit;
		System.out.printf("섭씨를 입력 : ");
		fahrenheit=scan.nextInt();
		float celcius = (float) 5 / 9 * (fahrenheit - 32);

		System.out.println("화씨 : " + fahrenheit);
		System.out.printf("섭씨 : %.2f", celcius);
		
		scan.close();
	}

}
