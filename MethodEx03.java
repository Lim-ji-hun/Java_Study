
public class MethodEx03 {
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		LifeTestA();
		System.out.println("arr[0] : " + arr[0]);
		
		LifeTestB(arr);
		System.out.println("arr[0] : " + arr[0]);
		
		arr = LifeTestC();
		System.out.println("arr[0] : " + arr[0]);
		
		
	}
	
	public static void LifeTestA() {
		int[] arr = new int[3];
		arr[0] = 10;
	}
	
	public static void LifeTestB(int[] arr) {
		arr[0] = 7;

	}
	
	public static int[] LifeTestC() {
		int[] arr = new int[3];
		arr[0] = 10;
		return arr;
//      =
//		return new int[3];
		
	}
	
	

}
