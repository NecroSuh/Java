package second;

import java.util.Scanner;

public class Turret {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T=s.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int r1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();
			int r2 = s.nextInt();

			double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

			if (distance == 0 && r1 == r2)
				System.out.println(-1);
			else if (distance > r1 + r2 || distance < Math.abs(r1 - r2))
				System.out.println(0);
			else if (distance == r1 + r2 || distance == Math.abs(r1 - r2))
				System.out.println(1);
			else
				System.out.println(2);
		}
		s.close();
	}
}
