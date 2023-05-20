package nine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex103 extends JFrame {
	public Ex103() {
		setTitle("CheckBox Pratice");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JCheckBox disable = new JCheckBox("버튼 비활성화");
		JCheckBox hide = new JCheckBox("버튼 감추기");
		JButton btn = new JButton("test Button");
		c.add(disable);
		c.add(hide);
		c.add(btn);
		disable.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					btn.setEnabled(false);
				else
					btn.setEnabled(true);
			}
		});
		hide.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					btn.setVisible(false);
				else
					btn.setVisible(true);
			}
		});
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex103();
	}
}
