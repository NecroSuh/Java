package test3;

import java.io.*;

public class FileReadHangulFail {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fr = null;
		try {
			fr = new FileInputStream("C:\\Temp\\hangul.txt");
			in = new InputStreamReader(fr, "US-ASCII");
			int c;

			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while ((c = in.read()) != -1)
				System.out.print((char) c);
			in.close();
			fr.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
