package eight;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
class North extends JPanel {
	public North() {
		setBackground(Color.LIGHT_GRAY);
		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
	}
}

@SuppressWarnings("serial")
class Center extends JPanel {
	public Center() {
		setLayout(null);
		for (int i = 0; i < 20; i++) {
			int x = (int) (Math.random() * 250);
			int y = (int) (Math.random() * 250);
			JLabel label = new JLabel("*");
			label.setForeground(Color.RED);
			label.setLocation(x, y);
			label.setSize(20, 20);
			label.setOpaque(true);
			add(label);
		}
	}
}

@SuppressWarnings("serial")
class South extends JPanel {
	public South() {
		setBackground(Color.YELLOW);
		add(new JButton("Interger Input"));
		add(new TextField(15));
	}
}

@SuppressWarnings("serial")
public class Ex89 extends JFrame {
	public Ex89() {
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		North nPanel = new North();
		Center nCenter = new Center();
		South nSouth = new South();
		add(nPanel, BorderLayout.NORTH);
		add(nCenter, BorderLayout.CENTER);
		add(nSouth, BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex89();
	}
}
