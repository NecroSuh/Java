package second;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Hanoi_Tower {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();

		bw.write((int) (Math.pow(2, N) - 1) + "\n");

		Hanoi(N, 1, 2, 3);
		bw.flush();
		bw.close();

		s.close();
	}

	public static void Hanoi(int N, int start, int mid, int to) throws IOException {
		if (N == 1) {
			bw.write(start + " " + to + "\n");
			return;
		}
		Hanoi(N - 1, start, to, mid);
		bw.write(start + " " + to + "\n");
		Hanoi(N - 1, mid, start, to);

	}
}