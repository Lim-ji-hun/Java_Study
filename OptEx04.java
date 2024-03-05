/*
 * 논리연산자 - 2개 이상의 조건식을 계산 
 * 
 * &&(and 연산자)
 * 조건식_a && 조건식 _b => 2개 다 참이여야 참 1개라도 거짓이면 거짓
 * 
 * ||(or 연산자)
 * 조건식_a || 조건식 _b => 2중 1개라도 참이면 참
 * 
 * !(not연산)
 * !(조건식) => 참이면 거짓으로 거짓이면 참으로 변환
 * 
 */



public class OptEx04 {
	
	public static void main(String[] args) {
		int na = 10, nb = 7;
		System.out.println("na : " + na + " - nb : " + nb);
		System.out.println();
		
		boolean res;
		res = na > 9 && nb > 9;
		System.out.println("na > 9 && nb > 9 : " + res);
		
		res = na > 9 || nb > 9;
		System.out.println("na > 9 || nb > 9 : " + res);
		
		System.out.println();
		
		res = !(na > 9);
		System.out.println("!(na > 9) : " + res);
		
		res = !(na < 9);
		System.out.println("!(na < 9) : " + res);
		
		System.out.println();
		
		res = !(na > 9 && nb > 9);
		System.out.println("na > 9 && nb > 9 : " + res);
		
		res = !(na > 9 || nb > 9);
		System.out.println("na > 9 || nb > 9 : " + res);
		
		
		
	}

}
