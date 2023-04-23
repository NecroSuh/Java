package seven;

import java.io.*;

public class Ex80 {
	public static void main(String[] args) {
		File f = new File("C:\\");
		File[] subfiles = f.listFiles();
		File max_f = null;

		for (int i = 0; i < subfiles.length; i++) {
			if (i == 0)
				max_f = subfiles[i];
			if (max_f.length() < subfiles[i].length())
				max_f = subfiles[i];
		}
		System.out.print("가장 큰 파일은 " + max_f.getPath() + " " + max_f.length() + "바이트");
	}
}
