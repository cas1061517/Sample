
public class 가위바위보 {
	public static void main(String[] args) {
		
		double ran = Math.random();
		int com = (int)(ran * 3);
		
		System.out.println(com);
		int player = 1;
		
		if(player == com) {
			System.out.println("비겼음");
		}else if( (player + 1) % 3 == com) {
			System.out.println("player 패");
		}else {
			System.out.println("player 승");
		}
		

		
		
		
		
		//		if(player == 1 && com == 0) {
//			System.out.println("플레이어 승!");
//		}
//		else if(player == 0 && com == 2) {
//			System.out.println("플레이어 승!");
//		}

}
}