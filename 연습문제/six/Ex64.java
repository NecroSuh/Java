package six;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

class Stu {
	private String name, major, sNumber;
	private double grade;

	public Stu(String name, String major, String sNumber, double grade) {
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

public class Ex64 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Stu> info = new ArrayList<Stu>();

		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String text = s.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String sNumber = st.nextToken().trim();
			Double grade = Double.parseDouble(st.nextToken().trim());

			Stu stu = new Stu(name, major, sNumber, grade);
			info.add(stu);
		}
		Iterator<Stu> it = info.iterator();
		while (it.hasNext()) {
			Stu student = it.next();
			System.out.println("---------------------------");
			System.out.println("�̸�:" + student.getName());
			System.out.println("�а�:" + student.getMajor());
			System.out.println("�й�:" + student.getsNumber());
			System.out.println("�������:" + student.getGrade());
			System.out.println("---------------------------");
		}

		while (true) {
			System.out.print("�л� �̸�>> ");
			String name = s.nextLine();
			if (name.equals("�׸�"))
				break;

			for (int i = 0; i < info.size(); i++) {
				Stu stu = info.get(i);
				if (stu.getName().equals(name)) {
					System.out.print(stu.getName() + ", ");
					System.out.print(stu.getMajor() + ", ");
					System.out.print(stu.getsNumber() + ", ");
					System.out.println(stu.getGrade());
					break;
				}
			}
		}
		s.close();
	}
}
