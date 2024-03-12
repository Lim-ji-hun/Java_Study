package ch03_getter_setter;
/*
 * getter 메서드
 * - 객체의 멤버필드를 사용하는 용도의 메서드
 * setter 메서드
 * - 객체의 멤버필드를 설정하거나 수정하는 용도의 메서드
 */


class Member{
	
	private String id;
	private String name;
	private int age;
	
	public String getId() {
		return id;
	}
	
	public void setId(String _id) {
		id = _id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String _name) {
		if(_name.length() <= 10) {
			name = _name;
		} else {
			System.out.println("이름은 10글자 까지만 가능");
		}	
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int _age) {
		if(_age >= 0 && _age <= 130) {
			age = _age;
		} else {
			System.out.println("나이는 0 ~ 130 사이만 가능");
		}
	}
	
	void info() {
		System.out.println("---회원 정보---");
		System.out.println("id : "+id);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}
public class ExGetterSetter {
	public static void main(String[] args) {
		
		Member manA = new Member();
		//manA.id = "001";
		//manA.name = "manA";
		//manA.age = -20;

		
		manA.setId("m001");
		System.out.println("아이디 : " + manA.getId());
		
		manA.setName("123456789qwe");
		manA.setName("manA");
		System.out.println("이름 : " + manA.getName());
		
		manA.setAge(150);
		manA.setAge(50);
		System.out.println("나이 : " + manA.getAge());
		
		manA.info();
		
	}
}
