package test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScopeEx {
	public static void main(String[] args) {
		HashMap<String, Integer> scopeMap = new HashMap<String, Integer>();

		scopeMap.put("김성동", 97);
		scopeMap.put("황기태", 88);
		scopeMap.put("김남윤", 98);
		scopeMap.put("이재문", 70);
		scopeMap.put("한원선", 99);

		System.out.println("HashMap의 요소 개수: " + scopeMap.size());

		Set<String> keys = scopeMap.keySet();
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String name = it.next();
			int score = scopeMap.get(name);
			System.out.println(name + " : " + score);
		}
	}
}
