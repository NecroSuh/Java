package three;

import java.util.Scanner;

class Reservation {
	private String s[];
	private String a[];
	private String b[];
	private Scanner in;

	Reservation() {
		in = new Scanner(System.in);
		s = new String[10];
		a = new String[10];
		b = new String[10];
		for (int i = 0; i < a.length; i++) {
			s[i] = "___";
			a[i] = "___";
			b[i] = "___";
		}
	}

	public void printSeat() {
		System.out.print("S >>");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		System.out.print("A >>");
		for (int i = 0; i < s.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("B >>");
		for (int i = 0; i < s.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println("<< ��ȸ�� �Ϸ��Ͽ����ϴ� >>");

	}

	public void printSeat(String seat[]) {
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
		System.out.println();
	}

	public void chooseSeat() {
		while (true) {
			System.out.print("�¼� ���� S(1), A(2), B(3)");
			int num = in.nextInt();
			switch (num) {
			case 1:
				System.out.print("S >>");
				printSeat(s);
				newSeat((s));
				return;
			case 2:
				System.out.print("A >>");
				printSeat(a);
				newSeat(a);
				return;
			case 3:
				System.out.print("B >>");
				printSeat(b);
				newSeat(b);
				return;
			default:
				System.out.print("�ٽ� �Է��� �ּ���.");
			}
		}
	}

	public void newSeat(String seat[]) {
		System.out.print("�̸� >> ");
		String name = in.next();
		System.out.print("��ȣ >>");
		int num = in.nextInt();
		seat[num] = name;
	}

	public void deleteSeat() {
		while (true) {
			System.out.print("�¼� ���� S(1), A(2), B(3)>> ");
			int num = in.nextInt();
			switch (num) {
			case 1:
				System.out.print("S >>");
				printSeat(s);
				delete((s));
				return;
			case 2:
				System.out.print("A >>");
				printSeat(a);
				delete(a);
				return;
			case 3:
				System.out.print("B >>");
				printSeat(b);
				delete(b);
				return;
			default:
				System.out.print("�ٽ� �Է��� �ּ���.");
			}
		}
	}

	public void delete(String seat[]) {
		System.out.print("�̸� >> ");
		String name = in.next();
		for (int i = 0; i < seat.length; i++) {
			if (seat[i].equals(name)) {
				seat[i] = "___";
				break;
			}
		}
	}
}

public class Ex37 {
	public static void main(String[] args) {
		Reservation r = new Reservation();
		Scanner in = new Scanner(System.in);
		System.out.println("��ǰ �ܼ�ƮȦ ���� �ý����Դϴ�.");
		while (true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4 >> ");
			int num = in.nextInt();
			switch (num) {
			case 1:
				r.chooseSeat();
				break;
			case 2:
				r.printSeat();
				break;
			case 3:
				r.deleteSeat();
				break;
			case 4:
				in.close();
				return;
			}
		}
	}
}
