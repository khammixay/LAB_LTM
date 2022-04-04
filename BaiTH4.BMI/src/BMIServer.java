    import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	import java.io.OutputStream;
	import java.io.OutputStreamWriter;
	import java.net.ServerSocket;
	import java.net.Socket;

	public class BMI_Server {

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
					   
					InputStream in = socketClient.getInputStream();
					InputStreamReader inReader = new InputStreamReader(in);
					BufferedReader buffRead = new BufferedReader(inReader);
					   
					String chuoiHello_Gui="Hello";
					buffWrite.write(chuoiHello_Gui+ "\n");
					buffWrite.flush();
					
					
				    String chuoiXinchao_Nhan = buffRead.readLine();
				    String chuoiHoiTen="Bạn tên gì? \n";
				    buffWrite.write(chuoiHoiTen+ "\n");
				    buffWrite.flush();
				    String chuoiTen_Nhan = buffRead.readLine();
				    String chuoiHoiChieuCao="Bạn cao bao nhieu cm? \n";
				    buffWrite.write(chuoiHoiChieuCao+ "\n");
				    buffWrite.flush();	
				    String chuoiChieuCao = buffRead.readLine();
				    String chuoiHoiCanNang="Bạn nặng bao nhieu kg? \n";
				    buffWrite.write(chuoiHoiCanNang+ "\n");
				    buffWrite.flush();
				    String chuoiCanNang = buffRead.readLine();
				    String chuoiNoiToiDangTinh ="Tôi đang tính toán ...";
				    buffWrite.write(chuoiNoiToiDangTinh+ "\n");
				    buffWrite.flush();
				    
				    String chuoiKQ_Gui = "Bạn béo phì độ X";
				    buffWrite.write(chuoiKQ_Gui+ "\n");
				    buffWrite.flush();			    
					
				    
                  //socketClient.close();
				}
				//socketServer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

