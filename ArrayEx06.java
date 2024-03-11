import java.util.Random;

public class ArrayEx06 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] value = new int[5];
		
		//갑 설정
		for(int i=0 ; i<value.length ; i++) {
			value[i] = random.nextInt(30) + 1;
		}
		
		//갑 확인
		System.out.println("---value array---");
		for(int i=0 ; i<value.length ; i++) {
			System.out.println("value[" + i + "] : " + value[i] );
		}
		
		System.out.println();
		
		//10~20 사이의 데이터 수
		int count = 0;
		for(int i=0 ; i<value.length ; i++) {
			if(value[i] >= 10 && value[i] <= 20) {
				++count;
				System.out.print(value[i] + " ");
			}
		}
		System.out.println();
		System.out.println("10~20 사이의 데이터 수 : "+count);
		
		System.out.println();
		
		//전체의 합
		int tot = 0;
		for(int i=0 ; i<value.length ; i++) {
			tot += value[1];
		}
		System.out.println("전체의 합 : " + tot);
		
		//큰값 찾기
		int max = 0; // 큰값 위치
		for(int i=1 ; i<value.length ; i++) {
			if(value[i] > value[max]) {
				max = i;
			}
		}
		System.out.println("큰값 위치 : " + max);
		System.out.println("큰값 : " + value[max]);
		
		
		
	}
}
