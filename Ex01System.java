import java.io.IOException;

/*
 * System.in.read()
 * - 키보드로 입력한 값을 1byte 단위로 처리함
 * 
 */
public class Ex01System {
	public static void main(String[] args) throws IOException {
		
		System.out.println("키보드로 값을 입력하세요 > ");
		int iv = System.in.read();
		//byte단위로 받지만 프로그램 자테에서는 int로 처리함
		System.out.println("iv : " + iv);
		
		char ch = (char)iv;
		System.out.println("ch : " + ch);
		
//		int r = System.in.read();
//		int n = System.in.read();
//		System.out.println(r+ " , " + n);
		System.in.skip(2);
		System.out.println();
		
		//enter키는 \n 2개의 값으로 되어있음 하여 \와n2개의  
		
		System.out.println("문자 입력 > ");
//		int a = System.in.read();
//		System.out.println("a : " + (char)a);
		
		char a = (char)System.in.read();
		System.out.println("a : " + a);
		
		System.in.skip(2);
		System.out.println();
		
		System.out.print("숫자 입력 > ");
		int num = System.in.read() - 48;//0~9까지만 가능
		System.out.println("num : " + num);
		
		System.out.println();
		System.out.println("--end--");
		
		
		
	}
}
