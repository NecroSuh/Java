package conditional;

public class Ex04_06 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		// i를 1씩증가시켜서 sum애 계속 더해나간다.
		while (sum <= 100) {
			System.out.printf("%d-%d%n", i, sum);
			sum += ++i;
		}
	}
}
