
public class ArrayEx03 {

	public static void main(String[] args) {
		int[] iar = new int[5];
				
		int idx = 0;
		iar[idx] = 10;
		System.out.println("iar["+ idx + "]" + iar[idx]);
		
		System.out.println("iar 크기 : " + iar.length);
		System.out.println("tar : " + iar);
		
		// 배열 전체 요소 접근
		for(int i = 0 ; i<iar.length ; i++) {
			System.out.println("iar[" + i + "] : " + iar[i]);
			
			
		}
		
	}

}
