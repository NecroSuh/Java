package test3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		FileWriter font = null;
		try {
			font = new FileWriter("C:\\Temp//test.txt");
			while (true) {
				String line = s.nextLine();
				if (line.length() == 0)
					break;
				font.write(line, 0, line.length());
				font.write("\r\n", 0, 2);
			}
			font.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		s.close();
	}
}
