package ch01_basic;

public class MonitorManager {
	public static void main(String[] args) {
		
		Monitor proA = new Monitor();
		proA.company = "LG";
		proA.size = "24";
		proA.panel = "평면";
		proA.info();
		
		System.out.println();
		
		Monitor proB = new Monitor();
		proB.setInfo("삼성", "27", "커브드");
		proB.info();
		
		
	}

}
