package second;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_System{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			String command = s.nextLine();

			if (command.startsWith("push")) {
				int num = Integer.parseInt(command.split(" ")[1]);
				queue.offer(num);
			} else if (command.equals("pop")) {
				if (queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.poll());
			} else if (command.equals("size"))
				System.out.println(queue.size());
			else if (command.equals("empty")) {
				if (queue.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			} else if (command.equals("front")) {
				if (queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.peek());
			} else if (command.equals("back")) {
				if (queue.isEmpty())
					System.out.println(-1);
				else {
					int lastElement = 0;
					for (int num : queue)
						lastElement = num;
					System.out.println(lastElement);
				}
			}
		}
		s.close();
	}

}
