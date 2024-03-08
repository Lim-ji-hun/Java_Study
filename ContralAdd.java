package ch08_addition;

/*
 * 삼항 연산자
 * - ( 조건식 ) ? 참 : 거짓;
 * 
 * break
 * - 제어문을 강제로 종료 시킬 때 사용
 * - break 문과 자강 가까운 제어문 하나만 종료
 * 
 * continue
 * - 현재 진행중인 반복문의 실행을 먼추고, 다음 반복문을 진행
 *   > for, while, do while
 */


public class ContralAdd {
	public static void main(String[] args) {
		
		// 삼항 연산자
		int data = 7;
		String res = (data%2 == 1) ? "홀수" : "짝수";
		System.out.println("res : " + res);
		
		if(data%2 ==1)
			res = "홀수";
		else
			res = "짝수";
		System.out.println("res : " + res);
	
		
		for(int i=1 ; i<=3 ; i++) {
			System.out.print(i + "회전 : ");
			for(int j=1 ; j<=10 ; j++) {
				System.out.print(j + "회전 : ");
				if(j == 7) {
					break;
				}
			}System.out.println();
			
			
			int step = 0;
			while(step < 10) {
				
				++step;
				if(step%3 == 0) {
					System.out.println("jump~");
					continue; //이게 작동하면 하위코드를 실행하지 않고 다시 위로 보냄
				}
				System.out.println(step);
				
			}
			
		}
	}

}
