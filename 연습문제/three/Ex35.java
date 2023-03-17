package three;

import java.util.Scanner;

class Dictionay {
	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				if (i % 2 == 0)
					System.out.print(word + "�� ");
				else
					System.out.print(word + "�� ");
				return eng[i];
			}
		}
		return "false";
	}
}

public class Ex35 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while (true) {
			System.out.print("�ѱ� �ܾ�?");
			String search = s.next();
			if (search.equals("�׸�"))
				break;
			String eng = Dictionay.kor2Eng(search);
			if (eng.equals("false"))
				System.out.println(search + "�� ���� ������ �����ϴ�.");
			else
				System.out.println(eng);
		}
		s.close();
	}
}
