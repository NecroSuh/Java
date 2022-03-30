package javaarray2;

import java.util.*;

public class JavaArray2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		// 자바 다차원 배열 : 2차원, 3차원, 4차원
		/*
		 * int[][] a = new int[2][3]; // 2행 3열 2차원 배열 a={{1,2,3} , {4,5,6 } } int[][][]
		 * b = new int[2][3][5]; // 큐브 형태 3차원 배열 b={{{1,2,3,4,5} , {} , {}} , {{} ,{} ,
		 * {}}} int[][][][] c = new int[2][3][5][4];
		 * 
		 * int x = a[0][0] + a[1][1];
		 * 
		 * for (int i = 0; i < 2; i++) // 행을 순환 for (int j = 0; j < 3; j++) a[i][j] = j
		 * + 1; // 하나의 행에서의 열을 순환 for (int[] e : a) // a의 원소를 e로 받는 것. for (int d : e)
		 * System.out.println(d);
		 * 
		 * // 가변길이배열 - Collection classes ArrayList<Integer> list = new
		 * ArrayList<Integer>(); // 가변배열. 원소 종류를 지정. 정수 가변배열. Integer p = new
		 * Integer(5); // 정수 데이터를 처리하는 기능들을 가지는 클래스. p는 Integer 객체 변수(주소 저장) int q = 5;
		 * // q는 정수 변수. int는 기본자료형 Double dou = 6.7; // Wrapper class. Byte, Short,
		 * Float, Character Integer p2 = 8; // autoboxing q += p; // auto-unboxing
		 * 
		 * list.add(4); list.add(5); list.add(6); System.out.println("Size= " +
		 * list.size()); for (int i = 0; i < list.size(); i++)
		 * System.out.println(list.get(i)); list.remove(1); for (int e : list)
		 * System.out.println(e);
		 */

		// 예제. 영어 소문자 문자열을 입력받고 알파벳 갯수를 출력하는 것
		// 예) 문자열 : abcabcabc
		// a : 3
		// b : 3
		// c : 3
		/*
		 * char ch = 'a'; System.out.println('c' - ch); char ch2 = (char) (ch + 3);
		 * System.out.println(ch2);
		 * 
		 * String str; System.out.print("문자열 : "); str = scan.nextLine();
		 * 
		 * for (int i = 1; i <= 26; i++) { // a ~ z int cnt = 0; // 알파벳 글자가 문자열에서 몇 개
		 * 있는지 카운트 하기 for (int j = 0; j < str.length(); j++) { if (ch == str.charAt(j))
		 * cnt++; } if (cnt > 0) System.out.println(ch + ":" + cnt); ch = (char) ('a' +
		 * i); // b c d e f g }
		 */
		// 배열을 이용해서 하는 방법
		int[][] count = new int[3][26]; // a~z 까지의 각 알파벳의 갯수를 저장하는 배열
		for (int k = 0; k < 3; k++) {
			String str;
			System.out.print("문자열 : ");
			str = scan.nextLine();
			for (int i = 0; i < str.length(); i++) {
				// System.out.println(str.charAt(i) - 'a');
				count[k][str.charAt(i) - 'a']++;
			}
			// for (int e : count)
			// System.out.println(e);
			for (int i = 0; i < count[k].length; i++) {
				char ch3 = (char) ('a' + i);
				if (count[k][i] > 0)
					System.out.println(ch3 + ":" + count[k][i]);
			}
		}
	}
}
