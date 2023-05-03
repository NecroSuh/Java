package test4;

import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("¾×¼Ç");
		else
			b.setText("Action");
	}
}
