package nine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex112 extends JFrame {
	int count = 0;

	public Ex112() {
		setTitle("Ten 레이블 클릭");
		setDefaultCloseOperation(3);
		JLabel[] labels = new JLabel[10];
		JPanel panel = new JPanel();

		panel.setLayout(null);

		for (int i = 0; i < labels.length; i++) {
			int x = (int) (Math.random() * 300);
			int y = (int) (Math.random() * 300);
			labels[i] = new JLabel();
			labels[i].setText(Integer.toString(i));
			labels[i].setSize(15, 15);
			labels[i].setLocation(x, y);
			labels[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					super.mouseClicked(e);
					JLabel temp = new JLabel();
					temp = (JLabel) e.getSource();
					if (Integer.parseInt(temp.getText()) <= Integer.parseInt(labels[count].getText())) {
						temp.setVisible(false);
						count++;
						if (Integer.parseInt(temp.getText()) == 9) {
							for (int i = 0; i < labels.length; i++) {
								int x = (int) (Math.random() * 300);
								int y = (int) (Math.random() * 300);
								labels[i].setLocation(x, y);
								labels[i].setVisible(true);
							}
						}
					}
				}
			});
			labels[i].setForeground(Color.MAGENTA);
			panel.add(labels[i]);
		}
		this.add(panel);

		setSize(350, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex112();
	}
}
