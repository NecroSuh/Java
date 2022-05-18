package album;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AlbumManager {
	private ArrayList<Album> list;
	private String filename;
	private static AlbumManager manager = null;

	private AlbumManager(String string) {
		list = new ArrayList<>();
		filename = string;
	}

	public static AlbumManager getInstance(String fname) {
		if (manager == null)
			manager = new AlbumManager(fname);
		return manager;
	}

	public void add(Album album) {
		list.add(album);
	}

	public void showAll() {
		for (Album a : list)
			System.out.println(a);
	}

	// list�� �ִ� Album ��ü���� ����(album.txt)�� �����ϴ� �޼ҵ�
	public void save() {
		// ���Ͽ���, ���Ͽ� ��ü ����ϱ�, ���ϴݱ�
		// try ~ catch : ����ó�� ����. try ��Ͽ��� ����(����)�� �߻��ϸ� catch ������ ���޵�.
		try {
			FileWriter writer = new FileWriter(filename);
			BufferedWriter buf = new BufferedWriter(writer); // ���ϱ�Ͽ� ���� ����� �߰�
			// ���Ͽ� ����ϱ�
			for (Album album : list) {
				buf.write(album.getTitle() + ",");
				buf.write(album.getArtist() + ",");
				buf.write(album.getGenre() + ",");
				buf.write(album.getPubdate() + ",");
				buf.write(album.getCompany() + ",");
				buf.write(Double.toString(album.getRating()));	// double --> String �����ؼ� ���
				buf.newLine();
			}
			buf.close(); // ���� �ݱ�
			System.out.println("�ٹ������͸� ���Ͽ� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		} // FileWriter ��ü �����ϸ鼭 ������ ����. ������ ��������.
	}
	// �ٹ� ��ü ������ ����. ���̳ʸ� ������� ����
	public void saveObject() {
		
	}

}
