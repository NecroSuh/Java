package four;

class TV02 {
	private int size;

	public TV02(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTv1 extends TV02 {
	private int Color;

	public ColorTv1(int size, int Color) {
		super(size);
		this.Color = Color;
	}

	public void printProperty() {
		System.out.println(super.getSize() + "인치 " + Color + "컬러");
	}
}

class IPTV extends ColorTv {
	private String address;

	public IPTV(String address, int size, int Color) {
		super(size, Color);
		this.address = address;
	}

	public void printProperty() {
		System.out.print("나의 IPTV는 " + this.address + " 주소의 ");
		super.printProperty();
	}
}

public class Ex39 {
	public static void main(String[] args) {
		IPTV ip = new IPTV("192.1.1.2", 32, 2048);
		ip.printProperty();
	}
}
