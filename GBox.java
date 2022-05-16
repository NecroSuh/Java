package gbox;

import java.util.*;

//public class GBox<T extends Book>
public class GBox<T> { // T : Parameterized Type. Book�� Book ���� �ڽ� Ŭ���� Ÿ�Ը� ���
	// private T[] space = new T[5];
	// ArrayList<T> space;
	private Object[] space; // Object �ֻ��� Ŭ���� Ÿ������ �迭 ����
	private int capacity; // �ڽ��� �뷮
	private int cnt; // �ڽ��� ��� ������ ����
	private static final int INIT = 5;

	private void sizeUp() {
		capacity *= 2;
		Object[] temp = new Object[capacity]; // �뷮 �ι��� �迭 ������ ����.
		for (int i = 0; i < cnt; i++)
			temp[i] = space[i];
		space = temp; // ���� space �迭�� ����Ű�� ������ �����. �� ������ �����Ⱑ ��. �ڹٰ���ӽſ��� GC ����.
	}

	public GBox() {
		space = new Object[INIT];
		capacity = INIT;
		cnt = 0;
	}

	public GBox(int s) {
		space = new Object[s];
		capacity = s;
		cnt = 0;
	}

	public void add(T i) {
		if (cnt == capacity)
			sizeUp();
		space[cnt++] = i;
	}

	public T get(int i) {
		return (T) space[i]; // Object --> T Ÿ������ ��ȯ
	}

	public void showAll() {
		for (int i = 0; i < cnt; i++)
			System.out.println(space[i]);
	}

	public void remove(int i) {
		if (i < cnt) {
			cnt--;
			for (int k = 0; k < cnt; k++)
				space[k] = space[k + 1];
		}
	}

	public int size() {
		return cnt;
	}
}
