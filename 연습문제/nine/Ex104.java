package nine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex104 extends JFrame {
	public Ex104() {
		setTitle("JTextField and JComponent");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JTextField textField = new JTextField(10);
		JComboBox<String> comboBox = new JComboBox<>();

		textField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				comboBox.addItem(textField.getText());
				textField.setText("");
			}
		});

		c.add(textField);
		c.add(comboBox);

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex104();
	}
}
