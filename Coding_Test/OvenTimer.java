package first;

import java.util.Scanner;

public class OvenTimer {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int Hour = s.nextInt();
		int Minute = s.nextInt();
		int Time = s.nextInt();

		int total = Hour * 60 + Minute + Time;
		int endH = total / 60 % 24;
		int endM = total % 60;

		System.out.println(endH + " " + endM);

		s.close();
	}
}
