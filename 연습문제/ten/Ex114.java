package ten;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

@SuppressWarnings("serial")
public class Ex114 extends JFrame {
	private MyPanel panel = new MyPanel();

	public Ex114() {
		setTitle("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setLayout(new FlowLayout());
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon image = new ImageIcon("C:\\Users\\LG\\Desktop\\images\\image.jpg");
		private Image img = image.getImage();
		int x = 100, y = 100;

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(x, y, 20, 20);

			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}

	}

	public static void main(String[] args) {
		new Ex114();
	}
}
