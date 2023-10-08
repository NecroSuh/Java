package seventh;

import java.io.*;

public class Rock_Game {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		bw.write((n % 7 == 0 || n % 7 == 2) ? "CY" : "SK");
		bw.flush();
		bw.close();
		br.close();
	}
}
