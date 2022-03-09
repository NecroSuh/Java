import java.util.Scanner;

//Scanner라는 클래스는 java.util 패키지 안에 있는데
//이것을 가져와서 이 프로그램이서 사용하겠다. 라는 뜻.
//import 할 때는 ctrl+shift+영문자+o

public class EX02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("문자열을 입력:");

		String str = scan.next();
		// 문자열:next()
		// 공백전까지 문자열을 읽어온다.

		System.out.println(str);

		System.out.print("정수를 입력");
		int a = scan.nextInt();
		// 정수:nextInt()
		// 공백전까지 정수를 읽어온다.
		System.out.println(a);

		System.out.print("실수를 입력");
		double b = scan.nextDouble();
		// 실수: nextFloat() //nextDouble();
		// 공백전까지 실수를 읽어온다.

		System.out.println(b);
		
		scan.nextLine();
		System.out.print("문자열을 입력:");
		String str2 = scan.nextLine();
		// 문자열:nextLine()
		// 라인전체(공백포함) 데이터를 읽어온다.
		// 주의:next()나 nextInt() 등을 쓰고 nextLine()을 쓸 경우
		// 남아있는 엔터를 처리하기 떄문에 남아있는 엔터를 처리해주어야 한다.
		
		System.out.println(str2);
		
		scan.close();
		//입출력 사용시에는 연결을 맺고 끊음을 확실히 해줘야 한다.
		

	}

}
