package day03;

import java.util.Scanner;

public class Main_S {

	public static void main(String[] args) {
////		Student student1 = new Student("��ȣ��", 40, 180, 86, "20220715", 1, 4.5);
////		Student student2 = new Student("���缮", 42, 175, 70, "20220714", 4, 4.3);
////		student1.show();
////		student2.show();
//		
//		Student[] student = new Student[100];
//		for(int i = 0; i < 100; i++) {
//			student[i] = new Student("ȫ�浿",20,175,70,i+"",1,4.5);
//			student[i].show();
//		}
//		
////		Teacher teacher1 = new Teacher("Alex",25,180,120,"ABC123",300000,5);
////		teacher1.show();

		Scanner scan = new Scanner(System.in);
		System.out.print("�� �� ���� �л��� �����մϱ�? ");
		int number = scan.nextInt();
		Student[] students = new Student[number];
		for (int i = 0; i < number; i++) {
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			System.out.print("�л��� �̸��� �Է��ϼ���: ");
			name = scan.next();
			System.out.print("�л��� ������ �Է��ϼ���: ");
			age = scan.nextInt();
			System.out.print("�л��� Ű�� �Է��ϼ���: ");
			height = scan.nextInt();
			System.out.print("�л��� �������� �Է��ϼ���: ");
			weight = scan.nextInt();
			System.out.print("�л��� �й��� �Է��ϼ���: ");
			studentID = scan.next();
			System.out.print("�л��� �г��� �Է��ϼ���: ");
			grade = scan.nextInt();
			System.out.print("�л��� ������ �Է��ϼ���: ");
			gPA = scan.nextDouble();
			students[i] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		for (int i = 0; i < number; i++) {
			students[i].show();
		}
		scan.close();
	}

}
