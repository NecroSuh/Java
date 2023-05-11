package nine;

import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class Ex102 extends JFrame {
	int size = 10;

	Ex102() {
		setTitle("마우스 휠을 굴려 폰트 크기 조절");
		setDefaultCloseOperation(3);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("Love Java");
		label.setFont(new Font("Arial", Font.PLAIN, size));
		label.addMouseWheelListener(new MouseWheelListener() {

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				if (n < 0) {
					if (size - 5 > 0) {
						size -= 5;
						label.setFont(new Font("Arial", Font.PLAIN, size));
					}
				} else {
					size += 5;
					label.setFont(new Font("Arial", Font.PLAIN, size + 5));
				}
			}
		});
		c.add(label);
		setSize(500, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex102();
	}
}
