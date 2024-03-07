package ch06_for;

public class ForEx04 {
	public static void main(String[] args) {
		
		int dan = 7;
		System.out.println("- " + dan + "단 -");
		System.out.println();
		
		for(int i=1 ; i<=9 ; i++) {
			System.out.println(dan + "X" + i + " = " + (dan*i));
		}
	}

}

