package class04;

class Outer2 {
	class InstanceInner {
		int iv = 100;
	}

	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}

	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
}

public class Ex07_13 {

	public static void main(String[] args) {
		// �ν��Ͻ�Ŭ������ �ν��Ͻ��� �����Ϸ���
		// �ܺ� Ŭ������ �ν��Ͻ��� ���� �����ؾ� �Ѵ�.
		Outer2 oc = new Outer2();
		Outer2.InstanceInner ii = oc.new InstanceInner();

		System.out.println("ii.iv : " + ii.iv);
		System.out.println("Outer2.StaticInner.cv : " + Outer2.StaticInner.cv);

		// ������ ���� Ŭ������ �ν��Ͻ��� �ܺ� Ŭ������ ���� �������� �ʾƵ� �ȴ�.
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("si.iv : " + si.iv);
	}

}