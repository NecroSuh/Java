package input;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//Scanner를 이용해서 이름 나이 키 몸무게를 입력받아 출력해보세요.
		Scanner scan=new Scanner(System.in);
		
		System.out.print("이름을 적으시오:");
		String name=scan.next();
		System.out.println(name);
		
		System.out.print("나이를 입력하시오:");
		int age=scan.nextInt();
		System.out.println(age);
		
		System.out.print("키를 입력하시오:");
		double height=scan.nextDouble();
		System.out.println(height);
		
		System.out.print("몸무게를 입력하시오:");
		float weight=scan.nextFloat();
		System.out.println(weight);
		
		scan.close();
	}

}
