package Day_9;

import java.util.Scanner;

public class Greedy_Algorithm {
	
//	거스름 돈 n이 있고, 500원, 100원, 50원, 10원으로만 거슬러 주어야 할 때, 최소 개수의 동전으로 거슬러 주고, 동전의 개수를 구하는 문제이다.

	public static void main(String[] args) {
		
		
		System.out.print("금액을 입력 >> ");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		
		int count = 0;
		
		int[] type = {500, 100, 50, 10};
		
		for(int i = 0 ; i<type.length ; i++) {
			count += money/type[i];
			money = money%type[i];
		}
		
		System.out.println("총 동전의 샛수 : " + count + "개");
		
		
		
	}

}
