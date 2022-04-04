import helper.HelpMethod;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("localhost", 5000);
        try(SocketChannel client = SocketChannel.open(address)){
            chatServer(client);
        }catch(IOException e){
            System.err.println("Error : " + e.getMessage());
        }finally{
            System.out.println("Done.");
        }
    }
        private static void chatServer(SocketChannel channel){
            String a,b,calculation,response;
            Scanner input = new Scanner(System.in);
            try{

                    System.out.print("Nhập phép tính: ");  calculation = input.nextLine(); 
                    // 1 + 2 Enter
                    HelpMethod.SendMessage(channel, calculation);
                    
                    System.out.println("Đợi tin nhắn từ Server ...");
                    response = HelpMethod.Recevie(channel);
                    System.out.println("SERVER> " + response);
                    channel.close();

            }catch(IOException ioEx){
                System.err.println("Error : " + ioEx.getMessage());
            }
        }
}
