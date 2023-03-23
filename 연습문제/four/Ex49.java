package four;

interface Shape2 {
	final double PI = 3.14; // ���

	void draw(); // ������ �׸��� �߻� �޼ҵ�

	double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�

	default public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�.");
		draw();
	}
}

class Circle2 implements Shape2 {
	private int radius;

	public Circle2(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
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
		System.out.println(a + "x" + b + "�� �����ϴ� Ÿ���Դϴ�.");
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
		System.out.println(a + "x" + b + "ũ���� �簢��.");
	}

	public double getArea() {
		return a * b;
	}
}

public class Ex49 {
	public static void main(String[] args) {
		Shape2[] list = new Shape2[3]; // Shape�� ��ӹ��� Ŭ���� ��ü�� ���۷��� �迭
		list[0] = new Circle2(10); // �������� 10�� �� ��ü
		list[1] = new Oval(20, 30); // 20x30 �簢���� �����ϴ� Ÿ��
		list[2] = new Rect1(10, 40); // 10x40 ũ���� �簢��
		for (int i = 0; i < list.length; i++)
			list[i].redraw();
		for (int i = 0; i < list.length; i++)
			System.out.println("������ " + list[i].getArea());

	}
}
