package counter;

public class ThreadMain {

	public static void main(String[] args) {
		Counter c1 = new Counter(11); // Runnable 구현 객체
		Counter c2 = new Counter(51);
		// run() 메소드를 직접 호출하면 일반 메소드로 동작. 쓰레드로 동작 안됨.
		// c1.run();
		// c2.run();
		// c1.start();
		// c2.start();
		// Thread t1 = new Thread(c1); // Thread 객체 생성
		// Thread t2 = new Thread(c2);
		// t1.start();
		// t2.start();

		Runner rabbit = new Runner("Rabbit", 300);
		Runner turtle = new Runner("Turtle", 300);

		rabbit.start();
		turtle.start();
	}

}