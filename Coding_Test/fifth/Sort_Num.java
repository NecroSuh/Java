package fifth;

import java.util.Scanner;

public class Sort_Num {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = s.nextInt();

		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		for (int val : arr)
			System.out.println(val);
		s.close();
	}
}
