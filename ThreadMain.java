package counter;

public class ThreadMain {

	public static void main(String[] args) {
		Counter c1 = new Counter(11); // Runnable ���� ��ü
		Counter c2 = new Counter(51);
		// run() �޼ҵ带 ���� ȣ���ϸ� �Ϲ� �޼ҵ�� ����. ������� ���� �ȵ�.
		// c1.run();
		// c2.run();
		// c1.start();
		// c2.start();
		// Thread t1 = new Thread(c1); // Thread ��ü ����
		// Thread t2 = new Thread(c2);
		// t1.start();
		// t2.start();

		Runner rabbit = new Runner("Rabbit", 300);
		Runner turtle = new Runner("Turtle", 300);

		rabbit.start();
		turtle.start();
	}

}