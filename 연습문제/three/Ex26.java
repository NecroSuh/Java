package three;

class Tv {
	private String mf;
	private int year;
	private int inch;

	Tv(String mf, int year, int inch) {
		this.mf = mf;
		this.year = year;
		this.inch = inch;
	}

	public void show() {
		System.out.println(mf + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}

public class Ex26 {
	public static void main(String[] args) {
		Tv myTv = new Tv("LG", 2017, 32);
		myTv.show();
	}
}
