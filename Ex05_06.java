package array;

public class Ex05_06 {

	public static void main(String[] args) {
		String[] names = { "Kim", "Park", "Yi" };

		for (int i = 0; i < names.length; i++) 
			System.out.println("names[" + i + "]:" + names[i]);

			String tmp = names[2];	// �迭 names�� �� ��°��Ҹ� tmp�� ���� 
			System.out.println("tmp:" + tmp);
			names[0] = "Yu";	// �迭 names�� ù ��° ��Ҹ� "Yu"�� ����

			for (int j = 0; j < names.length; j++) {
				System.out.println(names[j]);
			}
		}
	}

