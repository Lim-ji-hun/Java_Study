



package ch04_quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 클라이언트가 서버로 보낸 데이터를 서버가 받아서 더하는 코드를 작성하세요
 * 클라이언트로 부터 -(minus) 값이 전송되면 계산을 멈추고 종료합니다
 */

public class CalcServer {

	public static void main(String[] args) {
		
		// 서버
		ServerSocket listener = null;
		Socket socket = null;
		BufferedReader serverIn = null;
		BufferedWriter serverOut = null;
		int tot = 0; // 합
		
		try {
			
			listener = new ServerSocket(10000); // 서버 소켓 생성
			System.out.println("- 계산 준비 -");
			
			socket = listener.accept(); // 클라이언트로 부터 연결 요청 대기
			
			// 스트림 생성
			serverIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));   // 서버 수신
			serverOut = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));// 서버 송신
			
			String serverReceive = null;
			while(true) {
				serverReceive = serverIn.readLine(); // 클라이언트가 전송한 데이터 가져오기
				int value = Integer.parseInt(serverReceive);
				if(value < 0) {
					serverOut.write("총합 : " + tot + "\n");
					serverOut.flush();
					break;
				}
				tot += value;
				serverOut.write("합 : " + tot + "\n");
				serverOut.flush();
				
			}
			
		} catch (Exception e) {
			System.out.println("서버 error~");
		} finally {
			try {
				if(serverIn != null) serverIn.close();
				if(serverOut != null) serverOut.close();
				if(socket != null) socket.close();
				if(listener != null) listener.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
















