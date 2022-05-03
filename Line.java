package shape;

public class Line extends Shape implements Comparable {
	private Point p2;

	public Line(Point p1, Point p2) {
		super(p1);
		this.p2 = p2;
	}

	@Override
	public void draw() {
		System.out.println("Line : " + p1 + " - " + p2);
		System.out.println("		size= " + size);
	}

	@Override
	public void calc() {
		int w = p1.distX(p2);
		int h = p1.distY(p2);
		size = (int) Math.sqrt(w * w + h * h);
	}

	@Override
	public int compareTo(Object o) {
		Line r = (Line) o; // Down Casting.
		if (size < r.size)
			return -1;
		else if (size == r.size)
			return 0;
		else
			return 1;
	}
}
