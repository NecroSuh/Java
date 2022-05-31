package counter;

import java.util.Random;

public class Runner extends Thread {
	private static int score = 0; // ��������. �ϳ��� ����. ��ü���� �����ϴ� ����
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
				scoring(10); // ���� ��ġ�� 8�� ����ڸ��̸� 10 ����
			if (pos % 9 == 0)
				try {
					Thread.sleep(300);
					System.out.println(name + " : " + pos + "sleeping...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		System.out.println(name + "is arrived.");
		setResult(name); // Ÿ���� ���� �ǳʰ����Ƿ� winner�� �����ҷ��� ��
	}

	// ����ȭ : �ϳ��� �����常 �޼ҵ� ����. �ٸ� ������� ������ ���.
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
