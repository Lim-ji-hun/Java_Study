import java.util.Scanner;

public class Quizvending_machine {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//      -------------------------------
//      1.콜라(1000)  2.커피(300)
//      -------------------------------
//      돈을 넣어주세요 : 1500
//
//      1.콜라(1000)   2.커피(300) 선택 > 1
//      콜라가 나옵니다~
//      현재 잔액 : 500원
//      재구매 하시겠어요(0.no  1.yes) > 1
//      1.콜라(1000)   2.커피(300) 선택 > 1
//      금액이 부족합니다..
//      현재 잔액 : 500원
//      재구매 하시겠어요(0.no  1.yes) > 1
//      1.콜라(1000)   2.커피(300) 선택 > 2
//      커피가 나옵니다~
//
//      거스름 돈 : 200원  
		
		int money = 1500;
		int coc = 1000;
		int cof = 300;
		int cho = 0;
		boolean a = true;
		
		System.out.println("-------------------------------");
		System.out.println("1.콜라(1000)  2.커피(300)");
		System.out.println("-------------------------------");
		System.out.println("돈을 넣어주세요 : 1500");
		System.out.println();

		while(a) {
			
			System.out.print("1.콜라(1000)  2.커피(300) 선택 >> ");
			cho = scan.nextInt();
			
			if(cho == 1 && money >= 1000) {
				System.out.println("콜라가 나옵니다~");
				money -= 1000;
			} else if (cho == 2 && money >= 300) {
				System.out.println("커피가 나옵니다~");
				money -= 300;
			} else if (cho == 1 && money < 1000){
				System.out.println("금액이 부족합니다..");
			} else if (cho == 2 && money < 300) {
				System.out.println("금액이 부족합니다..");
			} else if (cho != 1 || cho !=2) {
				System.out.println("다시 입력하시오");
			}
			
			System.out.println("거스름 돈 : " + money + "원");
			
			if(money >= 300 && cho == 1 || cho ==2) {
				System.out.print("재구매 하시겠어요(0.no  1.yes) > ");
				cho = scan.nextInt();
			}
			
			if(money < 300 || cho == 0) {
				a = false;
				if(cho == 0) {
					System.out.println("구매를 종료합니다.");
					System.out.println("거스름 돈 : " + money + "원");
				}
			}
			
		} 
		
      

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
