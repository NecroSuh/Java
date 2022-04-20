package dotManager;

// ��ǥ���� �������� �����ϴ� ������Ŭ����
public class PatternDot extends Dot {
	private String pattern;

	public PatternDot() { // ����Ʈ������. �Ű��������� ������.
		super(); // Dot() ������.
	}

	public PatternDot(Point loc, int size) {
		super(loc, size); // �θ� �����ڸ� ȣ���ϸ鼭 �Ű������� ����. Dot(Point, int)
		// this.loc = loc;
		// this.size = size;
	}

	public PatternDot(String pattern) {
		super();
		this.pattern = pattern;
	}

	public PatternDot(Point loc, int size, String pattern) {
		super(loc, size); // �θ� �������� ȣ���ϸ鼭 �Ű������� ����.
		this.pattern = pattern;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	@Override
	public String toString() {
		return "PatternDot [location=" + loc + " size=" + size + " pattern=" + pattern + "]";
	}

}
