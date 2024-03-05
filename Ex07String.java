
public class Ex07String {
	public static void main(String[] args) {
		
		//문자열 : String - 문자열을 기본자료형처럼 다루게 해주는 class
		String stnA = "hi~";
		System.out.println("stnA : " + stnA);
		
		stnA = "데이터 수정";
		System.out.println("stnA : " + stnA);

		String textA = "new";
		String textB = "jave";
		String title = textA + " " + textB;
		System.out.println("title : " + title);
		
		System.out.println("title 문자수 : "+ title.length());
	}

}
