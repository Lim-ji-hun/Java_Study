import java.util.Scanner;

public class ArrayEx04 {
	public static void main(String[] args) {
		
		int size = 3;
		int[] exA = new int[size];
		System.out.println("exA 크기 : " + exA.length);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("배열 크기 입력 > ");
		int arrsize = scanner.nextInt();
		
		int[] arr = new int[arrsize];
		System.out.println("arr크기 : " + arr.length);
	}
}
