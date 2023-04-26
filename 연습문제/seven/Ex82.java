package seven;

import java.io.*;
import java.util.*;

class PhoneExplorer {

	private String fileName = "C:\\temp\\phone.txt";
	private HashMap<String, String> phoneMap = new HashMap<String, String>();

	private void readPhoneFile() {
		try {
			Scanner scan = new Scanner(new FileReader(new File(fileName)));
			while (scan.hasNext()) {
				String name = scan.next();
				String tel = scan.next();
				phoneMap.put(name, tel);
			}
			scan.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("�� " + phoneMap.size() + "���� ��ȭ��ȣ�� �о����ϴ�.");
	}

	private void processQuery() {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("�̸�>> ");
			String name = s.next();
			if (name.equals("�׸�"))
				break;
			String tel = phoneMap.get(name);
			if (tel == null)
				System.out.println("ã�� �̸��� �����ϴ�.");
			else
				System.out.println(tel);
		}
		s.close();
	}

	public void run() {
		readPhoneFile();
		processQuery();
	}
}

public class Ex82 {
	public static void main(String[] args) {
		PhoneExplorer pe = new PhoneExplorer();
		pe.run();
	}
}
