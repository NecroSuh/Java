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
		return "������ key�� �����ϴ�.";
	}

	public int length() {
		return index;
	}
}

public class Ex45 {
	public static void main(String[] args) {
		Dictionary d = new Dictionary(10);
		d.put("Ȳ����", "�ڹ�");
		d.put("���繮", "���̽�");
		d.put("���繮", "c++");
		System.out.println("���繮�� ���� " + d.get("���繮"));
		System.out.println("Ȳ������ ���� " + d.get("Ȳ����"));
		d.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + d.get("Ȳ����"));
	}
}
