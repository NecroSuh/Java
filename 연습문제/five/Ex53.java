package five;

import java.util.Calendar;
import java.util.Scanner;

public class Ex53 {
	private Scanner sc;
	private Calendar now;
	@SuppressWarnings("unused")
	private String enter;
	private int time;

	public int enter() {
		sc = new Scanner(System.in);
		enter = sc.nextLine();
		now = Calendar.getInstance();
		time = now.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = " + time);
		return time;
	}

	public static void main(String[] args) {
		String names[] = { "Ȳ����", "���繮" };
		Ex53 ex = new Ex53();
		int time1, time2;
		int times[] = new int[2];
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");

		for (int i = 0; i < 2; i++) {
			System.out.print(names[i] + " ���� <Enter>Ű >>");
			time1 = ex.enter();
			System.out.print(names[i] + " 10�� ���� �� <Enter>Ű >>");
			time2 = ex.enter();
			if (time1 > time2)
				times[i] = (60 - time1) - time2;
			else
				times[i] = time1 - time2;
		}
		times[0] = Math.abs(times[0]);
		times[1] = Math.abs(times[1]);
		if (times[0] > times[1])
			System.out.println("Ȳ������ ��� " + times[0] + ", ���繮�� ��� " + times[1] + ", ���ڴ� Ȳ����");
		else
			System.out.println("Ȳ������ ��� " + times[0] + ", ���繮�� ��� " + times[1] + ", ���ڴ� ���繮");
	}
}
