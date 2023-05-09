package nine;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Ex99 extends JFrame {
	Ex99() {
		setTitle("Left 키로 문자열 교체");
		setDefaultCloseOperation(3);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("Love Java");
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					String text = label.getText();
					if (text.equals("Love Java"))
						label.setText("avaJ evoL");
					else
						label.setText("Love Java");
				}
			}
		});
		c.add(label);
		c.setFocusable(true);
		c.requestFocus();
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex99();
	}
}
