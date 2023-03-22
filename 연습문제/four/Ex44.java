package four;

import java.util.Scanner;

interface Stack {
	int length();

	int capacity();

	String pop();

	boolean push(String val);
}

class StringStack implements Stack {
	private int size;
	private int index;
	private String[] StackArray;

	public StringStack(int size) {
		this.size = size;
		StackArray = new String[size];
		this.index = -1;
	}

	public int length() {
		return index + 1;
	}

	public int capacity() {
		return StackArray.length;
	}

	public String pop() {
		String popStr;
		if (index == -1)
			return null;
		popStr = StackArray[index];
		index--;
		return popStr;
	}

	public boolean push(String val) {
		if (index + 1 < size) {
			index++;
			StackArray[index] = val;
			return true;
		} else
			return false;
	}
}

public class Ex44 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է�>> ");
		int size = s.nextInt();
		StringStack Stack = new StringStack(size);

		while (true) {
			System.out.print("���ڿ� �Է�>> ");
			String val = s.next();
			if (val.equals("�׸�"))
				break;
			if (!Stack.push(val))
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� ��: ");
		for (int i = 0; i < Stack.capacity(); i++)
			System.out.print(Stack.pop() + " ");
		s.close();
	}
}
