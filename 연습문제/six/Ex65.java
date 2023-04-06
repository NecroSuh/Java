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

		System.out.println("학생 이름, 학과, 학번, 학점 평균을 입력하세요.");
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
			System.out.println("이름: " + std.getName());
			System.out.println("학과: " + std.getMajor());
			System.out.println("학번: " + std.getsNumber());
			System.out.println("학점평균: " + std.getGrade());
			System.out.println("---------------------------");
		}
		while (true) {
			System.out.print("학생 이름>> ");
			String name = scan.nextLine();
			if (name.equals("그만"))
				break;

			Std2 std = info.get(name);
			if (std == null)
				System.out.println(name + "학생 없습니다.");
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
