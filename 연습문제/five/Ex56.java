package five;

import java.util.Scanner;

class Player {
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int select() {
		Scanner s = new Scanner(System.in);
		System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>> ");
		return s.nextInt();
	}
}

class Computer extends Player {
	public Computer(String name) {
		super(name);
	}

	public int select() {
		return (int) (Math.random() * 3 + 1);
	}
}

class RSPGame {
	private final String rsp[] = { "가위", "바위", "보" };
	Player[] player = new Player[2];

	public RSPGame() {
		player[0] = new Player("철수");
		player[1] = new Computer("컴퓨터");
	}

	public void Run() {
		int userchoice, computerchoice;

		while (true) {
			userchoice = player[0].select();

			if (userchoice < 1 || 4 < userchoice)
				System.out.println("잘못된 입력");
			else if (userchoice == 4)
				break;

			computerchoice = player[1].select();

			System.out.println(player[0].getName() + "(" + rsp[userchoice - 1] + "):" + player[1].getName() + "("
					+ rsp[computerchoice - 1] + ")");

			switch (userchoice - computerchoice) {
			case 0:
				System.out.println("무승부입니다.");
				break;
			case 2:
			case -1:
				System.out.println(player[1].getName() + "가 이겼습니다.");
				break;
			case -2:
			case 1:
				System.out.println(player[0].getName() + "가 이겼습니다.");
				break;
			}
		}
	}
}

public class Ex56 {
	public static void main(String[] args) {
		RSPGame game = new RSPGame();
		game.Run();
	}
}
