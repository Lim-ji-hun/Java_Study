package ch01_if;

public class IfEx02 {
	public static void main(String[] args) {
		
		int value = 7;
		System.out.println("valse : " + value);
		
		if(value % 2 == 1) {
			System.out.println("홀수");
		}
		if(value % 2 == 0) {
			System.out.println("짝수");
		}
		
	}
}
