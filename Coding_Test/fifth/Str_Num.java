package fifth;

import java.util.*;

public class Str_Num {
	static HashSet<String> set;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();

		set = new HashSet<String>();

		String name = "";

		for (int i = 0; i < str.length(); i++) {
			name = "";
			for (int j = i; j < str.length(); j++) {
				name += str.substring(j, j + 1);
				set.add(name);
			}
		}
		System.out.println(set.size());
		s.close();
	}
}
