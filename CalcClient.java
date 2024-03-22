



package ch04_quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 클라이언트
		Socket socket = null;
		BufferedWriter clientOut = null;
		BufferedReader clientIn = null;
		
		try {
			socket = new Socket("localhost", 10000);
			System.out.println("서버 연결...");
			
			// 출력 스트림
			clientOut = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 클라이언트 송신
			clientIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));    // 클라이언트 수신
			
			String clientTransmit = null;
			while(true) {
				System.out.print("숫자 입력 > ");
				clientTransmit = scanner.nextLine();
				
				try {
					// 입력값이 숫자 형태인지 확인
					int data = Integer.parseInt(clientTransmit);
					
					// 정상이면 전송
					clientOut.write(clientTransmit + "\n");
					clientOut.flush();
					
					String calcResult = clientIn.readLine(); // 서버 계산 결과
					System.out.println(calcResult);
					
					if(data < 0)
						break;
					
				} catch (Exception e) {
					System.out.println("숫자 형태의 값을 입력하세요~");
				}
				
			}
			
		} catch (Exception e) {
			System.out.println("클라이언트 error-");
		} finally {
			try {
				if(clientIn != null) clientIn.close();
				if(clientOut != null) clientOut.close();
				if(socket != null) socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}

























