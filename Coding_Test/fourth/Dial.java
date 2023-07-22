package fourth;

import java.io.IOException;

public class Dial {
	public static void main(String[] args) throws IOException {
		int sum = 0;

		while (true) {
			int read = System.in.read();

			if (read < 'A')
				break;
			else if (read < 'D')
				sum += 3;
			else if (read < 'G')
				sum += 4;
			else if (read < 'J')
				sum += 5;
			else if (read < 'M')
				sum += 6;
			else if (read < 'P')
				sum += 7;
			else if (read < 'T')
				sum += 8;
			else if (read < 'W')
				sum += 9;
			else if (read < '[')
				sum += 10;
		}
		System.out.print(sum);
	}
}
