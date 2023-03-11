package One;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("금액을 입력하시오>");
		int m = s.nextInt();
		System.out.println("오만원권 " + m / 50000 + "매");
		m %= 50000;
		System.out.println("만원권 "+m/10000+"매");
		m%=10000;
		System.out.println("오천원권 "+m/5000+"매");
		m%=5000;
		System.out.println("천원권 "+m/1000+"매");
		m%=1000;
		System.out.println("500원 "+m/500+"개");
		m%=500;
		System.out.println("100원 "+m/100+"개");
		m%=100;
		System.out.println("50원 "+m/50+"개");
		m%=50;
		System.out.println("10원 "+m/10+"개");
		m%=10;
		System.out.println("1원 "+m/1+"개");
		
		s.close();
	}
}
