package counter;

//public class Counter extends Thread {	//Thread 클래스 상속
public class Counter implements Runnable {
	private int counter;

	public Counter(int counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		// 쓰레드로 처리할 코드가 여기에 기술
		int n = 1;
		while (n < 20) {
			System.out.println(counter + n++);
			try {
				Thread.sleep(500); // 0.5초 실행 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
