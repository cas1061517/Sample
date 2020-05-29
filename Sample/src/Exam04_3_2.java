import java.util.Scanner;

public class Exam04_3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		
		if (a <= b && a >= c) {
			System.out.println("중간 값은 " + a);
		}
		else if (a <= c && a >= b) {
			System.out.println("중간 값은 " + a);
		}
		else if (b <= c && b >= a) {
 			System.out.println("중간 값은 " + b);
		}
		else if (b <= a && b >= c) {
			System.out.println("중간 값은 " + b);
		}	
		else if (c <= a && c >= b) {
			System.out.println("중간 값은 " + c);
		}	
		else if (c <= b && c >= b) {
			System.out.println("중간 값은 " + c);
		}	
	}
}
