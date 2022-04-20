package dotManager;

// ��ǥ�� �����ϴ� ������Ŭ����
public class Point {
	private int x, y;

	public Point(int x, int y) {
		super(); // �θ�Ŭ������ ������ ȣ��. Point Ŭ������ �θ�� Object Ŭ����
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
