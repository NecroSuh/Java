package sixth;

import java.io.*;
import java.util.*;

public class Poketmon {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> nameMap = new HashMap<String, Integer>();
		String[] nameArr = new String[n + 1];
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < n + 1; i++) {
			String name = br.readLine();
			nameMap.put(name, i);
			nameArr[i] = name;
		}
		while (m-- > 0) {
			String find = br.readLine();
			if (isStringNum(find)) {
				int index = Integer.parseInt(find);
				sb.append(nameArr[index]);
			} else
				sb.append(nameMap.get(find));
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	public static boolean isStringNum(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
