public class Exam05_2 {
	public static void main(String[] args) {
		int[] arr = { 10, 0, 12, 0, 14, 0, 16, 0, 18, 0 };

		int a = 0;
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			a += arr[i];
			if (arr[i] != 0) {
				c = c + 1;
			}
		}
		;
		System.out.println("���� " + a);
		System.out.println("0���� �ƴѻ���� ����� "+ a / c);
	}
}
