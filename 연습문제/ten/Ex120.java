package ten;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

@SuppressWarnings("serial")
public class Ex120 extends JFrame {
	private MyPanel panel = new MyPanel();
	private Vector<Circle> circle = new Vector<Circle>();

	public Ex120() {
		setTitle("���콺�� �� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(500, 300);
		setVisible(true);
	}

	class Circle {
		int x;
		int y;
		int d;

		public Circle(int xPosition, int yPosition, int diameter) {
			x = xPosition;
			y = yPosition;
			d = diameter;
		}
	}

	class MyMouseListener extends MouseAdapter {
		private int startX;
		private int startY;
		private int endX;
		private int endY;

		public void mousePressed(MouseEvent e) {
			Point startP = e.getPoint();
			startX = (int) startP.getX();
			startY = (int) startP.getY();
		}

		public void mouseReleased(MouseEvent e) {
			Point endP = e.getPoint();
			endX = (int) endP.getX();
			endY = (int) endP.getY();

			int disX = endX - startX;
			int disY = endY - startY;
			int radius = (int) Math.sqrt(disX * disX + disY * disY);
			Circle c = new Circle(startX - radius, startY - radius, 2 * radius);
			circle.add(c);
			repaint();
		}
	}

	class MyPanel extends JPanel {
		public MyPanel() {
			setFocusable(true);
			requestFocus();
			addMouseListener(new MyMouseListener());
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.MAGENTA);
			for (int i = 0; i < circle.size(); i++) {
				Circle c = circle.elementAt(i);
				g.drawOval(c.x, c.y, c.d, c.d);
			}
		}
	}

	public static void main(String[] args) {
		new Ex120();
	}
}
