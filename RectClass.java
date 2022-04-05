package rectClass;

// Main Class
public class RectClass {

	public static void main(String[] args) {
		Rect r1 = new Rect(); // ��ü ����. r1�� Rect ��ü�� ����Ű�� ��ü��������
		r1.x1 = 2;
		r1.y1 = 2;
		r1.x2 = 7;
		r1.y2 = -8;
		r1.calcSize();	// r1��ü���� calcSize() ����� �����϶�� ��û�ϴ� ��.
		r1.show();
		
		Rect r2 = new Rect();	//r2�� Rect ��ü��������
		r2.x1 = 1;
		r2.y1 = 4;
		r2.x2 = 3;
		r2.y2 = -2;
		r2.calcSize();	// r1��ü���� calcSize() ����� �����϶�� ��û�ϴ� ��.
		r2.show();
		
		Rect r3;	// Rect�� Ŭ���� Ÿ��. �߻��ڷ��� . ��ü�� �����ϴ� ���¸� ����.
		r3 = r1;	// ��ü�� �����Ͱ� ����Ǵ°� �ƴ�. ��ü�� �ּҰ� ����. r1�� r3�� ���� ��ü�� ����Ŵ.
		
		if(r1 instanceof Rect)
			System.out.println("r1�� Rect Ŭ������ ��ü�̴�.");
		else
			System.out.println("r1�� Rect Ŭ������ ��ü�� �ƴϴ�.");

	}

}
