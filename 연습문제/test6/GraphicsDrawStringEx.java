package test6;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class GraphicsDrawStringEx extends JFrame {
	private MyPanel panel = new MyPanel();

	public GraphicsDrawStringEx() {
		setTitle("drawString ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);

		setSize(250, 200);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("�ڹٴ� ��մ�.~~", 30, 30);
			g.drawString("�󸶳�?", 60, 60);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawStringEx();
	}
}
