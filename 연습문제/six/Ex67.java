package six;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex67 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, Double> stu = new HashMap<String, Double>();

		System.out.println("미래장학금관리시스템입니다.");
		for (int i = 0; i < 5; i++) {
			System.out.print("이름과 학점>> ");
			String name = s.next();
			double grade = s.nextDouble();
			stu.put(name, grade);
		}
		System.out.print("장학생 선발  학점 기준 입력>> ");
		double standard = s.nextDouble();

		System.out.print("장학생 명단: ");
		Set<String> keys = stu.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			double value = stu.get(key);
			if (value >= standard)
				System.out.print(key + " ");
		}
		s.close();
	}
}
