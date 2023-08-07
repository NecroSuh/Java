package fifth;

import java.util.*;

public class One_Num {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print(as(s.nextInt()));
		s.close();
	}

	public static int as(int num) {
		int cnt = 0;
		if (num < 100)
			return num;
		else {
			cnt = 99;
			for (int i = 100; i <= num; i++) {
				int h = i / 100;
				int t = (i / 10) % 10;
				int o = i % 10;

				if ((h - t) == (t - o))
					cnt++;
			}
		}
		return cnt;
	}
}
