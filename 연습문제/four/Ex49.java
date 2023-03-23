package four;

interface Shape2 {
	final double PI = 3.14; // 상수

	void draw(); // 도형을 그리는 추상 메소드

	double getArea(); // 도형의 면적을 리턴하는 추상 메소드

	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}

class Circle2 implements Shape2 {
	private int radius;

	public Circle2(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}

	public double getArea() {
		return PI * radius * radius;
	}
}

class Oval implements Shape2 {
	private int a, b;

	public Oval(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void draw() {
		System.out.println(a + "x" + b + "에 내접하는 타원입니다.");
	}

	public double getArea() {
		return PI * a * b;
	}
}

class Rect1 implements Shape2 {
	private int a, b;

	public Rect1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void draw() {
		System.out.println(a + "x" + b + "크기의 사각형.");
	}

	public double getArea() {
		return a * b;
	}
}

public class Ex49 {
	public static void main(String[] args) {
		Shape2[] list = new Shape2[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
		list[0] = new Circle2(10); // 반지름이 10인 원 객체
		list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
		list[2] = new Rect1(10, 40); // 10x40 크기의 사각형
		for (int i = 0; i < list.length; i++)
			list[i].redraw();
		for (int i = 0; i < list.length; i++)
			System.out.println("면적은 " + list[i].getArea());

	}
}
