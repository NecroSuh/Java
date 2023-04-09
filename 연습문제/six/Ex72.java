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
		ve.add(new Word("love", "사랑"));
		ve.add(new Word("animal", "동물"));
		ve.add(new Word("emotion", "감정"));
		ve.add(new Word("human", "인간"));
		ve.add(new Word("stock", "주식"));
		ve.add(new Word("trade", "거래"));
		ve.add(new Word("society", "사회"));
		ve.add(new Word("baby", "아기"));
		ve.add(new Word("honey", "꿀"));
		ve.add(new Word("dall", "인형"));
		ve.add(new Word("bear", "곰"));
		ve.add(new Word("picture", "사진"));
		ve.add(new Word("painting", "그림"));
		ve.add(new Word("fault", "오류"));
		ve.add(new Word("example", "보기"));
		ve.add(new Word("eye", "눈"));
		ve.add(new Word("statue", "조각상"));
	}

	void run() {
		System.out.println("**** 영어 단어 테스트 프로그램 \"명품 영어\"입니다. ****");
		while (true) {
			try {
				System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>> ");
				int input = sc.nextInt();
				if (input == 1) {
					play();
				} else if (input == 2) {
					insert();
				} else if (input == 3) {
					System.out.println("\"명품영어\"를 종료합니다.");
					break;
				} else {
					System.out.println("잘못된 입력 다시 입력해주세요.");
				}
			} catch (Exception ex) {
				System.out.println("잘못된 입력");
				@SuppressWarnings("unused")
				String buffer = sc.nextLine();
				continue;
			}
		}
	}

	void play() {
		System.out.println("현재 " + ve.size() + "개의 단어가 들어 있습니다. -1을 입력하면 종료합니다.");
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
		System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
		while (true) {
			System.out.print("영어 한글 입력 >>");
			String eng = sc.next();
			if (eng.equals("그만"))
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
