package eight;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Ex90 extends JFrame {
	Ex90() {
		setTitle("계산기 프레임");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		JPanel pNorth = new JPanel();
		JPanel pSorth = new JPanel();
		JPanel pCenter = new JPanel();

		pNorth.setBackground(Color.LIGHT_GRAY);
		pCenter.setLayout(new GridLayout(4, 4));
		pSorth.setBackground(Color.YELLOW);

		c.add(pCenter);
		c.add(pNorth, BorderLayout.NORTH);
		c.add(pSorth, BorderLayout.SOUTH);

		JLabel l1 = new JLabel("수식입력");
		JTextField tf1 = new JTextField(10);
		pNorth.add(l1);
		pNorth.add(tf1);

		JLabel l2 = new JLabel("계산결과");
		JTextField tf2 = new JTextField(10);
		pSorth.add(l2);
		pSorth.add(tf2);

		for (int i = 0; i < 16; i++) {
			JButton b = new JButton();
			String[] str = { "CE", "Enter", "+", "-", "X", "/" };
			pCenter.add(b);
			if (i < 10)
				b.setText(i + "");
			else
				b.setText(str[i - 10]);
			if (i > 11)
				b.setOpaque(true);
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex90();
	}
}
