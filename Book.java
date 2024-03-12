package ch01_basic;
/*
 * book class를 정의하고 BookManager class네서 테스트하세요
 * - 책제목, 지은이, 진열위치, 가격
 */

public class Book {
	
	String name;
	String writer;
	String where;
	int prise;
	
	void setinfo(String Aname, String Awriter, String Awhere, int Aprise) {
		name = Aname;
		writer = Awriter;
		where = Awhere;
		prise = Aprise;
	}
	
	
	void info() {
	System.out.println("---책 정보---");
	System.out.println("책 이름 : " + name);
	System.out.println("글쓴이 : " + writer);
	System.out.println("진열위치 : " + where);
	System.out.println("가격 : " + prise + "원");
		
		
	}
	
	
	
	
}



