package seven;

import java.io.File;

public class Ex81 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\user\\Descktop\\1243");
		File[] sf = f.listFiles();
		String s;
		int count = 0;

		System.out.println(f.getPath() + "���丮�� .txt ������ ��� �����մϴ�...");

		for (int i = 0; i < sf.length; i++) {
			s = sf[i].getPath();
			int index = s.lastIndexOf(".txt");
			if (index != -1) {
				System.out.println(s + " ����");
				sf[i].delete();
				count++;
			}
		}
		System.out.println("�� " + count + "���� .txt ������ �����Ͽ����ϴ�.");
	}
}
