package ch02_overloading;

/*
 * Max class를 정의하고 DataManager에서 테스트 하시오
 * 두개의 값을 넘겨받고 두수중 큰값을 찾아 반환받는 기능
 * -> 정수와 실수타입 각각의 메서드
 * 
 */
class Max {
	void BigData(int a, int b) {
		System.out.println("-addData(int a, int b) - ");
		if(a>b) {
			int c = a;
			resultData(c);
			}else if(a<b) {
				int c = b;
				resultData(c);
			}
		}
	
	
	void resultData(int c) {
		System.out.println("둘중 더 큰수 : " + c);
		}
	
	void BigData(double a, double b) {
		System.out.println("-addData(double a, double b) - ");
		if(a>b) {
			double c = a;
			resultData(c);
			}else if(a<b) {
				double c = b;
				resultData(c);
			}
		}
	void resultData(double c) {
		System.out.println("둘중 더 큰수 : " + c);
		}

}


