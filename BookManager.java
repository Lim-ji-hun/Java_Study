package ch01_basic;

public class BookManager {
	public static void main(String[] args) {
		Book bookA = new Book();
		bookA.name = "집가고싶다";
		bookA.writer = "몰라";
		bookA.where = "3번 진열장";
		bookA.prise = 1000;
		
		bookA.info();
		
		Book bookB = new Book();
		bookB.setinfo("집가고싶다", "몰라", "3번 진열장", 1000);
		bookB.info();
		
	}
}
