package two;

public class Ex22 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			int n1 = i % 10;
			int n2 = i / 10;
			if ((n1 == 3 || n1 == 6 || n1 == 9) && (n2 == 3 || n2 == 6 || n2 == 9))
				System.out.println(i + " ¹Ú¼ö Â¦Â¦");
			else if (n1 == 3 || n1 == 6 || n1 == 9 || n2 == 3 || n2 == 6 || n2 == 9)
				System.out.println(i + " ¹Ú¼ö Â¦");
		}
	}
}
