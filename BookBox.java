package bookmanager;

// Manager Class : ���α׷��� ����� �����ϴ� Ŭ����
public class BookBox {
	private Book[] books; // Book ��ü�迭 ����
	private int count = 0; // BookBox ��ü�� ����� Book ��ü�� ���� ����

	public BookBox(int size) {
		books = new Book[size]; // Book ��ü �迭 ����
		// count = 0;
	}

	// method overloading : �޼ҵ� �ߺ�����. �ŰԺ����� �޶�� ��.
	public void add(Book book) {
		books[count++] = book;
	}

	public void add(String title, String author, String date, int price) {
		books[count++] = new Book(title, author, date, price);
	}

	public Book get(int i) {
		return books[i];
	}
}
