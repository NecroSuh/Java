package day09;

import java.io.*;
import java.util.stream.*;

public class Ex14_6 {
	public static void main(String[] args) {
		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1"),
				new File("Ex1.txt") };

		Stream<File> fileStream = Stream.of(fileArr);

		// map()���� Stream<File>�� Stream<String>���� ��ȯ
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println); // ��� ������ �ϸ��� ���

		fileStream = Stream.of(fileArr); // ��Ʈ���� �ٽ� ����

		fileStream.map(File::getName) // Stream<File> -> Stream<String>
				.filter(s -> s.indexOf('.') != -1) // Ȯ���ڰ� ���� ���� ����
				.map(s -> s.substring(s.indexOf('.') + 1)) // Ȯ���ڸ� ����
				.map(String::toUpperCase) // ��� �빮�ڷ� ��ȯ
				.distinct() // �ߺ� ����
				.forEach(System.out::print); // JAVABKTXT

		System.out.println();
	}
}
