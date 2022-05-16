package gbox;

import java.util.*;

//public class GBox<T extends Book>
public class GBox<T> { // T : Parameterized Type. Book과 Book 하위 자식 클래스 타입만 허용
	// private T[] space = new T[5];
	// ArrayList<T> space;
	private Object[] space; // Object 최상위 클래스 타입으로 배열 선언
	private int capacity; // 박스의 용량
	private int cnt; // 박스에 담긴 물건의 개수
	private static final int INIT = 5;

	private void sizeUp() {
		capacity *= 2;
		Object[] temp = new Object[capacity]; // 용량 두배의 배열 공간을 생성.
		for (int i = 0; i < cnt; i++)
			temp[i] = space[i];
		space = temp; // 원래 space 배열은 가리키는 참조가 사라짐. 힙 공간에 쓰레기가 됨. 자바가상머신에는 GC 있음.
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
		return (T) space[i]; // Object --> T 타입으로 변환
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
