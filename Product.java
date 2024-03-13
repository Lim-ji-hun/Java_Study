package ch10_quiz;

public class Product {
	/*
	 * 하나의 제품 정보를 가지는 Product class 를 정의하고, ProductManager class 에서 테스트 하세요
	 * - 전체 등록 제품수, 제품 종류, 제품명, 가격, 관리번호
	 *   > 가격 : -(minus) 값 적용 불가
	 *     관리번호 : 변경 불가
	 *     전체 등록 제품수 : 제품이 하나 추가될 때 마다 증가
	 */
	
	public static int Count;
	private String Type;
	private String Name; 
	private int prise;
	private final int Num;
	
//	public Product() {
//		Count = 1;
//		Type = "none";
//		Name = "none";
//		prise = 0;
//
//	}
	
	public Product(String Type, String Name, int prise, int Num){
		
		Count++;
		this.Type = Type;
		this.Name = Name;
		this.prise = prise;
		this.Num = Num;

	}
	
	public int getCount() {return Count;}
	
	public String getType() {return Type;}
	public void setType(String Type) {
		this.Type = Type;
	}
	
	public String getName() {return Name;}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public int getprise() {return prise;}
	public void setprise(int prise) {
		if(prise >= 0) {
			this.prise = prise;
		} else {System.out.println("----no signal----");}
	}
	
	void info() {
		System.out.println("--제품 정보--");
		System.out.println("전체 등록 제품수 : " + Count);
		System.out.println("제품명 : " + Name);
		System.out.println("가격 : " + prise + "원");
		System.out.println("관리번호 : " + Num);
	}

}
