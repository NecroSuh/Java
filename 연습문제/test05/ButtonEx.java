package test05;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon normalIcon = new ImageIcon("C:\\Users\\LG\\Desktop\\images\\1.jpg");
		ImageIcon rolloverIcon = new ImageIcon("C:\\Users\\LG\\Desktop\\images\\2.jpg");
		ImageIcon pressedIcon = new ImageIcon("C:\\Users\\LG\\Desktop\\images\\3.jpg");

		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);

		setSize(850, 850);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonEx();
	}
}
