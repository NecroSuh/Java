package class02;

class Ex06_09 {
	static {
		System.out.println("static{ }");
	}
	{
		System.out.println("{ }");
	}

	public Ex06_09() {
		System.out.println("»ý¼ºÀÚ");
	}

	public static void main(String[] args) {
		System.out.println("Ex06_09 bt= new Ex06_09(); ");
		Ex06_09 bt = new Ex06_09();

		System.out.println("Ex06_09 bt2 = new Ex06_09(); ");
		Ex06_09 bt2 = new Ex06_09();
	}
}
