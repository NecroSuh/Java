package test3;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		byte b[] = new byte[6];
		try {
			@SuppressWarnings("resource")
			FileInputStream fr = new FileInputStream("C:\\Temp\\test.out");
			int n = 0, c;
			while ((c = fr.read()) != -1) {
				b[n] = (byte) c;
				n++;
			}
			System.out.println("C:\\Temp\\test.out���� ���� �迭�� ����մϴ�.");
			for (int i = 0; i < b.length; i++)
				System.out.print(b[i] + " ");
			System.out.println();
		} catch (IOException e) {
			System.out.println("C:\\Temp\\test.out���� ���� ���߽��ϴ�. ��θ��� üũ�غ�����.");
		}
	}
}
