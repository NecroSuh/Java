import java.util.Scanner;
import java.util.Random;

public class JavaArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		// 자바 배열 : 개념, 배열 선언, 생성, 배열 원소 접근, 배열탐색
		// 배열(Array) : 자료구조, 동일한 탕비의 원소들이 연속공간에 저장되는 구조
		// C/C++ 배열
		// int a[5]; // 선언에 배열의 길이가 주어져야 험. 선언만 하는 것이 아니고 배열 생성.

		// 배열의 종류 : 고정길이배열 vs 가변길이배열
		// 정적배열(static array) : 컴파일 시에 배열에 대한 모든 정보를 파악. 함수가 실행될 때 메모리 할당. 스택 영역에 생성
		// 동적배열(dynamic array) : 컴파일 시에 배열인 것만 안다. 길이가 얼마인지 모름. 실행중에 메모리 할당. 힙 영역에 생성
		// int *p;
		// p= new int[m]; // malloc()

		// Java
		/*
		 * int[] a; // 배열변수 선언. int a[]; a = new int[5]; // 배열 생성. 메모리 할당. int[] b = new
		 * int[8]; // 선언과 생성
		 * 
		 * int n = scan.nextInt(); int[] c = new int[n];
		 * 
		 * // 초기화 // int[] d = { 1, 2, 3, 4, 5 }; int[] d = new int[] { 1, 2, 3, 4, 5 };
		 * 
		 * int x = d[0] + d[1] + d[2]; d[3] = 9; // d 변수에는 배열의 시작주소(base
		 * address)+offset. 310 + (4*3)=322
		 * 
		 * int[] d2 = d; // 복사되는 것은 배열의 시작주소. // 배열 순환탐색 for (int i = 0; i < b.length;
		 * i++) { b[i] = i + 1; } for (int e : b) { // foreach 구문 System.out.print(e +
		 * ", "); }
		 */
		// 예제1. 원의 반지름을 5~20 사이 임의의 값으로 10개 생성하고 배열에 저장.
		// 반지름 => 면적 출력.
		final int COUNT = 10; // 기호상수
		final double PHI = 3.14516;
		int[] rad = new int[COUNT];
		for (int i = 0; i < rad.length; i++) {
			rad[i] = r.nextInt(16) + 5;
			float size = rad[i] * rad[i] * (float) PHI;
			System.out.println(rad[i] + "=>" + size);
		}
		// 예제2 배열의 합집합
		int[] x = { 1, 3, 5, 6, 9 };
		int[] y = { 7, 4, 3, 9, 11 };
		int[] z = new int[10];
		// 배열 복사
		for (int i = 0; i < x.length; i++) {
			z[i] = x[i];
		}
		int k = x.length;
		for (int i = 0; i < y.length; i++) {
			// y[i] 값이 x 배열이 있는지 체크
			boolean found = false;
			for (int j = 0; j < x.length; j++) {
				if (y[i] == x[j])
					found = true;
				break;
			}
			if (!found)
				z[k++] = y[i];
		}
		for (int e : z)
			if (e > 0)
				System.out.print(e + ", ");
		System.out.println();
	}
}
