import java.util.Scanner; //Scanner 클래스 입력 기능을 제공

public class Circle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner 객체 생성
		int rad;
		double size;
		final double PHI = 3.1415;

		System.out.print("반지름 : ");
		rad = scan.nextInt(); // 정수 입력
		size = rad * rad * PHI;
		System.out.println("면적 = " + size);
		System.out.printf("면적 = %.1f\n", size);
	}
}
