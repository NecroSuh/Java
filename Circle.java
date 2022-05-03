package shape;

public class Circle extends Shape {
	private int r;

	public Circle(Point p, int r) {
		super(p);
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.println("Circle : " + p1 + " - " + r);
		System.out.println("		size= " + size);
	}

	@Override
	public void calc() {
		size = (int) (r * r * 3.1415);
	}

}
