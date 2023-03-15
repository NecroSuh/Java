package three;

import java.util.Scanner;

class Circle {
	private double x, y;
	private int r;

	public Circle(double x, double y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + r);
	}
}

public class Ex30 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, r >>");
			double a = s.nextDouble();
			double b = s.nextDouble();
			int d = s.nextInt();
			c[i] = new Circle(a, b, d);
		}
		for (int i = 0; i < c.length; i++)
			c[i].show();
		s.close();
	}
}
