package day04;

public class Main_P extends Player{

	public static void main(String[] args) {
		Main_P p = new Main_P();
		p.play("Joakim Karud - Might Love");
		p.pause();
		p.stop();
	}

	@Override
	void play(String songName) {
		System.out.println(songName + " ���� ����մϴ�.");
	}

	@Override
	void pause() {
		System.out.println("���� �Ͻ������մϴ�.");
	}

	@Override
	void stop() {
		System.out.println("���� �����մϴ�.");
	}

}
