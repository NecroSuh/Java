package counter;

import java.util.Random;

public class Runner extends Thread {
	private static int score = 0; // 정적변수. 하나가 존재. 객체들이 공유하는 변수
	private static String winner = null;
	private String name;
	private int[] tiles;

	public Runner(String name, int size) {
		this.name = name;
		tiles = new int[size];
	}

	@Override
	public void run() {
		Random random = new Random();
		int pos = 0;

		while (pos < tiles.length) {
			pos += random.nextInt(5) + 1;
			System.out.println(name + ":" + pos);
			if (pos % 8 == 0)
				scoring(10); // 현재 위치가 8의 배수자리이면 10 증가
			if (pos % 9 == 0)
				try {
					Thread.sleep(300);
					System.out.println(name + " : " + pos + "sleeping...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		System.out.println(name + "is arrived.");
		setResult(name); // 타일을 전부 건너갔으므로 winner에 세팅할려고 함
	}

	// 동기화 : 하나의 쓰레드만 메소드 실행. 다른 쓰레드는 실행을 대기.
	private synchronized void scoring(int s) {
		score += s;
		System.out.println(name + ":" + s + "-->" + score);
	}

	private synchronized void setResult(String name) {
		if (winner == null)
			winner = name;
		else
			System.out.println("Winner : " + winner);
	}
}
