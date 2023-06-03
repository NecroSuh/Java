package ten;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Ex118 extends JFrame {
	private MyPanel panel = new MyPanel();

	public Ex118() {
		setTitle("그래픽 다각형 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		@SuppressWarnings("unused")
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int w = this.getWidth();
			int h = this.getHeight();
			int[] x = { w / 2, 0, w / 2, w };
			int[] y = { 0, h / 2, h, h / 2 };
			int xSpace = (int) this.getWidth() / 30;
			int ySpace = (int) this.getHeight() / 30;
			g.drawPolygon(x, y, 4);
			for (int i = 1; i < 10; i++) {
				y[0] += ySpace;
				x[1] += ySpace;
				y[2] -= ySpace;
				x[3] -= ySpace;
				g.drawPolygon(x, y, 4);
			}
		}
	}

	public static void main(String[] args) {
		new Ex118();
	}
}
