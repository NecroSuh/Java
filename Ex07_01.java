package class04;

class Tv {
	boolean power; // ��������(on/off)
	int channel; // ä��

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channlDown() {
		--channel;
	}
}

class SmartTv extends Tv { // SmartTv�� Tv�� ĸ��(�ڸ�)�� �����ִ� ����� �߰�
	boolean caption; // ĸ�ǻ���(on/off)

	void displayCaption(String text) {
		if (caption) // ĸ�� ���°� on(true)�� ���� text�� �����ش�.
			System.out.println(text);
	}
}

public class Ex07_01 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;				// ���� Ŭ�����κ� ��ӹ��� ���
		stv.channelUp();				// ���� Ŭ�����κ� ��ӹ��� ���
		System.out.println(stv.channel);
		stv.displayCaption("Hello World!!");
		stv.caption = true;
		stv.displayCaption("Hello World!!");
	}

}
