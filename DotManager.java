package dotManager;

public class DotManager {

	public static void main(String[] args) {
		PatternDot pdot = new PatternDot(new Point(1, 3), 5, "���ṫ��"); // Dot ��ü�� ���� �����ϰ� Pattern
		System.out.println(pdot);
		ColorDot cdot = new ColorDot(new Point(3, 3), 8, "RED");
		System.out.println(cdot);

		PatternDot[] pdots = new PatternDot[10];
		ColorDot[] cdots = new ColorDot[10];
		int cnt1 = 0, cnt2 = 0;

		Dot dot = pdot; // �θ�Ŭ���� ��ü������ �ڽ�Ŭ���� ��ü�� ����ų �� ����
		Dot[] dots = new Dot[10];
		dots[0] = pdot;
		dots[1] = cdot;
		dots[2] = new ColorDot(new Point(4, 5), 3, "BLUE");
		dots[3] = new PatternDot(new Point(2, 3), 7, "������");
		dots[4] = new ColorDot(new Point(-2, -5), 8, "ORANGE");
		for (int i = 0; i < 5; i++) {
			System.out.println(dots[i]);
		}
	}

}
