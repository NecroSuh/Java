package day03;

import java.util.Scanner;

public class Main_S {

	public static void main(String[] args) {
////		Student student1 = new Student("강호동", 40, 180, 86, "20220715", 1, 4.5);
////		Student student2 = new Student("유재석", 42, 175, 70, "20220714", 4, 4.3);
////		student1.show();
////		student2.show();
//		
//		Student[] student = new Student[100];
//		for(int i = 0; i < 100; i++) {
//			student[i] = new Student("홍길동",20,175,70,i+"",1,4.5);
//			student[i].show();
//		}
//		
////		Teacher teacher1 = new Teacher("Alex",25,180,120,"ABC123",300000,5);
////		teacher1.show();

		Scanner scan = new Scanner(System.in);
		System.out.print("총 몇 명의 학생이 존재합니까? ");
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
			System.out.print("학생의 이름을 입력하세요: ");
			name = scan.next();
			System.out.print("학생의 나이을 입력하세요: ");
			age = scan.nextInt();
			System.out.print("학생의 키를 입력하세요: ");
			height = scan.nextInt();
			System.out.print("학생의 몸무게을 입력하세요: ");
			weight = scan.nextInt();
			System.out.print("학생의 학번을 입력하세요: ");
			studentID = scan.next();
			System.out.print("학생의 학년을 입력하세요: ");
			grade = scan.nextInt();
			System.out.print("학생의 학점을 입력하세요: ");
			gPA = scan.nextDouble();
			students[i] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		for (int i = 0; i < number; i++) {
			students[i].show();
		}
		scan.close();
	}

}
