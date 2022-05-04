package unit;

// 단위변환 유틸리티 클래스
public class Unit {
	private String from, to;
	private static Unit unit = null; // 자신 클래스의 객체변수

	private Unit(String from, String to) {
		this.from = from;
		this.to = to;
	}

	public static Unit getInstance(String from, String to) { // Singleton 디자인패턴
		if (unit == null)
			unit = new Unit(from, to);
		return unit;
	}

	public double convert(double value) { // 인스턴스 메소드
		if (from.equals("cm")) {
			if (to.equals("m"))
				return value / 100;
			else if (to.equals("inch"))
				return value / 2.64;
		}
		return 0;
	}

}
