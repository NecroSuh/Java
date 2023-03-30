package test2;

import java.util.Vector;

class VP {
	private int x, y;

	public VP(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class PointVectorEx {
	public static void main(String[] args) {
		Vector<VP> v = new Vector<VP>();

		v.add(new VP(2, 3));
		v.add(new VP(-5, 20));
		v.add(new VP(30, -8));

		v.remove(1);

		for (int i = 0; i < v.size(); i++) {
			VP vp = v.get(i);
			System.out.println(vp);
		}
	}
}
