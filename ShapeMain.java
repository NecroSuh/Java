package shape;

public class ShapeMain {

	public static void main(String[] args) {
		Shape s = new Rect(new Point(1, 2), new Point(5, 8)); // UP Casting
		s.calc();
		s.draw();

		Rect r1 = (Rect) s;
		Rect r2 = new Rect(new Point(4, 7), new Point(-1, 5));
		r2.calc();
		r2.draw();
		System.out.println("Compare = " + r1.compareTo(r2));

		Shape[] s2 = new Shape[3];
		s2[0] = new Rect(new Point(3, 7), new Point(-3, 5));
		s2[1] = new Line(new Point(2, 5), new Point(11, 4));
		s2[2] = new Circle(new Point(5, 7), 7);

		for (int i = 0; i < 3; i++) { // 다형성
			s2[i].calc();
			s2[i].draw();
		}
		// 인터페이스를 통한 다형성 구현
		Comparable c = r1;
		System.out.println("Compare = " + c.compareTo(r2));

		c = new Line(new Point(2, 5), new Point(11, 4));
		Line l2 = new Line(new Point(6, 3), new Point(15, 5));
		System.out.println("Compare = " + c.compareTo(l2));
	}
}
