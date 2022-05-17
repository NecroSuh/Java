package lambda;

import java.util.ArrayList;
import java.util.function.Consumer; // 자바에서 제공하는 Functional Interface이다.

public class LambdaTest {

	private static void perform(String msg, MyInterface obj) {
		obj.sendMsg(msg);
	}

	public static void main(String[] args) {
		// 기본적인 구현 방법 : 인터페이스 --> 구현클래스-->객체생성-->메소드 호출
		MyClass obj = new MyClass(); // 구현클래스의 객체 생성
		obj.sendMsg("Hello");

		// 익명클래스 정의
		MyInterface obj2 = new MyInterface() {
			@Override
			public void sendMsg(String msg) {
				System.out.println("Annoymous class : " + msg);
			}
		}; // 문장이므로 반드시 ; 있어야 됨.
		obj2.sendMsg("Spring");

		// 익명클래스 정의. 람다식을 이용해서 정의
		MyInterface obj3 = (msg) -> {
			if (msg.equals("Summer"))
				System.out.println("Annoymous class with Lambda : Hot" + msg);
			else
				System.out.println("Annoymous class with Lambda : " + msg);
		};
		obj3.sendMsg("Summer");
		perform("Winter", obj3); // 람다식으로 정의된 익명클래스 객체를 매개변수로 전달

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
