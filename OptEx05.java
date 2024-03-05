/*
 * 증강 연산자 
 * - 값을 1 증가시키거나 1 감소시킬때 사용
 *   > ++ : 1 증가
 *   > -- : 1 감소
 *   
 *   변수의 앞에 올때랑 뒤에 올때 차이점 구분
 *   ++n -> 1증가 후에 다른연산
 *   --n -> 1감소 후에 다른연산
 *   n++ -> 다른 연산 후에 1증가
 *   n-- -> 다른 연산 후에 1감소
 *   
 */


public class OptEx05 {
	public static void main(String[] args) {
		
		int data = 5;
		System.out.println("data : " + data);
		System.out.println();
		
		int res = 0;
		res = ++data;
		System.out.println("data : " + data + " - res : " + res);
		
		res = data++;
		System.out.println("data : " + data + " - res : " + res);
		
		res = --data;
		System.out.println("data : " + data + " - res : " + res);
		
		res = data--;
		System.out.println("data : " + data + " - res : " + res);
		
		int a = 5;
		++a;
		System.out.println("a : " + a);
		
		int b = 5;
		int result = ++b * ++b;
		System.out.println("b : " + b + " - result : " + result);
		
		int c = 5;
		int ressultC = ++c * ++c;
		System.out.println("c : " + c + " - res : " + ressultC);
		
		//이러한 코드는 컴파일 언어에 따라 값이 달라질 수 있음 -> 이러한 코드는 사용하지 않는 것이 좋음
		//한마디로 더러운 코드
		
		int d = 5;
		boolean e = (d++ > 5) && ( ++d >5);
		System.out.println("d : " + d + " - e : " + e);
		
		//앞의 조건식에 따라서 뒤의 조건식을 진행하냐 마느냐가 정해짐 위의 식에서 d++ > 5에 의해 거짓임이 나오니 뒤의 ++d > 5를 시행하지 않음
		
		
		
	}
}
