import java.util.Scanner;

public class QuizInput {
	
	public static void main(String[] args) {
	    // 이름, 주소, 나이, 성별(m, f), 키를 입력받아서 출력하는 코드를 작성하세요
	      
	    // ID 를 입력받고, 입력받은 ID 를 사용해서 E-mail 을 생성하는 코드를 작성하세요
	    // Ex) ID 입력 > test
	    //     E-mail : test@abc.com
	      
	    // 세과목의 점수를 입력받아서 총점, 평균을 구하는 코드를 작성하세요
	    // - int : 점수, 총점
	    //   double : 평균
	    // - 평균은 소수점 첫째자리 까지만 표시합니다
		
		Scanner scan = new Scanner(System.in);
//		
//		
//		System.out.print("이름 입력 > "); 
//		String name = scan.next();
//		System.out.println("이름 : " + name);
//		
//		System.out.print("주소 입력 > "); 
//		scan.nextLine();
//		String home = scan.nextLine();
//		System.out.println("주소 : " + home);
//		
//		System.out.print("나이 입력 > "); 
//		int old = scan.nextInt();
//		System.out.println("나이 : " + old);
//		
//		System.out.print("성별 입력 > "); 
//		char gender = scan.next().charAt(0);
//		System.out.println("성별 : " + gender);
//		
//		System.out.print("키 입력 > ");
//		double zl = scan.nextDouble();
//		System.out.println("키 : " + zl);
//		
//		System.out.println();
		
//		System.out.println("==입력 정보==");
//		System.out.println("이름 : " + name);
//		System.out.println("주소 : " + home);
//		System.out.println("나이 : " + old);
//		System.out.println("성별 : " + gender);
//		System.out.println("키 : " + zl + "cm");
		
		
		System.out.println();
		
//		System.out.print("ID를 입력하시오 > ");
//		String ID = scan.next();
//		System.out.println("Email : " + ID + "@abc.com");
//		
//		String email = ID + "@abc.com";
//		System.out.println("Email : " + email);		
//		
		
		
		System.out.println("각 과목의 점수를 입력하시오");
		
//		System.out.print("국어 > ");
//		int ko = scan.nextInt();
//		System.out.print("수학 > ");
//		int ma = scan.nextInt();
//		System.out.print("영어 > ");
//		int en = scan.nextInt();
		
		System.out.println("세 과목의 점수를 입력하시오");
		int ko = scan.nextInt();
		int ma = scan.nextInt();
		int en = scan.nextInt();
		
		int all = ko + ma + en;
		double vud = (double)all/3;
		
		System.out.println("총점 : " + all);
		System.out.printf("평균 : %.1f", vud);
		
		
	}
}
