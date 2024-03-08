import java.util.Random;

public class QuizRandom {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		// 2 ~ 50 사이의 랜덤값 5개를 출력하는 코드를 작성하세요
//	    int ran_num = (random.nextInt(49) + 2); // 범위 갯수 = 마지막값 - 시작값 +1 
//	    System.out.println(ran_num);
		
		
	    // 주사위 값을 가지는 변수 2개를 선언하고, 1 ~ 6 사이의 랜덤값으로 각각 초기화 합니다
	    // 두개의 주사위에 한번에 같은 값이 들어갈때 까지의 시도 횟수를 구하는 코드를 작성하세요
	    
//		int di_f = 0;
//		int di_s = 0;
//		int co = 0;
//		boolean run = true;
//		
//		while(run) {
//			di_f = (random.nextInt(6) + 1);
//			di_s = (random.nextInt(6) + 1);
//			co += 1;
//			if(di_f == di_s) {
//				run = false;
//			}
//		}
//		System.out.println(di_f);
//		System.out.println(di_s);
//		System.out.println(co + "회");
//		
		
	    // 사용자 확인 문자열을 생성하는 코드를 작성하세요
	    // - 확인 문자열 : 0 ~ 9, A ~ Z 의 조합 5개로 이루어져 있습니다
	    // Ex) KERCY , A7U93, 98025 .....
		
		String userCode = "";

		
		for(int i=0 ; i<5 ; i++) {
			boolean select = random.nextBoolean(); // 숫자, 문자 생성 선택
			if(select) {
				userCode += (char)(random.nextInt(10) + '0');
			} else {
				userCode += (char)(random.nextInt('Z'-'A'+1)+'A');
			}
		}
		System.out.println(userCode);
			
	
		
		
		
		
		
	
		
		
		

		
		
		
		
		
	}	
		
}
