package test6;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class GraphicsDrawLineEx extends JFrame {
	private MyPanel panel = new MyPanel();

	public GraphicsDrawLineEx() {
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);

		setSize(200, 170);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(20, 20, 100, 100);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawLineEx();
	}
}
