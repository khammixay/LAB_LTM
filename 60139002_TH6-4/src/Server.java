
public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 public final static int SERVER_PORT = 7;
		 
		    public static void main(String[] args) throws IOException {
		        ServerSocket serverSocket = null;
		        try {
		            serverSocket = new ServerSocket(SERVER_PORT);
		            System.out.println("Server started: " + serverSocket);
		            System.out.println(client ...");
		            while (true) {
		                try {
		                    Socket socket = serverSocket.accept();
		                    System.out.println("Client accepted: " + socket);
		 
		                    OutputStream os = socket.getOutputStream();
		                    InputStream is = socket.getInputStream();
		                    int ch = 0;
		                    while (true) {
		                        ch = is.read(); // Receive data from client
		                        if (ch == -1) {
		                            break;
		                        }
	}


