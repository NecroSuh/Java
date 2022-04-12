package bookmanager;

// Data Class : 프로그램에서 관리해야할 대상
public class Book {
	private String title, author, buyDate;
	private int price;

	// 생성자, Getterm Setter
	public Book() {
	} // 기본 생성자

	public Book(String title, String author, String buyDate, int price) {
		super(); // 부모클래스의 생성자를 호출. 모든 클래스의 부모는 Object class
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
		return this; // 객체 자신을 반환
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
	
	// 메소드 오버라이딩 : 부모가 상속해 준 메소드를 재정의.
	@Override
	public String toString() { // Object class 정의된 메소드.
		return "Book [title=" + title + ", author=" + author + ", buyDate=" + buyDate + ", price=" + price + "]";
	}
	
}
