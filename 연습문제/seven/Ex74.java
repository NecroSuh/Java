package seven;

import java.io.*;

public class Ex74 {
	public static void main(String[] args) {
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			f = new File("C:\\temp\\phone.txt");
			fr = new FileReader(f);
			System.out.println(f.getPath() + "를 출력합니다.");
			br = new BufferedReader(fr, 30);
			String temp = "";
			while (true) {
				temp = br.readLine();
				if (temp == null)
					break;
				System.out.println(temp);
			}
			fr.close();
		} catch (IOException e) {

		}
	}
}
