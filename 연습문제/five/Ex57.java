package five;

import java.util.Scanner;

class P {
	private String name;

	public P(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class GG {
	private P[] player = new P[2];
	public Scanner sc;
	public int index;
	public String buffer;

	public GG() {
		sc = new Scanner(System.in);
		index = 0;
	}

	public void run() {
		System.out.print("1번째 선수 이름 >> ");
		player[0] = new P(sc.nextLine());
		System.out.print("2번째 선수 이름>> ");
		player[1] = new P(sc.nextLine());

		while (true) {
			System.out.print("[" + player[index].getName() + "]:<Enter>");
			sc.nextLine();
			int a = (int) (Math.random() * 3 + 1);
			int b = (int) (Math.random() * 3 + 1);
			int c = (int) (Math.random() * 3 + 1);
			System.out.print("\t" + a + "\t" + b + "\t" + c + "\t");
			if (a == b && b == c) {
				System.out.println(player[index].getName() + "님이 이겼습니다!");
				break;
			} else {
				System.out.println("아쉽군요!");
				index = index == 1 ? 0 : 1;
			}
		}
	}
}

public class Ex57 {
	public static void main(String[] args) {
		GG game = new GG();
		game.run();
	}
}
