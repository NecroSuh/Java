package seven;

import java.io.*;
import java.util.Scanner;

public class Ex73 {
	public static void main(String[] args) {
		File f = null;
		FileWriter fw = null;
		Scanner s = new Scanner(System.in);
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
		String temp = "";
		try {
			f = new File("C:\\Temp\\phone.txt");
			fw = new FileWriter(f);
			while (true) {
				System.out.print("�̸� ��ȭ��ȣ >> ");
				temp = s.nextLine();
				if (temp.contentEquals("�׸�"))
					break;
				fw.write(temp + "\r\n");
			}
			s.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(f.getPath() + "�� �����Ͽ����ϴ�.");
	}
}
