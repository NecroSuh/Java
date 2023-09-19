package seventh;

import java.io.*;
import java.math.*;

public class Next_Prime {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_case = Integer.parseInt(br.readLine());
		for (int i = 0; i < test_case; i++) {
			long num = Long.parseLong(br.readLine());
			BigInteger NP = new BigInteger(String.valueOf(num));

			if (NP.isProbablePrime(10))
				System.out.println(NP);
			else
				System.out.println(NP.nextProbablePrime());
		}
	}
}
