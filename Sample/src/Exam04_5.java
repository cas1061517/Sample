public class Exam04_5 {
	public static void main(String[] args) {
		
		boolean isContinue = true;
		int count = 0;
		while (isContinue) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);
			
			System.out.printf("(%s, %s)", num1, num2);
			System.out.println();
			count = count + 1;
			
			
			
			if(num1 + num2 == 10) {
				isContinue = false;
			}
	
		}
		System.out.println("�ֻ����� ���� Ƚ�� : " + count);
	}
}
