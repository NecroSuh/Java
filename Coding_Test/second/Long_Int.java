package second;

import java.util.Scanner;

public class Long_Int {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int bytes = n / 4;
		StringBuilder dataType = new StringBuilder("long ");
		for (int i = 1; i < bytes; i++)
			dataType.append("long ");
		dataType.append("int");

		System.out.println(dataType);
		s.close();
	}
}
