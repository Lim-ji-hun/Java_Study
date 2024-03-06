import java.util.Scanner;
//자동 import : ctrl shift o

//scanner class - 키보드로 입력한 데이터를 원하는 자료형으로 선택하여 처리할 수 있다.

public class Ex02Scanner {
	
	public static void main(String[] args) {
		
//		String w = "abc";
//		String w = new String("abc");
	
		Scanner scanner = new Scanner(System.in);
		//Scanner 객체 생성
/*			
		System.out.print("단어 입력 > ");
		String word = scanner.next();
		System.out.println("word : " + word );
		
		System.out.println();
		
		//숫자 : nextInt()
		System.out.print("숫자 입력 : ");
		int iv = scanner.nextInt();
		System.out.println("iv : " + iv);
		
		System.out.println();
		
		//실수 : noxtDouble()
		System.out.print("실수 입력 > ");
		double dv = scanner.nextDouble();
		System.out.println("dv : " + dv);
		
		System.out.println();
*/		
		//문자 : next().charAt(index) - 가져온 단어에 charAt(index)를 적용해서 index번째 문자 사용 
		// index는 0부터 시작 -> 1번째는 0, 2번째는 1, 3번째는 2 ....
		System.out.print("문자 입력 > ");
		char ch = scanner.next().charAt(0);
//		String a = scanner.next();
//		char b = a.charAt(0);
		System.out.println("ch : " + ch);
		
		System.out.println();
		
		//문자열 : nextLine - 1의 입력의 기준이 enter임
		System.out.print("문장 입력 > ");
		scanner.nextLine();// 위에서 문자 입력후 엔터를 쳤기에 한번 소모해줘야함
		String stn = scanner.nextLine();
		System.out.println("stn : " + stn);
		
		
		
		
		
	}
}
