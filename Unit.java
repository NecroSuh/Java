package unit;

// ������ȯ ��ƿ��Ƽ Ŭ����
public class Unit {
	private String from, to;
	private static Unit unit = null; // �ڽ� Ŭ������ ��ü����

	private Unit(String from, String to) {
		this.from = from;
		this.to = to;
	}

	public static Unit getInstance(String from, String to) { // Singleton ����������
		if (unit == null)
			unit = new Unit(from, to);
		return unit;
	}

	public double convert(double value) { // �ν��Ͻ� �޼ҵ�
		if (from.equals("cm")) {
			if (to.equals("m"))
				return value / 100;
			else if (to.equals("inch"))
				return value / 2.64;
		}
		return 0;
	}

}
