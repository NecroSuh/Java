package test4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener1());
		c.add(btn);

		setSize(350, 150);
		setVisible(true);
	}
	private class MyActionListener1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if (b.getText().equals("Action"))
				b.setText("�׼�");
			else
				b.setText("Action");

			InnerClassListener.this.setTitle(b.getText());
		}
	}

	public static void main(String[] args) {
		new InnerClassListener();
	}
}
