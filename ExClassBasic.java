package ch01_basic;

/*
 * 객체지향 프로그램 oop : object oriented programming
 * -class 를 사용해서 객체를 생성하고 이렇게 만들어진 객체를 사용해서 하나의 프로그램을 만드는 것
 * 
 * class
 * - 객체를 만들기 위한 설계도
 * - 객체에 대한 속성과 기능을 코드로서 구현한 것
 * 
 * 객체(object)
 * - class를 사용해서 만들어진 것이며 instance라고도 한다
 * - 하나의 클래스로 여러개의 instance를 생성할 수 있다
 * - 
 * class 구성
 * - 멤버 필드 : 변수(instance변수) -> 객체 고유 데이터
 *   멤버 메서드 : 객체 기능, 동작 구현
 */
class Human {
	
	//멤버 필드
	String name;
	int age;
	
	//멤버 메서드
	void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	void run() {
		System.out.println(name + "이/가 달리기를 합니다.");
	}
	
}
//public은 파일명과 동일한 클래스에만 붙을수있다
public class ExClassBasic {
	
	public static void main(String[] args) {
		
		Human manA;
		manA = new Human();
		
		manA.name = "manA";
		manA.age = 20;
		System.out.println("이름 : " + manA.name);
		System.out.println("나이 : " + manA.age);

		manA.info();
		manA.run();
		
		Human manB = new Human();
		manB.name = "manB";
		manB.age = 30;
		manB.info();
		
		
		
		
		
		
	}

}
