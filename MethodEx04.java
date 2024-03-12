import java.util.Scanner;

public class MethodEx04 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char subject = inputSubject("Java : j , Python : p  선택 >> ", scanner);
		
		checkSubject(subject);
		
		
		
	}
	//메서드 실행중에 return문이 실행되면 해당위치에서 메서드의 실행을 멈추고 호출부로 돌아감니다
	//멕서드 안에서의 return문은 몇번이든 실행 가능
	public static boolean checkSubject(char subject) {
		switch(subject) {
		case 'j':
			System.out.println("JAVA를 선택하셨습니다.");
			//void 일때 break; or return; 사용가능
			return true;
		case 'p':
			System.out.println("PYTHON을 선택하셨습니다.");
			//break;
			return true;
		}
		System.out.println("-end-");
		return false;
	}
	
	public static char inputSubject(String menu, Scanner scanner) {
		System.out.print(menu);
		char value = scanner.next().charAt(0);
		return value;
		
	}
	
	

}
