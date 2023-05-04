package test4;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MouseListenerEx extends JFrame {
	public JLabel la = new JLabel("Hello");

	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());

		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);

		setSize(250, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
