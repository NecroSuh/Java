package class01;

public class Ex06_01 {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ä���� " + t.channel + "�Դϴ�.");
	}

}

class Tv {
	// Tv�� �Ӽ�(�������)
	String color;
	boolean power;
	int channel;

	// Tv�� ���(�޼���)
	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}
