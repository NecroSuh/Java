package seven;

import java.io.*;

public class Ex79 {
	public static void main(String[] args) {
		File src = new File("a.jpg");
		File dest = new File("b.jpg");

		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);

			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사합니다.");
			System.out.println("10%마다 *를 출력합니다.");
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
			System.out.println("입출력 오류");
		}
	}
}
