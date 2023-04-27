package test4;

import javax.swing.*;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300X300 스윙 프레임 만들기");
		setSize(300, 300);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}

}
