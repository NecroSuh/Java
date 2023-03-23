package four;

interface Shape1 {
	final double PI = 3.14;

	void draw();

	double getArea();

	default public void redraw() {
		System.out.print("--- �ٽ� �׸��ϴ�.");
		draw();
	}
}

class Circle1 implements Shape1 {
	private int radius;

	public Circle1(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
	}

	public double getArea() {
		return PI * radius * radius;
	}
}

public class Ex48 {
	public static void main(String[] args) {
		Shape1 donut = new Circle1(10);
		donut.redraw();
		System.out.println("������ " + donut.getArea());
	}
}
