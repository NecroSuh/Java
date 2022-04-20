package dotManager;

// ��ǥ���� ���� �����ϴ� ������Ŭ����
public class Dot {
	protected Point loc; // �ڽ� Ŭ���������� �����Ӱ� ����. �ܺο��� �����
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
