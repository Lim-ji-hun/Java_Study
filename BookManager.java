package ch03_getter_setter;

public class BookManager {
	public static void main(String[] args) {
		
		Book bookA = new Book();
		
		bookA.setname("개미");
		bookA.setwriter("누군가가");
		bookA.setwhere('A');
		bookA.setprise(2000);
		
		bookA.info();
		
		System.out.println();
		
		Book bookB = new Book();
		
		bookB.setname("qwer");
		bookB.setwriter("나");
		bookB.setwhere('f');
		bookB.setprise(-2000);
		
		bookB.info();
		
	}

}
