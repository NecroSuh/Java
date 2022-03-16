package variable;

public class Ex2_2 {

	public static void main(String[] args) {
		int x = 10, y = 5;
		System.out.println("x=" + x);
		System.out.println("y=" + y);

		int tmp = x; 	// 1. x의 값을 tmp에 저장
		x = y; 			// 2. y의 값을 x에 저장
		y = tmp; 		// 3. tmp에 저장된 값을 y에 저장
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}
