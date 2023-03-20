package four;

class Tv {
	private int size;

	public Tv(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTv extends Tv {
	private int Color;

	public ColorTv(int size, int Color) {
		super(size);
		this.Color = Color;
	}

	public void printProperty() {
		System.out.println(super.getSize() + "인치 " + Color + "컬러");
	}
}

public class Ex38 {
	public static void main(String[] args) {
		ColorTv myTv = new ColorTv(32, 1024);
		myTv.printProperty();
	}
}
