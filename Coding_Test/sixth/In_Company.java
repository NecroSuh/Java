package sixth;

import java.util.*;

public class In_Company {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		HashMap<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < n; i++) {
			String name = s.next();
			String state = s.next();

			if (map.containsKey(name))
				map.remove(name);
			else
				map.put(name, state);
		}
		ArrayList<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list, Collections.reverseOrder());

		for (var li : list)
			System.out.println(li);
		s.close();
	}
}
