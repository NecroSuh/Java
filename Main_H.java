package day05;

public class Main_H implements Horse, Dragon{

	public static void main(String[] args) {
		Main_H main = new Main_H();
		main.one();
		main.two();

}

	@Override
	public void one() {
		System.out.println("One");
	}
	
	@Override
	public void two() {
		System.out.println("Two");
	}
	
}