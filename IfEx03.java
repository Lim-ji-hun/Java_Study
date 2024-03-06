package ch01_if;

public class IfEx03 {
	public static void main(String[] args) {
		
		int ia = 5;
		int ib = 13;
		System.out.println("ia : " + ia + " - ib : " + ib );
		
		int max = 0;
		if(ia > ib) 
			max = ia;
		if(ia < ib)
			max = ib;
		
		System.out.println("큰값 : " + max);
	}

}
