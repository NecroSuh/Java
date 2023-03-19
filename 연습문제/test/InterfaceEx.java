package test;

interface PhoneInterface {
	final int TIMEOUT = 10000;

	void sendCall();

	void receiveCall();

	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class Samsumg implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("�츮������");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}

	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		Samsumg sp = new Samsumg();
		sp.printLogo();
		sp.sendCall();
		sp.receiveCall();
		sp.flash();
	}
}
