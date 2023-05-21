package nine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex106 extends JFrame {
	public Ex106() {
		JTextField textField = new JTextField(10);
		JTextField result[] = new JTextField[8];
		JButton btn = new JButton("계산");
		JLabel money[] = new JLabel[8];
		JCheckBox check[] = new JCheckBox[7];
		String[] str = { "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원" };
		int[] won = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		setTitle("Money Charger");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel mPanel = new JPanel();
		mPanel.setLayout(new FlowLayout());
		mPanel.add(new JLabel("금액"));
		mPanel.add(textField);
		mPanel.add(btn);
		mPanel.setBackground(Color.pink);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int total = Integer.parseInt(textField.getText());
				for (int i = 0; i < 8; i++) {
					if (i == 7) {
						result[i].setText(Integer.toString(total));
						return;
					}
					if (check[i].isSelected()) {
						result[i].setText(Integer.toString(total / won[i]));
						total %= won[i];
					} else {
						result[i].setText("0");
					}
				}
			}
		});

		JPanel sPanel = new JPanel();
		sPanel.setLayout(new GridLayout(8, 2));
		sPanel.setBackground(Color.PINK);
		for (int i = 0; i < 8; i++) {
			money[i] = new JLabel(str[i]);
			result[i] = new JTextField();
			sPanel.add(money[i]);
			sPanel.add(result[i]);
			if (i < 7) {
				check[i] = new JCheckBox();
				check[i].setBackground(Color.PINK);
				sPanel.add(check[i]);
			}
		}

		setSize(300, 400);
		c.add(sPanel, BorderLayout.CENTER);
		c.add(mPanel, BorderLayout.NORTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex106();
	}
}
