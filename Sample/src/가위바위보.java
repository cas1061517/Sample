
public class ���������� {
	public static void main(String[] args) {
		
		double ran = Math.random();
		int com = (int)(ran * 3);
		
		System.out.println(com);
		int player = 1;
		
		if(player == com) {
			System.out.println("�����");
		}else if( (player + 1) % 3 == com) {
			System.out.println("player ��");
		}else {
			System.out.println("player ��");
		}
		

		
		
		
		
		//		if(player == 1 && com == 0) {
//			System.out.println("�÷��̾� ��!");
//		}
//		else if(player == 0 && com == 2) {
//			System.out.println("�÷��̾� ��!");
//		}

}
}