public class Star2 {
	public static void main(String[] args) {

		int space = 1;
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {
				if(b < space) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			space++;
			System.out.println();
		}

	}
}