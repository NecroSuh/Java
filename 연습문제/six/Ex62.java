package six;

import java.util.HashMap;
import java.util.Scanner;

public class Ex62 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		System.out.println("���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)>> ");

		while (true) {
			System.out.print("���� �̸�, �α�>> ");
			String name = s.next();
			if (name.equals("�׸�"))
				break;
			int population = s.nextInt();

			nations.put(name, population);
		}

		while (true) {
			System.out.print("�α��˻�>> ");
			String name = s.next();

			if (name.equals("�׸�"))
				break;
			if (nations.get(name) == null)
				System.out.println(name + "������ �����ϴ�.");
			else
				System.out.println(name + "�� �α��� " + nations.get(name));
		}
		System.out.println("�������ϴ�.");
		s.close();
	}
}
