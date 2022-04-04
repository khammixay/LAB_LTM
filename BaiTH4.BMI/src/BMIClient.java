import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class BMIClient {

	public static void main(String[] args) {
		
		try {
			ServerSocket socketServer = new ServerSocket(8989);
			System.out.println("I'm listening on 8989 port....");
			while (true)
		{	
				
				Socket socketClient = socketServer.accept();  
				System.out.print("Client:"+socketClient.getInetAddress().getHostAddress().toString());
				OutputStream osToClient = socketClient.getOutputStream();
				OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
				BufferedWriter buffWrite  = new BufferedWriter(write2Client);

			   
		}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
