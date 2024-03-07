package ch06_for;

public class QuizFor2 {
	public static void main(String[] args) {
		// 아래와 같은 출력을 진행하는 코드를 작성하세요
	    //  1  2  3  4  5
	    //  6  7  8  9 10
	    // 11 12 13 14 15
	    // 16 17 18 19 20
	    // 21 22 23 24 25
		
//		for(int i=1 ; i<=25 ; i++) {
//			System.out.print(" " + i);
//			
//			if(i>=5) {
//				int ai = i%5;
//				if(ai == 0) {
//					System.out.println();	
//			    }
//			}	
//	    }
		
		int a = 1;
		
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=5 ; j++) {
				System.out.print(" " + a);
				++a;
			}System.out.println();
			
		}
		
		
		
		
		
		
		
	    // -----------------------------------------------------------------
		
		// 첫날에는 통장에 1원을 입금하고, 둘째날 부터는 전날 입금액의 2배를 입금합니다
	    // 위와 같은 방식으로 30일동안 입금한 총금액을 구하는 코드를 작성하세요
		
//		int money = 0;
//		int all_money = 0;
//		
//		for(int day=1 ; day<=30 ; day++) {
//			if(day == 1) {
//				money = 1;
//			} else{
//				money *= 2;
//			}
//			all_money += money; 
//		}
//		
//		System.out.println("총금액 : " + all_money);
		
		
	}
	 
    
}
