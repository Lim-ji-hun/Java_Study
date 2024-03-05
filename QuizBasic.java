
public class QuizBasic {
	public static void main(String[] args) {
		
		  // 아래의 내용을 변수에 저장해서 출력하는 코드를 작성하세요
	      // - String : 이름, 주소
	      //   int    : 생일(년, 월, 일), 나이
	      //   char   : 성별(m, f)
	      //   double : 키
	      //
	      // Ex) --- 고 객   정 보 ---
	      //     이름 : test
	      //     주소 : 서울시 강남구
	      //     생일 : 2004년 3월 5일
	      //     나이 : 20 세
	      //     성별 : m
	      //     키   : 178.9 cm
		
		System.out.println("--- 고객 정보 ---");
		
		String Name = "임지훈", Home = "선화로 10길 17";
		int Year = 2002, Mon = 12, Day = 23, Old = 23;
		char Gender = 'M';
		double Height = 173.6;
		
		/*
		System.out.println("이름 : " + Name);
		System.out.println("주소 : " + Home);
		System.out.println("생일 : " + Year + "년" + " " + Mon + "월" + " " + Day + "일" );
		System.out.println("나이 : " + Old);
		System.out.println("성별 : " + Gender);
		System.out.println("신장 : " + Height + "cm");
		*/
		
		
		System.out.println("이름 : " + Name + "\n주소 : " + Home + "\n생일 : " + Year + "년" + " " + Mon + "월" + " " + Day + "일" + "\n나이 : " + Old + "\n성별 : " + Gender + "\n신장 : " + Height + "cm");
		
		
	}
	
}
