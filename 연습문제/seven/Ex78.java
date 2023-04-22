package seven;

import java.io.*;
import java.util.Scanner;

public class Ex78 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		FileReader fr = null;

		System.out.println("��ü ��ΰ� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("ù��° ���� �̸��� �Է��ϼ���.>> ");
		String n1 = s.nextLine();
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���.>> ");
		String n2 = s.nextLine();

		int c;
		try {
			fr = new FileReader(n1);
			FileWriter fw = new FileWriter("appended.txt", true);
			while ((c = fr.read()) != -1)
				fw.write((char) c);
			fr = new FileReader(n2);
			while ((c = fr.read()) != -1)
				fw.write((char) c);
			fr.close();
			fw.close();
			System.out.println("������Ʈ ���� �ؿ� appended.txt ���Ͽ� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		s.close();
	}
}
