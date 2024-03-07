package ch04ifelseif;

public class IfelseifEx02 {
	
	public static void main(String[] args) {
		
		int data = 7;
		System.out.println("data : " + data);
		
		if(data >= 1 && data <= 10) 
			System.out.println("1 ~ 10");
		if(data >= 11 && data <= 20) 
			System.out.println("10 ~ 20");
		if(data >= 21 && data <= 30) 
			System.out.println("20 ~ 30");
		
		
		if(data <= 10)
			System.out.println("1 ~ 10");
		else if(data <= 20)
			System.out.println("10 ~ 20");
		else if(data <= 30)
			System.out.println("20 ~ 30");
			
		}
		
	
	}


