package seven;

import java.io.*;

public class Ex75 {
	public static void main(String[] args) {
		File f = null;
		FileReader fr = null;
		try {
			f = new File("C:\\Windows\\system.ini");
			fr = new FileReader(f);
			int c;
			char ch;
			while ((c = fr.read()) != -1) {
				ch = (char) c;
				if (ch >= 'a' && ch <= 'z')
					ch = Character.toUpperCase(ch);
				System.out.print(ch);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
