package nine;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Ex109 extends JFrame {
	public Ex109() {
		JSlider slider = new JSlider(0, 100, 0);
		JLabel label = new JLabel("I Love Java");
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 1));
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);

		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider temp = (JSlider) e.getSource();
				label.setFont(new Font("Arial", Font.PLAIN, temp.getValue()));
			}
		});

		c.add(slider, BorderLayout.NORTH);
		c.add(label, BorderLayout.CENTER);

		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex109();
	}
}
