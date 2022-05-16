package gbox;

public class ComBook extends Book {
	private String title;
	private int price;

	public ComBook(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ComBook [title=" + title + ", price=" + price + "]";
	}

}
