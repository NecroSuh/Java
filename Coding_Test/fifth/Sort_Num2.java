package fifth;

import java.util.*;

public class Sort_Num2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = s.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++)
			list.add(s.nextInt());

		Collections.sort(list);

		for (int value : list)
			sb.append(value).append('\n');
		System.out.println(sb);
		s.close();
	}
}
