package Chat;

import java.io.*;
import java.net.*;

public class Chat_Client {
	
	public static void main(String[] args) throws Exception {
	
		Socket s = new Socket("localhost", 9999);
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String msgout = "";
		String myName = "Naufal";
		
		do {
			msgout = myName + "-" + br.readLine();
			dout.writeUTF(msgout);
			dout.flush();
		} while (!msgout.equals("bye"));
		
		dout.close();
		s.close();
		System.exit(0);	
	}
}	
