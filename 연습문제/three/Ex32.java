package three;

import java.util.Scanner;

class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�.");
	}
}

class MonthSchedule {
	private Scanner s;
	private Day days[];

	MonthSchedule(int a) {
		this.days = new Day[a];
		for (int i = 0; i < days.length; i++)
			days[i] = new Day();
		s = new Scanner(System.in);
	}

	private void input() {
		System.out.print("��¥(1~30)? ");
		int arrCnt = s.nextInt();
		System.out.print("�� ��(��ĭ���� �Է�)");
		String work = s.next();
		days[arrCnt].set(work);
	}

	private void view() {
		System.out.print("��¥(1~30)? ");
		int arrCnt = s.nextInt();
		System.out.print(arrCnt + "���� ������ ");
		days[arrCnt].show();
	}

	private void finish() {
		System.out.println("���α׷��� �����մϴ�.");
		s.close();
	}

	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�.");
		while (true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >> ");
			int select = s.nextInt();
			if (select == 1)
				input();
			else if (select == 2)
				view();
			else if (select == 3) {
				finish();
				return;
			}
		}
	}
}

public class Ex32 {
	public static void main(String[] args) {
		MonthSchedule m = new MonthSchedule(30);
		m.run();
	}
}
