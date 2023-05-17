package test6;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ListEx extends JFrame {
	private String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry",
			"blackberry" };
	private ImageIcon[] images = { new ImageIcon("C:\\Users\\LG\\Desktop\\images\\icon1.png"),
			new ImageIcon("C:\\Users\\LG\\Desktop\\images\\icon2.png"),
			new ImageIcon("C:\\Users\\LG\\Desktop\\images\\icon3.png"),
			new ImageIcon("C:\\Users\\LG\\Desktop\\images\\icon4.png") };

	public ListEx() {
		setTitle("����Ʈ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JList<String> strList = new JList<String>(fruits);
		c.add(strList);

		JList<ImageIcon> imageList = new JList<ImageIcon>();
		imageList.setListData(images);
		c.add(imageList);

		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListEx();
	}

}
