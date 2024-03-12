import java.util.Scanner;
import java.util.Random;

public class QuizMethod {
	
	public static void main(String[] args) {
		
		// 이름, 나이, 성별, 키를 입력받아서 반환하는 각각의 메서드를 구현하세요
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
//		String name = name(scanner);
//		int old = Old(scanner);
//		char gender = gender(scanner);
//		double zl = zl(scanner);
//
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + old);
//		System.out.println("성별 : " + gender);
//		System.out.println("키 : " + zl);
		
		
	    // 정수 하나를 입력받아서 반환하는 메서드를 구현합니다
	    // 위 메서드를 사용해서 변수 2개를 각각 초기화 합니다
	    // 두개의 변수를 사용해서, 두수 중 큰수를 찾아서 반환하는 메서드를 구현하세요
	    // - 변수에 들어가는 값은 1 이상의 값만 가능하고, 같은 값이면 0 을 반환합니다
	     
//		int first = first(scanner);
//		System.out.println("반환받은 값 : " + first);
//		
//		int se = first(scanner);
//		int th = first(scanner);
//		System.out.println("초기화 된 변수 2개 : " + se +" , " + th);
//		
//		int big = MoreBig(se, th);
//		if(big != 0) {
//			System.out.println("두수 중 큰수 : " + big);
//		}else {
//			System.out.println("둘이 같은 숫자");
//		}

		
		// 아래의 배열에 한번에 같은 값이 들어갈때까지 진행하는 매서드를 구현하시오
		// - 값 : 1 ~ 5
		int[] data = new int[3];
		
		SameData(data);

	}
	
	public static void SameData(int[] data) {
		
		Random random = new Random();
		boolean a = true;
		int p = 0;
		while(a) {
			
			for(int i=0 ; i<data.length ; i++) {
				data[i] = random.nextInt(5)+1;
				p = data[0];
				if(data[i] == p) {
					System.out.print(data[i] + " ");	
				}else {
					i--;
				}
			}
			break;
		}		

	}
	
	
	
	public static String name(Scanner scanner) {
		System.out.print("이름 입력 > ");
		String name = scanner.next();
		return name;
	}
	public static int Old(Scanner scanner) {
		
		System.out.print("나이 입력 > ");
		int old = scanner.nextInt();
		return old;
	}
	public static char gender(Scanner scanner) {
		System.out.print("성별 입력( m , w ) > ");
		char gender = scanner.next().charAt(0);
		return gender;
	}
	public static double zl(Scanner scanner) {
		
		System.out.print("키 입력 > ");
		double zl = scanner.nextDouble();
		return zl;
	}
	
	
	public static int first(Scanner scanner) {
		System.out.print("정수 입력 > ");
		int first = scanner.nextInt();
		if(first > 0) {
			return first;
		}else {
			System.out.println("잘못된값입니다.");
			return 1;
		}
	}
	
	
	
	public static int MoreBig(int se, int th) {
		if(se > th) {
			return se;
		}else if(se < th) {
			return th;
		}else {
			return 0;
		}
	}


}
