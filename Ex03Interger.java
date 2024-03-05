// 상수 : 값 변경 불가
// literal - 코드 안의 고정된 데이터
// 자료형 - 데이터를 저장하는 공간을 생성할 때 사용
/* 
- 기본 자료형 : 이름과 값이 하나, 공간의 크기가 고정
            1byte     2byte     4byte     8byte     
  1. 논리형  boolean 
  2. 문자형             char
  3. 숫자형   byte     short      int(기본)  long
  4. 실수형                      float     double(기본)
  
- 참조 자료형 : 기본을 제외한 다른 모든 것. 실제 데이터가 있는 곳과 이름이 분리되있음

변수
-자료형을 사용해서 만들어 쓰는 데이터
 >자료형 변수명

*/

public class Ex03Interger {
	public static void main(String[] args) {
		
		int a;   //변수 선언(생성)
		//System.out.println("a : "+ a); -> error
		//모든 변수는 초기화 이후에 사용할 것
		a=10;
		System.out.println("a : "+ a);
		
		a=20;
		System.out.println("a : "+ a);
		
		int ia = 11;
		System.out.println("ia : "+ ia);
		
		byte ba = 127; //byte = -128 ~ 127까지 0은 양수 취급 0 ~ 255
		System.out.println("ba : " + ba);
		
		short sa = 32767; // 2byte : 0 ~ 65535
		System.out.println("sa : "+ sa);
		
		long la = 2147483647; // 8byte : 
		System.out.println("la : "+ la);
		
		long laL = 2147483648L; // 8byte : 
		System.out.println("laL : "+ laL);
		//long 타입의 리터널을 사용할 때에는 데이터 뒤에 'L(l)'을 작성한다

	}

}
