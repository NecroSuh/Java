import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// throws IOExcpetion이 붙어있는데
		// 이것은 System.in.read()에 대한
		// 예외처리 코드이다.

		System.out.print("키코드 입력하고 엔터:");

		int keyCode;

		keyCode = System.in.read();
		/// 한글은 1바이트로 표현할 수 없기 때문에
		// 숫자와 영문 그리고 특수문자만 입력할 수 있다.
		System.out.println(keyCode);
		
		keyCode = System.in.read(); //엔터값처리
		System.out.println(keyCode);
		
		keyCode = System.in.read();
		System.out.println(keyCode);
	}

}
