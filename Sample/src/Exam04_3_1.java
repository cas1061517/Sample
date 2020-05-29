import java.util.Scanner;

public class Exam04_3_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int month = scanner.nextInt();
		
		if (month <= 2) {
			System.out.println("겨울");
		}
		else if (month <= 5) {
			System.out.println("봄");
		}
		else if (month <= 8) {
			System.out.println("여름");
		}
		else if (month <= 11) {
			System.out.println("가을");
		}
		else {
			System.out.println("겨울");
			
		}
		
		
		
		
		
		/* 입력받은 month 가 3 ~ 5 이면 봄 출력 */ /* 입력받은 month 가 6 ~ 8 이면 여름 출력 */ /* 입력받은 month 가 9 ~ 11 이면 가을 출력 */ /*
																												 * 입력받은
																												 * month
																												 * 가 12
																												 * 또는 1
																												 * 또는 2
																												 * 이면 겨울
																												 * 출력
																												 */
		scanner.close();
	}
}