import java.io.BufferedWriter;
import java.net.ServerSocket;

public class socket {

	}

	public static void main(String[] args) {
	try {
	
		ServerSocket socketserver = new serversocket(8888);
	    System.out.println("i,m listening on 8888 port...");
	while (true)
	{
		socket socketclient = socketserver.accept();
		outputstream ostoclien = socketclient.getoutputstream();
		outputstreamwriter writerclient=socketclient.equals(socketclient)
	BufferedWriter buffw = new bufferedwriter(write2client);
		buffw.write("XIN CHAO N\");");
		buffw.write();
		socketClient.close();
	}

}
