package three;

class Song {
	String title, artist, country;
	int year;

	Song() {
		this("title", "artist", 1000, "country");
	}

	Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	public void show() {
		System.out.print(year + "�� " + country + " ������ " + artist + "�� �θ� " + title);
	}
}

public class Ex28 {
	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "������");
		song.show();
	}
}
