package ch01_basic;

public class Monitor {
	
	String company;
	String size;
	String panel;
	
	void setInfo(String _company, String _size, String _panel) {
		company = _company;
		size = _size;
		panel = _panel;
		
		
	}
	
	
	void info() {
		System.out.println("---모니터 정보---");
		System.out.println("제조회사 : " + company);
		System.out.println("화면크기 : " + size + "인치");
		System.out.println("패널형태 : " + panel);
	}
	
	
	
	

}
