import java.util.Random;
import java.util.Scanner;

public class QuizArray {

	public static void main(String[] args) {
		
		Random random = new Random();
		
//		int[] point = new int[5];
//		// 위 배열을 1 ~ 20 사이의 값으로 설정하고, 확인하는 코드를 작성하세요
//		// 위 배열의 전체 평균을 구하고, 평균보다 높은 데이터 수를 구하는 코드를 작성하세요
//		
//		// 설정, 합
//		int tot = 0;
//		for(int i=0 ; i<point.length ; i++) {
//			point[i] = random.nextInt(20) + 1;
//			tot += point[i];
//		}
//		
//		// 확인
//		for(int i=0 ; i<point.length ; i++) {
//			System.out.print(point[i] + " ");
//		}
//		System.out.println();
//		System.out.println("합 : " + tot);
//		
//		// 평균
//		double avg = (double)tot/point.length;
//		System.out.printf("평균 : %.1f\n", avg);
//		
//		System.out.println();
//		
//		System.out.println("- 평균 보다 높은 데이터 -");
//		int avgUp = 0;
//		for(int i=0 ; i<point.length ; i++) {
//			if(point[i] > avg) {
//				++avgUp;
//				System.out.print(point[i] + " ");
//			}
//		}
//		System.out.println();
//		System.out.println("데이터 수 : " + avgUp);
		
		
		//-----------------------------------------------------------
		
//		Scanner scanner = new Scanner(System.in);
//		int size = 10;
//		int[] base = new int[size];
//		// base 배열의 요소를 1부터 1씩 증가시키면서 순서대로 값을 설정하는 코드를 작성하세요
//		// 숫자 하나를 입력받고, base 배열의 각 요소의 값을 입력받은 수만큼 증가시키는 코드를 작성하세요
//		for(int i=0 ; i<base.length ; i++) {
//			base[i] = i + 1;
//		}
//		
//		System.out.print("base : ");
//		for(int i=0 ; i<base.length ; i++) {
//			System.out.print(base[i] + " ");
//		}
//		System.out.println();
//		
//		// 증가
//		System.out.print("증가값 입력 > ");
//		int increase = scanner.nextInt();
//		
//		for(int i=0 ; i<base.length ; i++) {
//			base[i] += increase;
//		}
//		
//		System.out.print("base    : ");
//		for(int i=0 ; i<base.length ; i++) {
//			System.out.print(base[i] + " ");
//		}
//		System.out.println();
//		
//		
//		int[] reverse = new int[size];
//		// base 배열의 값을 reverse 배열에 역순으로 저장하는 코드를 작성하세요
//		// Ex) base    :  5  6  7  8  9
//		//     reverse :  9  8  7  6  5
//		for(int i=0 ; i<base.length ; i++) {
//			reverse[base.length-1-i] = base[i];
//		}
//		
//		System.out.print("reverse : ");
//		for(int i=0 ; i<reverse.length ; i++) {
//			System.out.print(reverse[i] + " ");
//		}
//		System.out.println();
		
		
		//--------------------------------------------------
		
//		int range = 10;
//		int[] data = new int[range];
//		// 위 배열을 1 ~ 10 사이의 랜덤값으로 설정하는 코드를 작성하세요
//		// - 중복값은 들어갈 수 없습니다
//		int cnt = 0;
//		for(int i=0 ; i<data.length ; i++) {
//			data[i] = random.nextInt(range) + 1;
//			// 중복 확인 : 현재 요소의 값이 이전 요소에 있는지 확인
//			for(int b=0 ; b<i ; b++) {
//				if(data[b] == data[i]) {
//					--i;
//					break;
//				}
//				++cnt;
//			}
//		}
//		System.out.println("cnt : " + cnt);
//		System.out.println();
//		
//		for(int i=0 ; i<data.length ; i++) {
//			System.out.printf("%5d", data[i]);
//			if((i+1)%10 == 0)
//				System.out.println();
//		}
//		System.out.println();

		
		//------------------------------------------------------
		
		
		int no = 0;
		int[][] mat = new int[5][5];
		
		//  1  2  3  4  5
		//  6  7  8  9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		no = 1;
		for(int i=0 ; i<mat.length ; i++) {
			for(int j=0 ; j<mat.length ; j++) {
				mat[i][j] = no;
				++no;
			}
		}
		
		for(int i=0 ; i<mat.length ; i++) {
			for(int j=0 ; j<mat.length ; j++) {
				System.out.printf("%3d", mat[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		//  1  6 11 16 21
		//  2  7 12 17 22
		//  3  8 13 18 23
		//  4  9 14 19 24
		//  5 10 15 20 25
		no = 1;
		for(int i=0 ; i<mat.length ; i++) {
			for(int j=0 ; j<mat.length ; j++) {
				mat[j][i] = no;
				++no;
			}
		}
		
		for(int i=0 ; i<mat.length ; i++) {
			for(int j=0 ; j<mat.length ; j++) {
				System.out.printf("%3d", mat[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
}

























