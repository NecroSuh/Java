package eight;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Ex87 extends JFrame {
	Ex87() {
		setTitle("4X4 Color Frame");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));

		for (int i = 0; i < 16; i++) {
			Color[] col = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
					Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
					Color.CYAN, Color.BLUE };
			JLabel label = new JLabel(i + "");
			label.setBackground(col[i]);
			label.setOpaque(true);
			c.add(label);
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex87();
	}
}
