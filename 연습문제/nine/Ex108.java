package nine;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class Ex108 extends JFrame {
	public Ex108() {
		JSlider slider = new JSlider(0, 100, 0);

		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 1));

		JTextArea textArea = new JTextArea();
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);

		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider temp = (JSlider) e.getSource();
				String text = textArea.getText();
				if (text.length() <= temp.getValue())
					slider.setValue(text.length());
				else
					textArea.setText(text.substring(0, temp.getValue()));
			}
		});
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				JTextArea temp = (JTextArea) e.getSource();
				String text = temp.getText();
				if (text.length() <= 100)
					slider.setValue(text.length());
				else {
					text = text.substring(0, 99);
					textArea.setText(text);
				}
			}
		});

		c.add(textArea);
		c.add(slider);

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex108();
	}
}
