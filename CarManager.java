package ch01_basic;

public class CarManager {
	
	public static void main(String[] args) {
		
		Car proA = new Car();
		proA.made = "현대";
		proA.model = "그랜저";
		proA.color = "검은색";
		proA.prise = "3000만원";
		
		proA.info();
		
		Car proB = new Car();
		proB.setinfo("테슬라", "전기차", "흰색", "5000만원");
		proB.info();
	}

}
