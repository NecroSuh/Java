package five;

class MP {
	private int x, y;

	public MP(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}

	public boolean equals(Object obj) {
		MP p = (MP) obj;
		if (x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}

public class Ex50 {
	public static void main(String[] args) {
		MP p = new MP(3, 50);
		MP q = new MP(4, 50);
		System.out.println(p);
		if (p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}
}
