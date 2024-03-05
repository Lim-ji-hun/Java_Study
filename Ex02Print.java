
public class Ex02Print {
	public static void main(String[] args) {
		//printf() : 문자열 안의 서식지정자를 사용해서 외부의 값을 불러와서 출력할 수 있음
		// 정수 : %d
		// 실수 : %f
		// 문자 : %c
		// 문자열 : %s

		
		int A = 10;
		System.out.printf("숫자 : %d\n", A);
		double B = 2.34;
		System.out.printf("실수 : %f\n", B);
		
		System.out.printf("문자 : %c\n", 'C');
		System.out.printf("문자 : %c\n", '가');
		//문자 하나의 데이터를 표시할때는 '' 사용할 것
		//놀랍게도 자바는 한글처리가 됨 - 자바는 문자 하나를 2byte로 처리하기에 한글적용이 가능
		
		int F = 'F';
		System.out.printf("문자 : %c\n", F);
		
		System.out.printf("문자열 : %s, %s\n", "Hello", "안녕");
		
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);
		System.out.printf("%-5d1\n", 123);
		//%d와 %5d의 차이점은 앞의 몇칸의 띄울것이냐 - 마이저스 기호도 가능
		//+ : 오른쪽 맞춤, - : 왼쪽 맞춤
		
		// 실수값 출력시 서식지정자를 '%.숫잘f' 로 작성하면 해당숫자의 소숫점자리까지 출력함
		
		System.out.printf("실수 : %.1f\n", B);
		System.out.printf("실수 : %5.1f\n", B);
		System.out.printf("실수 : %-5.1f@\n", B);



		
		
	}

}
