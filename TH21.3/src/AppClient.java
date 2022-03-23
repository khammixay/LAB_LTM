
public class AppClient {

	public AppClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	socket soc = new socket ("localhost",8888);
	System.out.print("connected!");
	InputStream in = soc.getInputStream();
	InputStreaamReader inReader = new InputStreaamReader(in);
	BufferedReader buff= new BufferedReader(inReader);
	System.out.print(buff.readLine());
} catch (INEXCEPTION e) {
	
}
    e.printStackTrace();
	}

}
