package test;

class Weapon {
	protected int fire() {
		return 1;
	}
}

class Cannon extends Weapon {
	@Override
	protected int fire() {
		return 10;
	}
}

public class Overriding {
	public static void main(String[] args) {
		Weapon w;
		w = new Weapon();
		System.out.println("�⺻ ������ ��� �ɷ��� " + w.fire());
		w = new Cannon();
		System.out.println("������ ��� �ɷ��� " + w.fire());
	}
}
