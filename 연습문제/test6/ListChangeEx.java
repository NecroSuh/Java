package test6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

@SuppressWarnings("serial")
public class ListChangeEx extends JFrame {
	private JTextField tf = new JTextField(10);
	private Vector<String> v = new Vector<String>();
	private JList<String> nameList = new JList<String>(v);

	public ListChangeEx() {
		setTitle("����Ʈ ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("�̸� �Է� �� <Enter> Ű"));
		c.add(tf);

		v.add("Ȳ����");
		v.add("���繮");
		nameList.setVisibleRowCount(5);
		nameList.setFixedCellWidth(100);
		c.add(new JScrollPane(nameList));

		setSize(300, 300);
		setVisible(true);

		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				v.add(t.getText());
				t.setText("");
				nameList.setListData(v);
			}
		});
	}

	public static void main(String[] args) {
		new ListChangeEx();
	}
}
