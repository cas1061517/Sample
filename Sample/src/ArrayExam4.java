public class ArrayExam4 {
	public static void main(String[] args) {
		char[] chars = { 'b', 'e', 'z', 'a', 'w' };
		for(int i = 0; i< 100; i++) {
			int a = chars[0];
			int ran = (int) (Math.random() * chars.length);
			int b = chars[ran];
			int temp = a;
			a = b;
			b = temp;
			chars[0] = (char)a;
			chars[ran] = (char)b;
 		}
		System.out.println(chars);
	}
}