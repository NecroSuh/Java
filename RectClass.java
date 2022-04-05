package rectClass;

// Main Class
public class RectClass {

	public static void main(String[] args) {
		Rect r1 = new Rect(); // 객체 생성. r1은 Rect 객체를 가리키는 객체참조변수
		r1.x1 = 2;
		r1.y1 = 2;
		r1.x2 = 7;
		r1.y2 = -8;
		r1.calcSize();	// r1객체에게 calcSize() 기능을 수행하라고 요청하는 것.
		r1.show();
		
		Rect r2 = new Rect();	//r2도 Rect 객체참조변수
		r2.x1 = 1;
		r2.y1 = 4;
		r2.x2 = 3;
		r2.y2 = -2;
		r2.calcSize();	// r1객체에게 calcSize() 기능을 수행하라고 요청하는 것.
		r2.show();
		
		Rect r3;	// Rect는 클래스 타입. 추상자료형 . 객체를 생성하는 형태를 정의.
		r3 = r1;	// 객체의 데이터가 복사되는게 아님. 객체의 주소가 복사. r1과 r3는 같은 객체를 가리킴.
		
		if(r1 instanceof Rect)
			System.out.println("r1은 Rect 클래스의 객체이다.");
		else
			System.out.println("r1은 Rect 클래스의 객체가 아니다.");

	}

}
