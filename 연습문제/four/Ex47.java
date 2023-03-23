package four;

import java.util.Scanner;

abstract class Shape {
	private Shape next;

	public Shape() {
		next = null;
	}

	public void setNext(Shape obj) {
		next = obj;
	} // 링크 연결

	public Shape getNext() {
		return next;
	}

	public abstract void draw();
}

class Line extends Shape {
	public Line() {
	}

	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public Rect() {
	}

	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public Circle() {
	}

	public void draw() {
		System.out.println("Circle");
	}
}

class GraphicEditor {
	private Shape head, tail;
	private Scanner sc;

	public GraphicEditor() {
	}

	public void run() {
		sc = new Scanner(System.in);
		System.out.println("그래픽 에디터 beauty를 실행합니다.");
		while (true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
			int input = sc.nextInt();
			if (input == 1) {
				insert();
			} else if (input == 2) {
				System.out.print("삭제할 도형의 위치 >>");
				int dInput = sc.nextInt();
				delete(dInput);
			} else if (input == 3) {
				print();
			} else {
				System.out.println("beauty을 종료합니다.");
				break;
			}
		}

	}

	void insert() {
		Shape s;
		System.out.print("Line(1), Rect(2), Circle(3)>> ");
		int iInput = sc.nextInt();
		if (iInput == 1) {
			s = new Line();
		} else if (iInput == 2) {
			s = new Rect();
		} else {
			s = new Circle();
		}

		if (head == null) {
			head = s;
			tail = s;
		} else {
			tail.setNext(s);
			tail = s;
		}
	}

	public void delete(int num) {
		Shape cur = head; // 현재 노드
		Shape tmp = head;
		int i;
		if (num == 1) {
			if (head == tail) {
				head = null;
				tail = null;
				return;
			} else {
				head = head.getNext();
				return;
			}
		}
		for (i = 1; i < num; i++) {
			tmp = cur;
			cur = cur.getNext();
			if (cur == null) {
				System.out.println("삭제할 수 없습니다.");
				return;
			}
		}
		tmp.setNext(cur.getNext());
	}

	public void print() {
		Shape s = head;
		while (s != null) {
			s.draw();
			s = s.getNext();
		}
	}
}

public class Ex47 {
	public static void main(String[] args) {
		GraphicEditor g = new GraphicEditor();
		g.run();
	}
}
