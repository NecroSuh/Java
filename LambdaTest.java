package lambda;

import java.util.ArrayList;
import java.util.function.Consumer; // �ڹٿ��� �����ϴ� Functional Interface�̴�.

public class LambdaTest {

	private static void perform(String msg, MyInterface obj) {
		obj.sendMsg(msg);
	}

	public static void main(String[] args) {
		// �⺻���� ���� ��� : �������̽� --> ����Ŭ����-->��ü����-->�޼ҵ� ȣ��
		MyClass obj = new MyClass(); // ����Ŭ������ ��ü ����
		obj.sendMsg("Hello");

		// �͸�Ŭ���� ����
		MyInterface obj2 = new MyInterface() {
			@Override
			public void sendMsg(String msg) {
				System.out.println("Annoymous class : " + msg);
			}
		}; // �����̹Ƿ� �ݵ�� ; �־�� ��.
		obj2.sendMsg("Spring");

		// �͸�Ŭ���� ����. ���ٽ��� �̿��ؼ� ����
		MyInterface obj3 = (msg) -> {
			if (msg.equals("Summer"))
				System.out.println("Annoymous class with Lambda : Hot" + msg);
			else
				System.out.println("Annoymous class with Lambda : " + msg);
		};
		obj3.sendMsg("Summer");
		perform("Winter", obj3); // ���ٽ����� ���ǵ� �͸�Ŭ���� ��ü�� �Ű������� ����

		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(5);
		data.add(9);
		data.add(11);
		data.add(3);
		Consumer<Integer> obj4 = (a) -> {
			a++;
			System.out.println(a);
		};
		data.forEach(obj4);	//obj4.accept(data.get(i));
	}
}
