package ten;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Ex117 extends JFrame {
	private MyPanel panel = new MyPanel();

	public Ex117() {
		setTitle("���� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		@SuppressWarnings("unused")
		private int gridWidth = this.getWidth() / 10;
		@SuppressWarnings("unused")
		private int gridHeight = this.getHeight() / 10;

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (int i = 1; i < 10; i++) {
				g.drawLine(0, (this.getHeight() / 10) * i, this.getWidth(), (this.getHeight() / 10) * i);
				g.drawLine((this.getWidth() / 10) * i, 0, (this.getWidth() / 10) * i, this.getHeight());
			}
		}
	}

	public static void main(String[] args) {
		new Ex117();
	}
}
