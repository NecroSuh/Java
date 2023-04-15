package seven;

import java.io.*;
import java.util.Scanner;

public class Ex73 {
	public static void main(String[] args) {
		File f = null;
		FileWriter fw = null;
		Scanner s = new Scanner(System.in);
		System.out.println("전화번호 입력 프로그램입니다.");
		String temp = "";
		try {
			f = new File("C:\\Temp\\phone.txt");
			fw = new FileWriter(f);
			while (true) {
				System.out.print("이름 전화번호 >> ");
				temp = s.nextLine();
				if (temp.contentEquals("그만"))
					break;
				fw.write(temp + "\r\n");
			}
			s.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(f.getPath() + "에 저장하였습니다.");
	}
}
