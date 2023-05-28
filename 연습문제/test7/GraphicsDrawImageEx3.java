package test7;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class GraphicsDrawImageEx3 extends JFrame {
	private MyPanel panel = new MyPanel();

	public GraphicsDrawImageEx3() {
		setTitle("�̹��� �Ϻκ��� ũ�� �����ϱ� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);

		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("C:\\Users\\LG\\Desktop\\images\\image.jpg");
		private Image img = icon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.drawImage(img, 20, 20, 250, 100, 100, 50, 200, 200, this);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawImageEx3();
	}

}
