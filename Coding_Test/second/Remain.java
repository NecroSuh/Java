package second;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Remain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Set<Integer> r = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			int num = s.nextInt();
			int rs = num % 42;
			r.add(rs);
		}
		System.out.println(r.size());
		s.close();
	}
}
