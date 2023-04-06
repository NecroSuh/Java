package six;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location {
	private String name;
	private int longitude, latitude;

	public Location(String name, int longitude, int latitude) {
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String getName() {
		return name;
	}

	public int getLongitute() {
		return longitude;
	}

	public int getLatitude() {
		return latitude;
	}
}

public class Ex66 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, Location> info = new HashMap<String, Location>();

		System.out.println("도시, 경도, 위도를 입력하세요.");

		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String text = s.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			int longitude = Integer.parseInt(st.nextToken().trim());
			int latitude = Integer.parseInt(st.nextToken().trim());

			Location l = new Location(name, longitude, latitude);
			info.put(name, l);
		}
		Set<String> key = info.keySet();
		Iterator<String> it = key.iterator();
		System.out.println("---------------------------");
		while (it.hasNext()) {
			String name = it.next();
			Location l = info.get(name);
			System.out.print(l.getName() + " ");
			System.out.print(l.getLongitute() + " ");
			System.out.print(l.getLatitude() + " ");
		}
		System.out.println("---------------------------");

		while (true) {
			System.out.print("도시 이름>> ");
			String name = s.nextLine();
			if (name.equals("그만"))
				break;
			Location l = info.get(name);
			if (l == null)
				System.out.println(name + "는 없습니다.");
			else {
				System.out.print(l.getName() + " ");
				System.out.print(l.getLongitute() + " ");
				System.out.print(l.getLatitude());
			}
		}
		s.close();
	}
}
