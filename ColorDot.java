package dotManager;

// 좌표상의 색상 점을 정의하는 데이터클래스
public class ColorDot extends Dot {
	private String Color;

	public ColorDot() {
	}

	public ColorDot(Point loc, int size, String color) {
		super(loc, size);
		this.Color = color;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "ColorDot [location= " + loc +  " size=" + size + " Color=" + Color + "]";
	}

}
