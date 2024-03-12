package ch02_overloading;
/*
 * ShowArray class를 정의하고 DataManager에서 테스트하시오
 * 배열 변수 값을 넘겨 받아서 해당 배열의 값을 모두 추력하는 기능을 가지고 있습니다.
 * int, char 타입 배열의 값을 각각 출력하는 메서드
 */

public class ShowArray {
	
	void PrintData(int[] a){
		for(int i=0 ; i<a.length ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	void PrintData(char[] a){
		for(int i=0 ; i<a.length ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
