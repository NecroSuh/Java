package conditional;

public class Ex04_09 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		while (true) {
			if (sum > 100)
				break;
			++i;
			sum += i;
		}
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}

}
