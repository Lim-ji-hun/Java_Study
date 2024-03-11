
public class ArrayEx05 {
	public static void main(String[] args) {
		
		int[] data = new int[5];
		for(int i =0 ; i<data.length ; i++) {
			data[i] = i+1;
			System.out.println("data[" + i + ']' + data[i]);
		}
		System.out.println();
		
		int[] sub = data;
		System.out.println("data[1] : " + data[1]);
		System.out.println("sub[1] : " + sub[1]);
		
		sub[1] = 7;
		System.out.println("data[1] : " + data[1]);
		System.out.println("sub[1] : " + sub[1]);
	}
}
