package ch06_for;

public class ForEx02 {
	
	public static void main(String[] args) {
		
		int n=5;
		for(int i=1 ; i<=30 ; i++) {
			if(i%n == 0) {
				System.out.println(i);
			}
		}
		
		
		System.out.println();
		
		for(int i=n ; i<= 30 ; i+=n) {
			System.out.println(i);
		}
	}

}
