package seven;

import java.io.*;

public class Ex76 {
	public static void main(String[] args) {
		File f = null;
		BufferedReader br = null;

		try {
			f = new File("C:\\Windows\\system.ini");
			br = new BufferedReader(new FileReader(f));

			String s = "";
			int i = 1;
			System.out.println(f.getPath() + " 파일을 읽어 출력합니다.");
			while (true) {
				s = br.readLine();
				if (s == null)
					break;
				System.out.println("\t" + i + " : " + s);
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
