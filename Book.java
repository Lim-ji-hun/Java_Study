package ch03_getter_setter;
/*
 * Book class 를 정의하고, BookManager class 에서 테스트 하세요
 * - 책제목, 지은이, 진열위치, 가격의 관리가 가능합니다
 * - getter, setter 메서드를 정의해야 합니다
 *   > 지은이   : 2 ~ 10 글자만 가능
 *     진열위치 : A, B, C 만 가능
 *     가격     : +(plus) 만 가능 
 */
public class Book {
	
	private String name;
	private String writer;
	private char where;
	private int prise;
	
	public String getname() {
		return name;
	}
	
	public void setname(String _name) {
		name = _name;
	}
	
	public String getwriter() {
		return writer;
	}
	
	public void setwriter(String _writer) {
		if(_writer.length() <= 10 && _writer.length() >= 2) {
			writer = _writer;
		} else {
			System.out.println("이름은 2 ~ 10글자만 가능");
		}	
	}
	
	public char getwhere() {
		return where;
	}
	
	public void setwhere(char _where) {
		if(_where == 'A' || _where == 'B' || _where == 'C') {
			where = _where;
		} else {
			System.out.println("A, B, C 만 가능");
		}	
	}
	
	public int getprise() {
		return prise;
	}
	
	public void setprise(int _prise) {
		if(_prise >= 0) {
			prise = _prise;
		} else {
			System.out.println("+(plus) 만 가능 ");
		}
		
	}
	
	
	void info() {
		System.out.println("---책 정보---");
		System.out.println("책 이름 : " + name);
		System.out.println("글쓴이 : " + writer);
		System.out.println("진열위치 : " + where);
		System.out.println("가격 : " + prise + "원");
	}
	
	
	
	

}
