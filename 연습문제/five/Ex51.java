package five;

class C {
	private int x, y, radius;

	public C(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public String toString() {
		return "Circle(" + x + ", " + y + ")������" + radius;
	}

	public boolean equals(Object obj) {
		C c = (C) obj;
		if (x == c.x && y == c.y) {
			return true;
		}
		return false;
	}
}

public class Ex51 {
	public static void main(String[] args) {
		C a = new C(2, 3, 5);
		C b = new C(2, 3, 30);
		System.out.println("�� a: " + a);
		System.out.println("�� b: " + b);
		if (a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");
	}
}
