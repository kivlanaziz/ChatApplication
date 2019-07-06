package Chat;

import java.net.*;
import java.io.*;

public class Chat_Server {
	
	public static void main(String[] args) throws Exception {
		
		ServerSocket ss = new ServerSocket(9999);
		Socket s = ss.accept();
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		String msgin = "";
		String[] msg;
		
		do {
			msgin = din.readUTF();
			msg = msgin.split("-");
			System.out.println(String.format("%s : %s", msg[0], msg[1]));
		} while (!msg[1].equals("bye"));
		
		din.close();
		s.close();
		ss.close();
	}
}
