package test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScopeEx {
	public static void main(String[] args) {
		HashMap<String, Integer> scopeMap = new HashMap<String, Integer>();

		scopeMap.put("�輺��", 97);
		scopeMap.put("Ȳ����", 88);
		scopeMap.put("�賲��", 98);
		scopeMap.put("���繮", 70);
		scopeMap.put("�ѿ���", 99);

		System.out.println("HashMap�� ��� ����: " + scopeMap.size());

		Set<String> keys = scopeMap.keySet();
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String name = it.next();
			int score = scopeMap.get(name);
			System.out.println(name + " : " + score);
		}
	}
}
