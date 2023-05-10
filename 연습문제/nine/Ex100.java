package nine;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Ex100 extends JFrame {
	Ex100() {
		setTitle("클릭 연습용 프로그램");
		setDefaultCloseOperation(3);
		Container c = getContentPane();
		c.setLayout(null);
		JLabel label = new JLabel("c");
		label.setSize(10, 10);
		label.setLocation(100, 100);
		label.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int x = (int) (Math.random() * 400);
				int y = (int) (Math.random() * 500);
				label.setLocation(x, y);
			}
		});
		c.add(label);
		setSize(500, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex100();
	}
}
