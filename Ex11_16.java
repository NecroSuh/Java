package day06;

import java.util.*;

public class Ex11_16 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");// �̹� �����ϴ� Ű �߰����. ���� ���� ������

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("id�� password�� �Է����ּ���.");
			System.out.print("id : ");
			String id = s.nextLine().trim();

			System.out.print("password : ");
			String password = s.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}

			if (!(map.get(id)).equals(password)) {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
			} else {
				System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
			}
		}
	}
}
