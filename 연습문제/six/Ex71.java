package six;

import java.util.Scanner;
import java.util.Vector;

class Nation {
	private String country;
	private String capital;

	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}

	public String getCountry() {
		return country;
	}

	public String getCapital() {
		return capital;
	}
}

class CQ {
	private Vector<Nation> na;
	private Scanner scan;

	public CQ() {
		na = new Vector<>();
		scan = new Scanner(System.in);
		na.add(new Nation("�߽���", "�߽��ڽ�Ƽ"));
		na.add(new Nation("������", "������"));
		na.add(new Nation("������", "�ĸ�"));
		na.add(new Nation("����", "����"));
		na.add(new Nation("�׸���", "���׳�"));
		na.add(new Nation("����", "������"));
		na.add(new Nation("�Ϻ�", "����"));
		na.add(new Nation("�ѱ�", "����"));
		na.add(new Nation("������", "�븮��"));
		na.add(new Nation("�̱�", "������"));
	}

	public void run() {
		while (true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int input = scan.nextInt();
			if (input == 1)
				insert();
			else if (input == 2)
				play();
			else if (input == 3)
				break;
			else
				System.out.println("�߸��� �Է��Դϴ�.");
		}
	}

	public void insert() {
		System.out.println("���� " + na.size() + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		while (true) {
			System.out.print("����� ���� �Է�" + (int) (na.size() + 1) + ">>");
			String first = scan.next();
			if (first.equals("�׸�"))
				break;
			String second = scan.next();
			boolean isIn = false;
			for (int i = 0; i < na.size(); i++)
				if (na.get(i).getCountry().equals(first)) {
					isIn = true;
					break;
				}
			if (isIn) {
				System.out.println(first + "�� �̹� �ֽ��ϴ�!");
				continue;
			}
			na.add(new Nation(first, second));
		}
	}

	public void play() {
		while (true) {
			int index = (int) (Math.random() * na.size());
			System.out.print(na.get(index).getCountry() + "�� ������?");
			String inputs = scan.next();
			if (inputs.equals("�׸�"))
				break;
			if (inputs.equals(na.get(index).getCapital()))
				System.out.println("����!");
			else
				System.out.println("�ƴմϴ�!!");
		}
	}
}

public class Ex71 {
	public static void main(String[] args) {
		CQ cq = new CQ();
		cq.run();
	}
}
