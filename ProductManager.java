package ch10_quiz;

public class ProductManager {
	public static void main(String[] args) {
		
//		Product ProductA = new Product();
//
//		
//		System.out.println();
//		
//		ProductA.setType("신발");
//		ProductA.setName("아디다스");
//		ProductA.setprise(180000);
//		ProductA.info();
//		
//		System.out.println();

		Product ProductB = new Product("옷", "탑텐", 100000, 1001 );
		ProductB.info();
		
		System.out.println();

		Product ProductC = new Product("모자", "모자는 몰루", 100000 , 1002);
		ProductC.info();
		
		
	}

}
