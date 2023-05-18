package test6;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ComboActionEx extends JFrame {
	private String[] fruits = { "apple", "cherry", "pear", "beauty" };

	private ImageIcon[] images = { new ImageIcon("C:\\Users\\LG\\Desktop\\images\\apple.jpg"),
			new ImageIcon("C:\\Users\\LG\\Desktop\\images\\cherry.jpg"),
			new ImageIcon("C:\\Users\\LG\\Desktop\\images\\pear.jpg"),
			new ImageIcon("C:\\Users\\LG\\Desktop\\images\\beauty.jpg") };
	private JLabel imgLabel = new JLabel(images[0]);
	private JComboBox<String> strCombo = new JComboBox<String>(fruits);

	public ComboActionEx() {
		setTitle("콤보박스 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);

		strCombo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unchecked")
				JComboBox<String> cb = (JComboBox<String>) e.getSource();
				int index = cb.getSelectedIndex();

				imgLabel.setIcon(images[index]);
			}
		});
		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboActionEx();
	}

}
