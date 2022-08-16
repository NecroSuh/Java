package day04;

import java.util.*;

public class Ex11_8 {
	public static void main(String[] args) {
		Integer[] arr= {30,50,10,40,20};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// sort(Object[] objArr, Comparator c)
		Arrays.sort(arr, new DescComp());	// DescComp�� ������ ���� �������� ����
		System.out.println(Arrays.toString(arr));
	}
}

class DescComp implements Comparator {
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer && o2 instanceof Integer))
			return -1;	// Integer�� �ƴϸ�, ������ �ʰ� -1 ��ȯ
		
		Integer i = (Integer)o1;
		Integer i2 = (Integer)o2;
		// return i2 -i; �Ǵ� return i2.compareTo(i);�� ����
		return i.compareTo(i2) * -1;	// �⺻ ������ compareTo()�� �������� ����
	}
}
