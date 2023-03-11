package two;

public class Ex13 {
	public static void main(String[] args) {
		int n[][] = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };

		for (int i = 0; i < n.length; i++) {
			int[] inArr = n[i];
			for (int j = 0; j < inArr.length; j++) {
				System.out.print(inArr[j] + " ");
			}
			System.out.println();
		}
	}
}
