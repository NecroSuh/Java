package javaarray2;

import java.util.*;

public class JavaArray2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		// �ڹ� ������ �迭 : 2����, 3����, 4����
		/*
		 * int[][] a = new int[2][3]; // 2�� 3�� 2���� �迭 a={{1,2,3} , {4,5,6 } } int[][][]
		 * b = new int[2][3][5]; // ť�� ���� 3���� �迭 b={{{1,2,3,4,5} , {} , {}} , {{} ,{} ,
		 * {}}} int[][][][] c = new int[2][3][5][4];
		 * 
		 * int x = a[0][0] + a[1][1];
		 * 
		 * for (int i = 0; i < 2; i++) // ���� ��ȯ for (int j = 0; j < 3; j++) a[i][j] = j
		 * + 1; // �ϳ��� �࿡���� ���� ��ȯ for (int[] e : a) // a�� ���Ҹ� e�� �޴� ��. for (int d : e)
		 * System.out.println(d);
		 * 
		 * // �������̹迭 - Collection classes ArrayList<Integer> list = new
		 * ArrayList<Integer>(); // �����迭. ���� ������ ����. ���� �����迭. Integer p = new
		 * Integer(5); // ���� �����͸� ó���ϴ� ��ɵ��� ������ Ŭ����. p�� Integer ��ü ����(�ּ� ����) int q = 5;
		 * // q�� ���� ����. int�� �⺻�ڷ��� Double dou = 6.7; // Wrapper class. Byte, Short,
		 * Float, Character Integer p2 = 8; // autoboxing q += p; // auto-unboxing
		 * 
		 * list.add(4); list.add(5); list.add(6); System.out.println("Size= " +
		 * list.size()); for (int i = 0; i < list.size(); i++)
		 * System.out.println(list.get(i)); list.remove(1); for (int e : list)
		 * System.out.println(e);
		 */

		// ����. ���� �ҹ��� ���ڿ��� �Է¹ް� ���ĺ� ������ ����ϴ� ��
		// ��) ���ڿ� : abcabcabc
		// a : 3
		// b : 3
		// c : 3
		/*
		 * char ch = 'a'; System.out.println('c' - ch); char ch2 = (char) (ch + 3);
		 * System.out.println(ch2);
		 * 
		 * String str; System.out.print("���ڿ� : "); str = scan.nextLine();
		 * 
		 * for (int i = 1; i <= 26; i++) { // a ~ z int cnt = 0; // ���ĺ� ���ڰ� ���ڿ����� �� ��
		 * �ִ��� ī��Ʈ �ϱ� for (int j = 0; j < str.length(); j++) { if (ch == str.charAt(j))
		 * cnt++; } if (cnt > 0) System.out.println(ch + ":" + cnt); ch = (char) ('a' +
		 * i); // b c d e f g }
		 */
		// �迭�� �̿��ؼ� �ϴ� ���
		int[][] count = new int[3][26]; // a~z ������ �� ���ĺ��� ������ �����ϴ� �迭
		for (int k = 0; k < 3; k++) {
			String str;
			System.out.print("���ڿ� : ");
			str = scan.nextLine();
			for (int i = 0; i < str.length(); i++) {
				// System.out.println(str.charAt(i) - 'a');
				count[k][str.charAt(i) - 'a']++;
			}
			// for (int e : count)
			// System.out.println(e);
			for (int i = 0; i < count[k].length; i++) {
				char ch3 = (char) ('a' + i);
				if (count[k][i] > 0)
					System.out.println(ch3 + ":" + count[k][i]);
			}
		}
	}
}
