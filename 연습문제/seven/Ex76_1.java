package seven;

import java.io.*;
import java.util.Scanner;

public class Ex76_1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		File f = new File("C:\\Windows\\system.ini");
		FileReader fr = null;

		try {
			fr = new FileReader(f);
			Scanner s = new Scanner(fr);
			System.out.println(f.getPath() + " ������ �о� ����մϴ�.");
			int i = 0;
			while (s.hasNext()) {
				i++;
				String line = s.nextLine();
				System.out.printf("%4d" + ": ", i);
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}
}
