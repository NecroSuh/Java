package dotManager;

// 좌표상의 무늬점을 정의하는 데이터클래스
public class PatternDot extends Dot {
	private String pattern;

	public PatternDot() { // 디폴트생성자. 매개변수없는 생성자.
		super(); // Dot() 생성자.
	}

	public PatternDot(Point loc, int size) {
		super(loc, size); // 부모 생성자를 호출하면서 매개변수를 전달. Dot(Point, int)
		// this.loc = loc;
		// this.size = size;
	}

	public PatternDot(String pattern) {
		super();
		this.pattern = pattern;
	}

	public PatternDot(Point loc, int size, String pattern) {
		super(loc, size); // 부모 샹송저룰 호출하면서 매개변수를 전달.
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
