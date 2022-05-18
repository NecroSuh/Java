package album;

public class Album {
	private String title, artist, genre, pubdate, company;
	private double rating;
	public Album(String title, String artist, String genre, String pubdate, String company, double rating) {
		super();
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.pubdate = pubdate;
		this.company = company;
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Album [title=" + title + ", artist=" + artist + ", genre=" + genre + ", pubdate=" + pubdate
				+ ", company=" + company + ", rating=" + rating + "]";
	}
	
}