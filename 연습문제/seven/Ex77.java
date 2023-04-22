package seven;

import java.io.*;
import java.util.Scanner;

public class Ex77 {

	private static boolean compare(FileInputStream src, FileInputStream dest) {
		try (Scanner ssrc = new Scanner(src)) {
			try (Scanner sdest = new Scanner(dest)) {
				while (true) {
					if ((!ssrc.hasNext())) {
						String ssrc_line = ssrc.nextLine();
						String sdest_line = sdest.nextLine();
						if (!ssrc_line.equals(sdest_line))
							return false;
					}
					return true;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		FileInputStream srcS = null;
		FileInputStream destS = null;

		System.out.println("전체 경로가 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("첫번째 파일 이름을 입력하세요.>> ");
		String src = s.nextLine();

		System.out.print("두번째 파일 이름을 입력하세요.>> ");
		String dest = s.nextLine();
		System.out.println(src + "와 " + dest + "를 비교합니다.");

		try {
			srcS = new FileInputStream(src);
			destS = new FileInputStream(dest);
			if (compare(srcS, destS))
				System.out.println("파일이 같습니다.");
			else
				System.out.println("파일이 다릅니다.");
			srcS.close();
			destS.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		s.close();
	}
}
