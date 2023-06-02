package ten;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex115 extends JFrame {
	JLabel label = new JLabel();
	ImageIcon icon = new ImageIcon("C:\\Users\\LG\\Desktop\\images\\apple.jpg");

	public Ex115() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		label.setIcon(icon);
		label.setSize(icon.getIconWidth(), icon.getIconHeight());
		c.add(label);

		c.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				Component c = (Component) e.getSource();
				c.setLocation(e.getX(), e.getY());
			}
		});
		setVisible(true);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new Ex115();
	}
}
