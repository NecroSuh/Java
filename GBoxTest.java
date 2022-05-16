package gbox;

public class GBoxTest {

	private static void showBox(GBox box) {
		box.showAll();
	}

	// Generic Method
	private static <T> void showGBox(GBox<?> box) {
		for (int i = 0; i < box.size(); i++) {
			T data = (T) box.get(i);
			System.out.println(data);
		}
	}

	public static void main(String[] args) {
		GBox<Integer> box = new GBox(); // ������ �ڽ� ��ü ����.
		box.add(7);
		int data = box.get(0);
		System.out.println(data);

		GBox<String> sbox = new GBox(10);
		sbox.add("Spring");
		String data2 = sbox.get(0);
		System.out.println(data2);

		GBox<ComBook> bookBox = new GBox(); // 5�� ũ���� �ڽ� ����
		bookBox.add(new ComBook("Java1", 12000));
		bookBox.add(new ComBook("Java2", 12000));
		bookBox.add(new ComBook("Java3", 12000));
		bookBox.add(new ComBook("Java4", 12000));
		bookBox.add(new ComBook("Java5", 12000));
		bookBox.add(new ComBook("Java6", 12000));
		bookBox.add(new ComBook("Java7", 12000));
		bookBox.showAll();

		showBox(box);
		showBox(sbox);

		showGBox(bookBox);
	}
}
