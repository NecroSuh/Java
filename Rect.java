package rectClass;

// Data Class
public class Rect {
	// 1) Property
	public int x1, y1, x2, y2;	// public : Visibility(���ü�)
	public int w, h;			// �ʱ�ȭ
	public int length, size;	// �ѷ�����, ����
	// 2) Method
	public void calcSize() {	// �ѷ� ���� ���� ���
		if(w == 0) {
			w = Math.abs(x2 - x1);	// Math Ŭ������ �����Լ� ���̺귯�� Ŭ����. ����Ŭ����.
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
		System.out.println("��ǥ1 : ("+x1+","+y1+") �ѷ� = "+ length +" ����= "+size);
	}
}
