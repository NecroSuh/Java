package test05;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class LabelEx extends JFrame {
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel textLabel = new JLabel("사랑합니다.");

		ImageIcon beauty = new ImageIcon("C:\\Users\\LG\\Desktop\\images\\beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);

		ImageIcon normalIcon = new ImageIcon("C:\\Users\\LG\\Desktop\\images\\phone.jpg");
		JLabel label = new JLabel("보고싶으면 전화하세요", normalIcon, SwingConstants.CENTER);

		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);

		setSize(400, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LabelEx();
	}
}
