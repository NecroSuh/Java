package nine;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Ex97 extends JFrame {
	Ex97() {
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(3);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("Love Java");
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				JLabel temp = (JLabel) e.getSource();
				temp.setText("사랑해");
			}

			public void mouseExited(MouseEvent e) {
				JLabel temp = (JLabel) e.getSource();
				temp.setText("Love Java");
			}
		});
		c.add(label);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex97();
	}
}
