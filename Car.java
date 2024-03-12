package ch01_basic;

/*
 * car class를 정의하고 CarManager class에서 테스트하세요
 * 차량의 제조사, 모델명, 색상, 가격관리가 가능
 * 
 */


public class Car {
	
	String made;
	String model;
	String color;
	String prise;
	
	void setinfo(String Amade, String Amodel, String Acolor, String Aprise) {
		made = Amade;
		model = Amodel;
		color = Acolor;
		prise = Aprise;
	}
	
	void info() {
		System.out.println("---차량 정보---");
		System.out.println("제조회사 : " + made);
		System.out.println("차량기종 : " + model);
		System.out.println("차량색상 : " + color);
		System.out.println("차량가격 : " + prise);
	}
	
	
	
	
	

}
