package ch06_for;

public class ForEx03 {
	public static void main(String[] args) {
		
		int last = 10;
		int tot = 0;
		
		for(int i=1 ; i <= last ; i++) {
			tot += i;
		}
		System.out.println("1~" + last + "까지의 합 : " + tot);
		
	}
}
