package album;

public class AlbumMain {

	public static void main(String[] args) {
		// AlbumManager manager = new AlbumManager("album.txt");
		AlbumManager manager = AlbumManager.getInstance("album.csv");

		manager.add(new Album("����1", "�����������", "�߶��", "2018/04/15", "��������", 9.4));
		manager.add(new Album("����2", "�����������", "�߶��", "2018/04/15", "��������", 9.1));
		manager.add(new Album("����3", "�����������", "�߶��", "2018/04/15", "��������", 9.7));
		manager.add(new Album("����4", "�����������", "�߶��", "2018/04/15", "��������", 9.3));
		manager.showAll();

		manager.save();
		
		manager.saveObject();
	}

}
