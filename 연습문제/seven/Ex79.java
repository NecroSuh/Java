package seven;

import java.io.*;

public class Ex79 {
	public static void main(String[] args) {
		File src = new File("a.jpg");
		File dest = new File("b.jpg");

		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);

			System.out.println(src.getPath() + "�� " + dest.getPath() + "�� �����մϴ�.");
			System.out.println("10%���� *�� ����մϴ�.");
			long f_size = ((src.length()) / 10);

			byte[] buf = new byte[(int) f_size];
			while (true) {
				int n = fi.read(buf);
				fo.write(buf, 0, n);

				if (n < buf.length)
					break;
				System.out.print('*');
			}
			fi.close();
			fo.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}
}
