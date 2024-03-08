import java.util.Random;

public class RandomBox {
	public static void main(String[] args) {
		
		//random class 객체생성
		Random random = new Random();
		
		// nextInt() : int 범위에서 생성
		int va = random.nextInt();
		System.out.println(va);
		
		//nestInt(bound) : 0 ~ (bound-1) 사이에서 생성
		for(int i=0 ; i<5 ; i++) {
			int vb = random.nextInt(10);
			System.out.println(vb);
		//중복 데이터 값이 생성 될 수 있음
		}
		
		//nextBouble() : 0.0 ~ 0.999999999....
		double vc = random.nextDouble();
		System.out.println(vc);
		
		
		double vd = random.nextInt(100)/10.0; // 0~9.9
		System.out.println(vd);
		
		
		//소문자 알파벳
		char ch = (char)(random.nextInt(26) + 97); //97~122까지 아스키코드로 a~z까지
		System.out.println(ch);
		
		
	}

}
