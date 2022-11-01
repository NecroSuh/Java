package day09;

import java.util.*;
import java.util.stream.*;

public class Ex14_5 {
	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(new Student("���ڹ�", 3, 300), new Student("���ڹ�", 1, 300),
				new Student("���ڹ�", 2, 300), new Student("���ڹ�", 2, 300), new Student("���ڹ�", 1, 300),
				new Student("���ڹ�", 3, 300), new Student("���ڹ�", 3, 300));

		studentStream.sorted(Comparator.comparing(Student::getBan) // �ݺ� ����
				.thenComparing(Comparator.naturalOrder())) // �⺻ ����
				.forEach(System.out::println);
	}
}

class Student implements Comparable<Student> {
	String name;
	int ban;
	int totalScore;

	Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}

	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore);
	}

	String getName() {
		return name;
	}

	int getBan() {
		return ban;
	}

	int getTotalScore() {
		return totalScore;
	}

	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}
}