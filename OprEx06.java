/*
 * 
 * 
 * 
 */
public class OprEx06 {
	public static void main(String[] args) {
		int va = 5, vb = 2;
		System.out.println("va : " + va + " - vb : " + vb);
		System.out.println();
		
		double div;
		div = va / vb;
		System.out.println("div1 : " + div);
		//int랑 int로 계산했기에 값도 2.5가 아님 int값 2가 나옴
		
		double da = 2;
		div = va / da; 
		System.out.println("div2 : " + div);
		
		double ad = 5;
		div = ad / vb;
		System.out.println("div3 : " + div);
		//int랑 double 이런식으로 서로 맞지 않는 자료형이 연산처리될경우 작은쪽이 자동으로 큰쪽으로 형변환하여 계삼 됨
		
		
		//강제 형변환
		//사용하려는 데이터 왼쪽에 '(변환자료형)'을 써주면 실행시 ()안의 자료형으로 형변환되어 실행된다.
		div = (double)va / vb;
		System.out.println("div4 : " + div);

	}
}
