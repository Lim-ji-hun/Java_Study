package ch06_for;

public class ForEx05 {
	
	public static void main(String[] args) {
		
		for(int out=0 ; out<=5 ; out++) {
			
			for(int i=1 ; i<=5 ; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int dan=2 ; dan<=9 ; dan++) {
			System.out.println("- " + dan + " 단-");
			for(int su=1 ; su<=9 ; su++) {
				System.out.println(dan + "X" + su + " = " + (dan*su));
			}
			System.out.println();
		}
			

	}

}
