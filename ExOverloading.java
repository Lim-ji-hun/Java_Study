package ch02_overloading;
/*
 * 메서드 오버로딩(method overloading)
 * class안에 같은 이름의 메서드를 여러개 정의 하는 것
 * 매개변수 갯수, 타입만 다르면 하나의 이름으로 여러개의 메서드를 정의할 수 있다.
 *  
 *  
 */
class Add {
	void addInt(int a, int b) {
		System.out.println("-addInt(int a, int b) - ");
		int sum = a + b;
		resultInt(a, b, sum);
	}
	
	void addDouble(double a, double b) {
		System.out.println("-addDouble(int a, int b) - ");
		double sum = a + b;
		resultDouble(a, b, sum);
	}
	
	void resultInt(int a, int b, int sum) {
		System.out.println(a + " + " + b + " + " + " = " + sum);
	}
	
	void resultDouble(double a, double b, double sum) {
		System.out.println(a + " + " + b + " + " + " = " + sum);
	}
	
	//------------------------------------
	// int addData(int a, int b) {} 반환타입은 오버로딩 조건에 해당 x
	void addData(int a, int b) {
		System.out.println("-addData(int a, int b) - ");
		int sum = a + b;
		resultData(a, b, sum);
	}
	
	void resultData(int a, int b, int sum) {
		System.out.println(a + " + " + b + " + " + " = " + sum);
	}
	
	void addData(double a, double b) {
		System.out.println("-addData(double a, double b) - ");
		double sum = a + b;
		resultData(a, b, sum);
	}
	void resultData(double a, double b, double sum) {
		System.out.println(a + " + " + b + " + " + " = " + sum);
	}
}


public class ExOverloading {
	public static void main(String[] args) {
		
		Add testA = new Add();
		testA.addInt(12, 34);
		testA.addDouble(5.6, 7.8);
		
		System.out.println();
		
		testA.addData(11, 22);
		testA.addData(3.3, 4.4);
		
		
	}
	

}
