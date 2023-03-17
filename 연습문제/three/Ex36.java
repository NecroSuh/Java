package three;

import java.util.Scanner;

class Add {
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a + b;
	}
}

class Sub {
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a - b;
	}
}

class Mul {
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a * b;
	}
}

class Div {
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a / b;
	}
}

public class Ex36 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int a = in.nextInt();
		int b = in.nextInt();
		char c = in.next().charAt(0);
		switch (c) {
		case '+':
			Add adds = new Add();
			adds.setValue(a, b);
			System.out.println(adds.calculate());
			break;
		case '-':
			Sub subs = new Sub();
			subs.setValue(a, b);
			System.out.println(subs.calculate());
			break;
		case '*':
			Mul muls = new Mul();
			muls.setValue(a, b);
			System.out.println(muls.calculate());
			break;
		case '/':
			Div divs = new Div();
			divs.setValue(a, b);
			System.out.println(divs.calculate());
			break;
		default:
			break;
		}
		in.close();
	}
}
