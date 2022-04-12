package bookmanager;

// Data Class : ���α׷����� �����ؾ��� ���
public class Book {
	private String title, author, buyDate;
	private int price;

	// ������, Getterm Setter
	public Book() {
	} // �⺻ ������

	public Book(String title, String author, String buyDate, int price) {
		super(); // �θ�Ŭ������ �����ڸ� ȣ��. ��� Ŭ������ �θ�� Object class
		this.title = title;
		this.author = author;
		this.buyDate = buyDate;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public Book setTitle(String title) {
		this.title = title;
		return this; // ��ü �ڽ��� ��ȯ
	}

	public String getAuthor() {
		return author;
	}

	public Book setAuthor(String author) {
		this.author = author;
		return this;
	}

	public String getBuyDate() {
		return buyDate;
	}

	public Book setBuyDate(String buyDate) {
		this.buyDate = buyDate;
		return this;
	}

	public int getPrice() {
		return price;
	}

	public Book setPrice(int price) {
		this.price = price;
		return this;
	}

	public void printInfo() {
		System.out.println("## " + title);
		System.out.println("   " + author);
		System.out.println("   " + buyDate);
		System.out.println("   " + price);
	}
	
	// �޼ҵ� �������̵� : �θ� ����� �� �޼ҵ带 ������.
	@Override
	public String toString() { // Object class ���ǵ� �޼ҵ�.
		return "Book [title=" + title + ", author=" + author + ", buyDate=" + buyDate + ", price=" + price + "]";
	}
	
}
