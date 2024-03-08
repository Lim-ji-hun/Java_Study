import java.util.Scanner;
import java.util.Random;

public class QuizRockPaperSciccors {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int win = 0;
		int lose = 0;
		boolean a = true;
		
		while(a) {
			System.out.print("1.가위 2.바위 3.보 중 하나를 입력 >> ");
			int my = scan.nextInt();
			if(my == 1 || my==2 || my==3) {
				int ch = (random.nextInt(3) + 1);
				System.out.println("컴퓨터 : " + ch);
				
				if(my == ch) {
					System.out.println("무승부입니다.");
				}else if(my == 1 && ch == 2) {
					System.out.println("패배");
					lose += 1;
				}else if(my == 1 && ch==3) {
					System.out.println("승리");
					win += 1;
				}else if(my == 2 && ch == 1) {
					System.out.println("승리");
					win += 1;
				}else if(my == 2 && ch==3) {
					System.out.println("패배");
					lose += 1;
				}else if(my == 3 && ch == 1) {
					System.out.println("패배");
					lose += 1;
				}else if(my == 3 && ch == 2) {
					System.out.println("승리");
					win += 1;
				}
			} else {
				System.out.println("다시 입력하시오");
			}
			
			if(win == 3) {
				a = false;
				System.out.println("3회 승리");
			}else if (lose == 3) {
				a = false;
				System.out.println("3회 패배");
			}
		}
	}
}
