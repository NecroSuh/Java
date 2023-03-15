package three;

import java.util.Scanner;

class Circle3 {
	private double x, y;
	private int radius;

	public Circle3(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}

	public int getRadius() {
		return radius;
	}
}

public class Ex31 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Circle3 c[] = new Circle3[3];
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius>>");
			double a = s.nextDouble();
			double b = s.nextDouble();
			int d = s.nextInt();
			c[i] = new Circle3(a, b, d);
		}
		int max = 0, index = -1;
		for (int i = 0; i < c.length; i++) {
			c[i].show();
			if (max < c[i].getRadius()) {
				index = i;
				max = c[i].getRadius();
			}
		}
		System.out.print("가장 면적이 큰 원은? ");
		c[index].show();
		s.close();
	}
}
