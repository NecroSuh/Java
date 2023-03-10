package two;

public class Ex18 {
	public static void main(String[] args) {
		int num[] = new int[10];
		double sum = 0;
		System.out.print("·£´ýÇÑ Á¤¼öµé: ");
		for (int i = 0; i < num.length; i++) {
			int x = (int) (Math.random() * 10 + 1);
			sum += x;
			System.out.print(x + " ");
		}
		System.out.print("\nÆò±ÕÀº " + sum / 10);
	}
}
