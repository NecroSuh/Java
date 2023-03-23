package four;

interface Shape1 {
	final double PI = 3.14;

	void draw();

	double getArea();

	default public void redraw() {
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}

class Circle1 implements Shape1 {
	private int radius;

	public Circle1(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}

	public double getArea() {
		return PI * radius * radius;
	}
}

public class Ex48 {
	public static void main(String[] args) {
		Shape1 donut = new Circle1(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
}
