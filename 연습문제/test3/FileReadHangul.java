package test3;

import java.io.*;

public class FileReadHangul {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fr = null;
		try {
			fr = new FileInputStream("C:\\Temp//hangul.txt");
			in = new InputStreamReader(fr, "UTF-8");
			int c;

			System.out.println("���ڵ� ���� ������ " + in.getEncoding());
			while ((c = in.read()) != -1)
				System.out.print((char) c);
			in.close();
			fr.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}
}
