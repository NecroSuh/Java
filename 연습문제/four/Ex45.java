package four;

abstract class PairMap {
	protected String keyArray[];
	protected String ValueArray[];

	abstract String get(String key);

	abstract void put(String key, String value);

	abstract String delete(String key);

	abstract int length();
}

class Dictionary extends PairMap {
	private int index = 0;

	public Dictionary(int size) {
		keyArray = new String[size];
		ValueArray = new String[size];
	}

	public String get(String key) {
		for (int i = 0; i < index; i++) {
			if (key.equals(keyArray[i]))
				return ValueArray[i];
		}
		return null;
	}

	public void put(String key, String value) {
		for (int i = 0; i < index; i++) {
			if (key.equals(keyArray[i])) {
				ValueArray[i] = value;
				return;
			}
		}
		keyArray[index] = key;
		ValueArray[index] = value;
		index++;
	}

	public String delete(String key) {
		for (int i = 0; i < index; i++) {
			if (key.equals(keyArray[i])) {
				ValueArray[i] = "null";
				return null;
			}
		}
		return "동일한 key가 없습니다.";
	}

	public int length() {
		return index;
	}
}

public class Ex45 {
	public static void main(String[] args) {
		Dictionary d = new Dictionary(10);
		d.put("황기태", "자바");
		d.put("이재문", "파이썬");
		d.put("이재문", "c++");
		System.out.println("이재문의 값은 " + d.get("이재문"));
		System.out.println("황기태의 값은 " + d.get("황기태"));
		d.delete("황기태");
		System.out.println("황기태의 값은 " + d.get("황기태"));
	}
}
