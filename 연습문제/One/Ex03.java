package One;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>");
		int m = s.nextInt();
		System.out.println("�������� " + m / 50000 + "��");
		m %= 50000;
		System.out.println("������ "+m/10000+"��");
		m%=10000;
		System.out.println("��õ���� "+m/5000+"��");
		m%=5000;
		System.out.println("õ���� "+m/1000+"��");
		m%=1000;
		System.out.println("500�� "+m/500+"��");
		m%=500;
		System.out.println("100�� "+m/100+"��");
		m%=100;
		System.out.println("50�� "+m/50+"��");
		m%=50;
		System.out.println("10�� "+m/10+"��");
		m%=10;
		System.out.println("1�� "+m/1+"��");
		
		s.close();
	}
}
