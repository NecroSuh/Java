import java.util.Scanner;
import java.util.Random;

public class JavaArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		// �ڹ� �迭 : ����, �迭 ����, ����, �迭 ���� ����, �迭Ž��
		// �迭(Array) : �ڷᱸ��, ������ ������ ���ҵ��� ���Ӱ����� ����Ǵ� ����
		// C/C++ �迭
		// int a[5]; // ���� �迭�� ���̰� �־����� ��. ���� �ϴ� ���� �ƴϰ� �迭 ����.

		// �迭�� ���� : �������̹迭 vs �������̹迭
		// �����迭(static array) : ������ �ÿ� �迭�� ���� ��� ������ �ľ�. �Լ��� ����� �� �޸� �Ҵ�. ���� ������ ����
		// �����迭(dynamic array) : ������ �ÿ� �迭�� �͸� �ȴ�. ���̰� ������ ��. �����߿� �޸� �Ҵ�. �� ������ ����
		// int *p;
		// p= new int[m]; // malloc()

		// Java
		/*
		 * int[] a; // �迭���� ����. int a[]; a = new int[5]; // �迭 ����. �޸� �Ҵ�. int[] b = new
		 * int[8]; // ����� ����
		 * 
		 * int n = scan.nextInt(); int[] c = new int[n];
		 * 
		 * // �ʱ�ȭ // int[] d = { 1, 2, 3, 4, 5 }; int[] d = new int[] { 1, 2, 3, 4, 5 };
		 * 
		 * int x = d[0] + d[1] + d[2]; d[3] = 9; // d �������� �迭�� �����ּ�(base
		 * address)+offset. 310 + (4*3)=322
		 * 
		 * int[] d2 = d; // ����Ǵ� ���� �迭�� �����ּ�. // �迭 ��ȯŽ�� for (int i = 0; i < b.length;
		 * i++) { b[i] = i + 1; } for (int e : b) { // foreach ���� System.out.print(e +
		 * ", "); }
		 */
		// ����1. ���� �������� 5~20 ���� ������ ������ 10�� �����ϰ� �迭�� ����.
		// ������ => ���� ���.
		final int COUNT = 10; // ��ȣ���
		final double PHI = 3.14516;
		int[] rad = new int[COUNT];
		for (int i = 0; i < rad.length; i++) {
			rad[i] = r.nextInt(16) + 5;
			float size = rad[i] * rad[i] * (float) PHI;
			System.out.println(rad[i] + "=>" + size);
		}
		// ����2 �迭�� ������
		int[] x = { 1, 3, 5, 6, 9 };
		int[] y = { 7, 4, 3, 9, 11 };
		int[] z = new int[10];
		// �迭 ����
		for (int i = 0; i < x.length; i++) {
			z[i] = x[i];
		}
		int k = x.length;
		for (int i = 0; i < y.length; i++) {
			// y[i] ���� x �迭�� �ִ��� üũ
			boolean found = false;
			for (int j = 0; j < x.length; j++) {
				if (y[i] == x[j])
					found = true;
				break;
			}
			if (!found)
				z[k++] = y[i];
		}
		for (int e : z)
			if (e > 0)
				System.out.print(e + ", ");
		System.out.println();
	}
}
