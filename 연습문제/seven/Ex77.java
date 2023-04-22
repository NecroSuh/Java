package seven;

import java.io.*;
import java.util.Scanner;

public class Ex77 {

	private static boolean compare(FileInputStream src, FileInputStream dest) {
		try (Scanner ssrc = new Scanner(src)) {
			try (Scanner sdest = new Scanner(dest)) {
				while (true) {
					if ((!ssrc.hasNext())) {
						String ssrc_line = ssrc.nextLine();
						String sdest_line = sdest.nextLine();
						if (!ssrc_line.equals(sdest_line))
							return false;
					}
					return true;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		FileInputStream srcS = null;
		FileInputStream destS = null;

		System.out.println("��ü ��ΰ� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("ù��° ���� �̸��� �Է��ϼ���.>> ");
		String src = s.nextLine();

		System.out.print("�ι�° ���� �̸��� �Է��ϼ���.>> ");
		String dest = s.nextLine();
		System.out.println(src + "�� " + dest + "�� ���մϴ�.");

		try {
			srcS = new FileInputStream(src);
			destS = new FileInputStream(dest);
			if (compare(srcS, destS))
				System.out.println("������ �����ϴ�.");
			else
				System.out.println("������ �ٸ��ϴ�.");
			srcS.close();
			destS.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		s.close();
	}
}
