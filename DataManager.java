package ch02_overloading;

public class DataManager {
	public static void main(String[] args) {
		
		Max testA = new Max();
		testA.BigData(30, 27);
		testA.BigData(7.5, 7.9);
		
		System.out.println();
		
		int[] iar = new int[] {1, 2, 3, 4, 5};
		char[] car = new char[] {'가', 'a' , '하'};
		
		ShowArray sa = new ShowArray();
		sa.PrintData(iar);
		
		System.out.println();
		
		sa.PrintData(car);
	
	}

}
