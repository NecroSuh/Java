package test2;

import java.util.HashMap;
import java.util.Scanner;

class S {
	private int id;
	private String tel;

	public S(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public String getTel() {
		return tel;
	}
}

public class HashMapStudentEx {
	public static void main(String[] args) {
		HashMap<String, S> map = new HashMap<String, S>();
		map.put("Ȳ����", new S(1, "010-111-1111"));
		map.put("���繮", new S(1, "010-222-2222"));
		map.put("�賲��", new S(1, "010-333-3333"));

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("�˻��� �̸�? ");
			String name = s.nextLine();
			if (name.equals("exit"))
				break;
			S student = map.get(name);
			if (student == null)
				System.out.println(name + "�� ���� ����Դϴ�.");
			else
				System.out.println("id: " + student.getId() + ", ��ȭ: " + student.getTel());
		}
		s.close();
	}
}
