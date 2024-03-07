package ch04ifelseif;

import java.util.Scanner;

public class QuizIfelseif {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 // 차량 속도를 확인해서 벌점, 과태료를 알려주는 코드를 작성하세요
	     //   0 ~ 100         0         0
	     //   101 ~ 120       0         3
         //   121 ~ 140       15        6
	     //   141 ~ 160       30        9
	     //   161 ~           60        12
//		int sp = 121;
//		
//		if (sp > 161) {
//			System.out.println("벌점 : 60점");
//			System.out.println("과태료 : 12만원");
//		} else if(sp > 140 && sp <= 160) {
//			System.out.println("벌점 : 30점");
//			System.out.println("과태료 : 9만원");
//		} else if(sp > 120 && sp <= 140) {
//			System.out.println("벌점 : 15점");
//			System.out.println("과태료 : 6만원");
//		} else if(sp > 100 && sp <= 120) {
//			System.out.println("벌점 : 0점");
//			System.out.println("과태료 : 3만원");
//		} else if(sp >= 0 && sp <= 100) {
//			System.out.println("벌점 : 0점");
//			System.out.println("과태료 : 0만원");
//		} else {
//			System.out.println("잘못된 값입니다.");
//
//		}
		
	      
	     // 몸무게(kg), 키(cm) 를 사용해서 BMI(체질량지수)를 구하는 코드를 작성하세요
		 //          몸무게(kg)
	      // BMI = ----------------
	      //        키(m) * 키(m)
	      // bmi            몸상태
	      //      ~ 18.4    저체중
	      // 18.5 ~ 22.9    정상
	      // 23.0 ~ 24.9    과체중
	      // 25.0 ~ 29.9    비만
	      // 30.0 ~         고도비만
		
		System.out.print("몸무게(kg)을 입력 > "); 
		int kg = scan.nextInt();
		System.out.print("키(cm)을 입력 > "); 
		int cm = scan.nextInt();
		
		double m = (double)cm/100;	
		double bmi = (double)kg/(m * m);
		
		System.out.printf("bmi > %.1f",  bmi); 
		
		if(bmi >= 30) {
			System.out.print("고도비만입니다."); 
		} else if(bmi >= 25 && bmi < 30){
			System.out.print("비만입니다."); 
		} else if(bmi >= 23 && bmi < 25){
			System.out.print("과체중입니다."); 
		} else if(bmi >= 18.5 && bmi < 23){
			System.out.print("정상입니다."); 
		} else if(bmi < 18.5){
			System.out.print("저체중입니다."); 
		} else {
			System.out.print("잘못된 값입니다."); 
		}
		
		
		
		
		
		
	}

}
