package seven;

import java.io.File;

public class Ex81 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\user\\Descktop\\1243");
		File[] sf = f.listFiles();
		String s;
		int count = 0;

		System.out.println(f.getPath() + "디렉토리의 .txt 파일을 모두 삭제합니다...");

		for (int i = 0; i < sf.length; i++) {
			s = sf[i].getPath();
			int index = s.lastIndexOf(".txt");
			if (index != -1) {
				System.out.println(s + " 삭제");
				sf[i].delete();
				count++;
			}
		}
		System.out.println("총 " + count + "개의 .txt 파일을 삭제하였습니다.");
	}
}
