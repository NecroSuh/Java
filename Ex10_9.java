package day02;

import java.util.*;
import java.text.*;

public class Ex10_9 {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

		try {
			Date d = df.parse("2019�� 11�� 23��");
			System.out.println(df2.format(d));
		} catch (Exception e) {
		}
	}
}
