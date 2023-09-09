package sixth;

import java.io.*;
import java.util.*;

public class Queue_Stack {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		int[] typeArr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++)
			typeArr[i] = Integer.parseInt(st.nextToken());
		Deque<Integer> deque = new ArrayDeque<>();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (typeArr[i] == 0)
				deque.addLast(num);
		}
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		br.close();

		while (m-- > 0) {
			int move = Integer.parseInt(st.nextToken());
			deque.addFirst(move);
			sb.append(deque.pollLast()).append(" ");
		}
		System.out.println(sb);
	}
}
