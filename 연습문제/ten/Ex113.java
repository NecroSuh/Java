package ten;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Ex113 extends JFrame {
	private MyPanel panel = new MyPanel();
	private JButton btn = new JButton("Hide/Show");
	private ImageIcon icon = new ImageIcon("C:\\Users\\LG\\Desktop\\images\\image.jpg");
	private Image image = icon.getImage();

	int cnt = 0;

	public Ex113() {
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		add(btn);

		btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cnt++;
				if (cnt % 2 == 1) {
					image = null;
					repaint();
				} else {
					image = icon.getImage();
					repaint();
				}
			}
		});

		setLayout(new FlowLayout());
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}

	public static void main(String[] args) {
		new Ex113();
	}
}
