package six;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Std2 {
	private String name, major, sNumber;
	private double grade;

	public Std2(String name, String major, String sNumber, double grade) {
		this.name = name;
		this.major = major;
		this.sNumber = sNumber;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public String getsNumber() {
		return sNumber;
	}

	public double getGrade() {
		return grade;
	}
}

public class Ex65 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Std2> info = new HashMap<String, Std2>();

		System.out.println("�л� �̸�, �а�, �й�, ���� ����� �Է��ϼ���.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String text = scan.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String sNumber = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());

			Std2 s = new Std2(name, major, sNumber, grade);
			info.put(name, s);
		}

		Set<String> key = info.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next();
			Std2 std = info.get(name);
			System.out.println("---------------------------");
			System.out.println("�̸�: " + std.getName());
			System.out.println("�а�: " + std.getMajor());
			System.out.println("�й�: " + std.getsNumber());
			System.out.println("�������: " + std.getGrade());
			System.out.println("---------------------------");
		}
		while (true) {
			System.out.print("�л� �̸�>> ");
			String name = scan.nextLine();
			if (name.equals("�׸�"))
				break;

			Std2 std = info.get(name);
			if (std == null)
				System.out.println(name + "�л� �����ϴ�.");
			else {
				System.out.println(std.getName() + ", ");
				System.out.println(std.getMajor() + ", ");
				System.out.println(std.getsNumber() + ", ");
				System.out.println(std.getGrade() + ", ");
			}
		}
		scan.close();
	}
}
