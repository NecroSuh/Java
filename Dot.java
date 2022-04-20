package dotManager;

// 좌표상의 점을 정의하는 데이터클래스
public class Dot {
	protected Point loc; // 자식 클래스에서는 자유롭게 접근. 외부에는 비공개
	protected int size;

	public Dot() {
	}

	public Dot(Point loc, int size) {
		super();
		this.loc = loc;
		this.size = size;
	}

	public Point getLoc() {
		return loc;
	}

	public void setLoc(Point loc) {
		this.loc = loc;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Dot [loc=" + loc + ", size=" + size + "]";
	}

}
