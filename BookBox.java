package bookmanager;

// Manager Class : 프로그램의 기능을 구현하는 클래스
public class BookBox {
	private Book[] books; // Book 객체배열 선언
	private int count = 0; // BookBox 객체에 저장된 Book 객체의 수를 저장

	public BookBox(int size) {
		books = new Book[size]; // Book 객체 배열 생성
		// count = 0;
	}

	// method overloading : 메소드 중복정의. 매게변수가 달라야 됨.
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
