package test4;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);

		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new IndepClassListener();
	}
}
