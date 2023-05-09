package nine;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Ex98 extends JFrame {
	Ex98() {
		setTitle("µå·¡±ëµ¿¾È Yellow");
		setDefaultCloseOperation(3);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.GREEN);
		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Container temp = (Container) e.getSource();
				temp.setBackground(Color.YELLOW);
			}

			public void mouseReleased(MouseEvent e) {
				Container temp = (Container) e.getSource();
				temp.setBackground(Color.GREEN);
			}
		});
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex98();
	}
}
