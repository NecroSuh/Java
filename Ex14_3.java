package day09;

import java.util.function.*;

public class Ex14_3 {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i % 2 == 0;
		Predicate<Integer> notP = p.negate(); // i >=100

		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150)); // true

		String str1 = "abc";
		String str2 = "abc";

		// str1�� str2�� ������ ���� ����� ��ȯ
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		System.out.println(result);
	}
}
