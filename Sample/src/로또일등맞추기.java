import java.util.Arrays;

public class 로또일등맞추기 {
	public static void main(String[] args) {
		int[] lotto = { 3, 4, 11, 19, 22, 45 };
		int count = 0;

		while (true) {
			int[] my = new int[6];

			for (int i = 0; i < 6; i++) {
				int num = (int) (Math.random() * 45 + 1);
				my[i] = num;
			}
			Arrays.sort(my);
			
			System.out.println(Arrays.toString(my));
			count++;
			System.out.println("횟수: " + count);
			
			boolean result = Arrays.equals(lotto, my);
			if(result) {
				System.out.println(Arrays.toString(my));
				break;
			}
		}
	}

}
