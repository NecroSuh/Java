import java.util.Scanner;

public class Converter {
	// 초 입력받고 시분초로 변환하여 출력하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sec, min, hour;

		System.out.print("초를 입력 : ");
		sec = scan.nextInt();
		hour = sec / 3600;
		// sec = sec - hour * 3600;
		sec -= (hour * 3600);
		min = sec / 60;
		sec -= (min * 60);
		System.out.println(hour + "시간 " + min + "분 " + sec + "초");
		scan.close();
	}

}
