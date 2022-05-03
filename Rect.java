package shape;

public class Rect extends Shape implements Comparable {
	private Point p2;

	public Rect(Point p, Point p2) {
		super(p);
		this.p2 = p2;
	}

	@Override
	public void draw() {
		System.out.println("RECT : " + p1 + " - " + p2);
		System.out.println("		size= " + size);

	}

	@Override
	public void calc() {
		// int w = Math.abs(p2.getX()-p1.getX());
		int w = p1.distX(p2);
		int h = p1.distY(p2);
		size = w * h;
	}

	@Override
	public int compareTo(Object o) { // Rect 객체끼리 크기를 비교하는 메소드
		Rect r = (Rect) o; // Down Casting.
		if (size < r.size)
			return -1;
		else if (size == r.size)
			return 0;
		else
			return 1;
	}
}
