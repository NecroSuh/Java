package six;

import java.util.Scanner;
import java.util.Vector;

class Word {
	private String eng;
	private String kor;

	public Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public String getKor() {
		return kor;
	}
}

class EngQuiz {
	private Vector<Word> ve;
	private Scanner sc;

	public EngQuiz() {
		ve = new Vector<>();
		sc = new Scanner(System.in);
		ve.add(new Word("love", "���"));
		ve.add(new Word("animal", "����"));
		ve.add(new Word("emotion", "����"));
		ve.add(new Word("human", "�ΰ�"));
		ve.add(new Word("stock", "�ֽ�"));
		ve.add(new Word("trade", "�ŷ�"));
		ve.add(new Word("society", "��ȸ"));
		ve.add(new Word("baby", "�Ʊ�"));
		ve.add(new Word("honey", "��"));
		ve.add(new Word("dall", "����"));
		ve.add(new Word("bear", "��"));
		ve.add(new Word("picture", "����"));
		ve.add(new Word("painting", "�׸�"));
		ve.add(new Word("fault", "����"));
		ve.add(new Word("example", "����"));
		ve.add(new Word("eye", "��"));
		ve.add(new Word("statue", "������"));
	}

	void run() {
		System.out.println("**** ���� �ܾ� �׽�Ʈ ���α׷� \"��ǰ ����\"�Դϴ�. ****");
		while (true) {
			try {
				System.out.print("�ܾ� �׽�Ʈ:1, �ܾ� ����:2, ����:3>> ");
				int input = sc.nextInt();
				if (input == 1) {
					play();
				} else if (input == 2) {
					insert();
				} else if (input == 3) {
					System.out.println("\"��ǰ����\"�� �����մϴ�.");
					break;
				} else {
					System.out.println("�߸��� �Է� �ٽ� �Է����ּ���.");
				}
			} catch (Exception ex) {
				System.out.println("�߸��� �Է�");
				@SuppressWarnings("unused")
				String buffer = sc.nextLine();
				continue;
			}
		}
	}

	void play() {
		System.out.println("���� " + ve.size() + "���� �ܾ ��� �ֽ��ϴ�. -1�� �Է��ϸ� �����մϴ�.");
		while (true) {
			int[] arr = { -1, -1, -1, -1 };
			int arrRandInt = (int) (Math.random() * 4);
			int randInt = (int) (Math.random() * ve.size());
			arr[arrRandInt] = randInt;
			System.out.println(ve.get(randInt).getEng() + "?");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != -1 || arr[i] == arrRandInt) {
					continue;
				} else {
					int tempRand = (int) (Math.random() * ve.size());
					for (int j = 0; j < i; j++) {
						if (tempRand == arr[j]) {
							j = 0;
							tempRand = (int) (Math.random() * ve.size());
						}
					}
					arr[i] = tempRand;
				}
			}
			for (int j = 0; j < arr.length; j++) {
				System.out.print("(" + (int) (j + 1) + ")" + ve.get(arr[j]).getKor() + " ");
			}
			System.out.print(":>");
			int n = sc.nextInt();
			if (n == (int) (arrRandInt + 1)) {
				System.out.println("Exellent!");
			} else if (n == -1) {
				break;
			} else {
				System.out.println("No!");
			}
		}
	}

	void insert() {
		System.out.println("���� �ܾ �׸��� �Է��ϸ� �Է��� �����մϴ�.");
		while (true) {
			System.out.print("���� �ѱ� �Է� >>");
			String eng = sc.next();
			if (eng.equals("�׸�"))
				break;
			String kor = sc.next();
			ve.add(new Word(eng, kor));
		}
	}

}

public class Ex72 {
	public static void main(String[] args) {
		EngQuiz eq = new EngQuiz();
		eq.run();
	}
}
