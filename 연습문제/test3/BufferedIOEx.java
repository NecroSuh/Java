package test3;

import java.io.*;
import java.util.Scanner;

public class BufferedIOEx {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		FileReader fr = null;
		int c;
		try {
			fr = new FileReader("C:\\Temp\\test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			while ((c = fr.read()) != -1)
				out.write(c);
			new Scanner(System.in).nextLine();
			out.flush();
			fr.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
