package album;

public class AlbumMain {

	public static void main(String[] args) {
		// AlbumManager manager = new AlbumManager("album.txt");
		AlbumManager manager = AlbumManager.getInstance("album.csv");

		manager.add(new Album("¿©Çà1", "º¼»¡°£»çÃá±â", "¹ß¶óµå", "2018/04/15", "»çÃá±â¹ÂÁ÷", 9.4));
		manager.add(new Album("¿©Çà2", "º¼»¡°£»çÃá±â", "¹ß¶óµå", "2018/04/15", "»çÃá±â¹ÂÁ÷", 9.1));
		manager.add(new Album("¿©Çà3", "º¼»¡°£»çÃá±â", "¹ß¶óµå", "2018/04/15", "»çÃá±â¹ÂÁ÷", 9.7));
		manager.add(new Album("¿©Çà4", "º¼»¡°£»çÃá±â", "¹ß¶óµå", "2018/04/15", "»çÃá±â¹ÂÁ÷", 9.3));
		manager.showAll();

		manager.save();
		
		manager.saveObject();
	}

}
