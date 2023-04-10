package test3;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Windows\\system.ini");
			int c;
			while ((c = fr.read()) != -1)
				System.out.print((char) c);
			fr.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
