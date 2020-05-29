import java.util.Scanner;

public class Exam05_5 {
	public static void main(String[] args) {

		boolean isRun = true;

		int studentNum = 0;
		int a = 0;
		double c = 0;

		int[] scores = null;
		Scanner scan = new Scanner(System.in);
		while (isRun) {
			System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
			System.out.println("|  1.학생수   | 2.점수입력  | 3.점수리스트 |  4.분석    |  5.종료    |");
			System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
			System.out.print("선택 > ");

			int selectNo = scan.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum = scan.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print((i + 1) + "번 학생의 점수> ");
					scores[i] = scan.nextInt();
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번 학생의 점수> " + scores[i]);
				}

			} else if (selectNo == 4) {
				for (int i = 0; i < scores.length; i++) {
					c += scores[i];
					int b = scores[i];
					if (b > a) {
						a = b;
					}
				}
				System.out.println("가장 높은 점수는> " + a);
				System.out.println("평균 점수는> " + (double) (c / studentNum));
			} else if (selectNo == 456774923) {
				System.out.println("숨겨진 코드를 발견했습니다.");
				System.out.println("        (\\_(\\");
				System.out.println("        (•֊• )");
				System.out.println("         O☕️O");
			} else if (selectNo == 5) {
				
				isRun = false;
			}
		}
		System.out.println("프로그램 종료");
		scan.close();
	}
}
				
