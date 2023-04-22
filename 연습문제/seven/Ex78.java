package seven;

import java.io.*;
import java.util.Scanner;

public class Ex78 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		FileReader fr = null;

		System.out.println("전체 경로가 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("첫번째 파일 이름을 입력하세요.>> ");
		String n1 = s.nextLine();
		System.out.print("두번째 파일 이름을 입력하세요.>> ");
		String n2 = s.nextLine();

		int c;
		try {
			fr = new FileReader(n1);
			FileWriter fw = new FileWriter("appended.txt", true);
			while ((c = fr.read()) != -1)
				fw.write((char) c);
			fr = new FileReader(n2);
			while ((c = fr.read()) != -1)
				fw.write((char) c);
			fr.close();
			fw.close();
			System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장하였습니다.");
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		s.close();
	}
}
