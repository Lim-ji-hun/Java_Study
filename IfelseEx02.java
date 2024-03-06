package ch02_ifelse;

public class IfelseEx02 {
	public static void main(String[] args) {
		int point = 1000;
		System.out.println("현재 포인트 : " + point);
		
		if(point >= 3000) {
			System.out.println("아이템 구매");
			point -= 3000;
		} else {
			System.out.println("포인트 부족");
		}
		System.out.println("현재 포인트 : " + point);
		
		
	}
}
