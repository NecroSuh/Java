package dotManager;

// 좌표를 정의하는 데이터클래스
public class Point {
	private int x, y;

	public Point(int x, int y) {
		super(); // 부모클래스의 생성자 호출. Point 클래스의 부모는 Object 클래스
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
