package rectClass;

// Data Class
public class Rect {
	// 1) Property
	public int x1, y1, x2, y2;	// public : Visibility(가시성)
	public int w, h;			// 초기화
	public int length, size;	// 둘레길이, 면적
	// 2) Method
	public void calcSize() {	// 둘레 계산과 면적 계산
		if(w == 0) {
			w = Math.abs(x2 - x1);	// Math 클래스는 수학함수 라이브러리 클래스. 정적클래스.
		}
		if(h == 0) {
			h = Math.abs(y2 - y1);
		}
		length = (w + h) * 2;
		size = w * h;
	}
	public void move(int dx, int dy) {
		x1 += dx; y1 += dy;
		x2 += dx; y2 += dy;
	}
	public void show() {
		System.out.println("좌표1 : ("+x1+","+y1+") 둘레 = "+ length +" 면적= "+size);
	}
}
