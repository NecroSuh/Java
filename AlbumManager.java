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

	// list에 있는 Album 객체들을 파일(album.txt)에 저장하는 메소드
	public void save() {
		// 파일열기, 파일에 객체 기록하기, 파일닫기
		// try ~ catch : 예외처리 구문. try 블록에서 오류(예외)가 발생하면 catch 쪽으로 전달됨.
		try {
			FileWriter writer = new FileWriter(filename);
			BufferedWriter buf = new BufferedWriter(writer); // 파일기록에 버퍼 기능을 추가
			// 파일에 기록하기
			for (Album album : list) {
				buf.write(album.getTitle() + ",");
				buf.write(album.getArtist() + ",");
				buf.write(album.getGenre() + ",");
				buf.write(album.getPubdate() + ",");
				buf.write(album.getCompany() + ",");
				buf.write(Double.toString(album.getRating()));	// double --> String 변경해서 기록
				buf.newLine();
			}
			buf.close(); // 파일 닫기
			System.out.println("앨범데이터를 파일에 저장하였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} // FileWriter 객체 생성하면서 파일을 오픈. 없으면 생성해줌.
	}
	// 앨범 객체 단위로 저장. 바이너리 기반으로 저장
	public void saveObject() {
		
	}

}
