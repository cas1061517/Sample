public class Exam03_4 {
	public static void main(String[] args) {
		int num = 12345;
		int total = 0;
		
		for(int i = 1; i <= 3; i++) {
		total = total + (num % 10); //5
		num = num / 10; 
		}
		

		// Shift Ctrl c
		//		total = total + (num % 10); 
//		num = num / 10; 
//		
//		total = total + (num % 10);
//		num = num / 10;
//		
//		total = total + (num % 10);
//		num = num / 10;
//		
//		total = total + (num % 10);
//		num = num / 10;
		
		
	
		/* �ڵ� �ۼ� */
		System.out.println("�� �ڸ� ������ �� : " + total);	
	}
}