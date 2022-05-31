package counter;

//public class Counter extends Thread {	//Thread Ŭ���� ���
public class Counter implements Runnable {
	private int counter;

	public Counter(int counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		// ������� ó���� �ڵ尡 ���⿡ ���
		int n = 1;
		while (n < 20) {
			System.out.println(counter + n++);
			try {
				Thread.sleep(500); // 0.5�� ���� ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
