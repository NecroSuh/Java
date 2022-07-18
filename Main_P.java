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
		System.out.println(songName + " 곡을 재생합니다.");
	}

	@Override
	void pause() {
		System.out.println("곡을 일시정지합니다.");
	}

	@Override
	void stop() {
		System.out.println("곡을 정지합니다.");
	}

}
