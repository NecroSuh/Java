package first;

import java.util.*;

public class Movie_Director {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();

		int count = 0;
		int number = 0;

		while (count < n) {
			number++;
			if (String.valueOf(number).contains("666"))
				count++;
		}
		System.out.println(number);
	}
}
