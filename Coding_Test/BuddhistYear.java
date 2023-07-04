package first;

import java.util.Scanner;

public class BuddhistYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		s.close();

		int gyear = year - 543;
		System.out.println(gyear);
	}

}
