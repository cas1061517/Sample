import java.util.Scanner;

public class Exam04_3_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int month = scanner.nextInt();
		
		if (month <= 2) {
			System.out.println("�ܿ�");
		}
		else if (month <= 5) {
			System.out.println("��");
		}
		else if (month <= 8) {
			System.out.println("����");
		}
		else if (month <= 11) {
			System.out.println("����");
		}
		else {
			System.out.println("�ܿ�");
			
		}
		
		
		
		
		
		/* �Է¹��� month �� 3 ~ 5 �̸� �� ��� */ /* �Է¹��� month �� 6 ~ 8 �̸� ���� ��� */ /* �Է¹��� month �� 9 ~ 11 �̸� ���� ��� */ /*
																												 * �Է¹���
																												 * month
																												 * �� 12
																												 * �Ǵ� 1
																												 * �Ǵ� 2
																												 * �̸� �ܿ�
																												 * ���
																												 */
		scanner.close();
	}
}