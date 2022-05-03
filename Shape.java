package shape;

public abstract class Shape {
	protected Point p1;
	protected int size;

	public Shape(Point p) {
		p1 = p;
	}

	public abstract void draw();

	public abstract void calc();
}
