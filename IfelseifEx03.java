package ch04ifelseif;

public class IfelseifEx03 {
	public static void main(String[] args) {
		
		int num = 12;
		System.out.println("num : " + num);
		
		if(num%3 ==0 ) {
			System.out.println("3의 배수");
		} else if (num%5 ==0 ) {
			System.out.println("5의 배수");
		} else if (num%3 ==0 && num%5 ==0) {
			System.out.println("3과 5의 배수");
		} else {
			System.out.println("???");
		}
		//조건식의 순서를 잘 잡아야함 이런식으로 짜면 절대 작동이 안되는 구간이 생김
		
		if(num%3 ==0 && num%5 ==0) {
			System.out.println("3과 5의 배수");
		} else if (num%5 ==0) {
			System.out.println("5의 배수");
		} else if (num%3 ==0) {
			System.out.println("3의 배수");
		} else {
			System.out.println("???");
		}
		
		
	}

}
