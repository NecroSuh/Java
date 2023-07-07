package second;

import java.util.Scanner;

public class Submit_Homework {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		boolean[] submit = new boolean[31];

		for (int i = 0; i < 28; i++) {
			int attendanceNum = s.nextInt();
			submit[attendanceNum] = true;
		}

		for (int i = 1; i <= 30; i++) {
			if (!submit[i])
				System.out.println(i);
		}
		s.close();
	}
}
