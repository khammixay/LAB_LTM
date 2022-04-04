/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */
	package helper;

	import java.io.FileNotFoundException;
	import java.nio.ByteBuffer;
	import java.nio.channels.SocketChannel;
	import java.io.IOException;
	import java.io.RandomAccessFile;
	import java.nio.channels.FileChannel;
	import java.nio.charset.StandardCharsets;
	import java.nio.file.Paths;
	import java.nio.file.StandardOpenOption;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.Scanner;
	import jdk.dynalink.StandardOperation;
	/**
	 *
	 * @author dinhc
	 */
	public class HelpMethod {
	    public static String Recevie(SocketChannel channel) throws IOException{
	        ByteBuffer buffer = ByteBuffer.allocate(1024);
	        String message = "";
	        char byteRead;
	        while(channel.read(buffer)>0)
	        {
	            buffer.flip();
	            int limit = buffer.limit();
	            while(buffer.hasRemaining())
	            {
	                byteRead = (char)buffer.get();
	                message += byteRead;
	                
	            }
	            if(limit <buffer.capacity())
	                break;
	            else
	                buffer.clear();
	        }
	        return message;
	        
	    }
	    public static String receiveMassage2(SocketChannel channel) throws IOException{
	        ByteBuffer buffer = ByteBuffer.allocate(1024);
	        buffer.clear();
	        channel.read(buffer);
	        buffer.flip();
	        int limit = buffer.limit();
	        String message = new String(buffer.array(),0, limit, StandardCharsets.UTF_8);
	        return message;
	    }

	  
	    
	    public static  void SendMessage(SocketChannel chanel, String message) throws IOException
	    {
	        //ByteBuffer buffer = ByteBuffer.allocate(message.length());
	        //buffer.put(message.getBytes());
	        ByteBuffer buffer = ByteBuffer.wrap(message.getBytes(StandardCharsets.UTF_8));
	        //buffer.flip();
	        chanel.write(buffer);
	        System.out.println("Gửi: " + message);
	        
	    }
	    public static void SendMess2(SocketChannel channel, String message) throws IOException{
	        ByteBuffer buffer = ByteBuffer.wrap(message.getBytes(StandardCharsets.UTF_8));
	        //ByteBuffer buffer = ByteBuffer.allocate(message.length());
	        //buffer.put(message.getBytes());
	        //buffer.flip();
	        channel.write(buffer);
	    }
	    public static void writeLog(String path, String message, String type) throws  IOException{
	      /* Calendar dateTime = Calendar.getInstance();
	      
	       //Date dateTime = new Date();
	       StringBuilder builder = new  StringBuilder();
	       builder.append(dateTime.get(Calendar.YEAR));
	       builder.append("-"); 
	       builder.append(dateTime.get(Calendar.MONTH)+1);
	       builder.append("-");
	       builder.append(dateTime.get(Calendar.DATE));
	       builder.append(":");
	       builder.append(dateTime.get(Calendar.HOUR_OF_DAY));
	       builder.append(":");
	       builder.append(dateTime.get(Calendar.MINUTE));
	       builder.append(":");
	       builder.append(type);
	       builder.append("-");
	       builder.append(message);
	       builder.append("\n");
	       FileChannel channel = FileChannel.open(Paths.get(path), StandardOpenOption.APPEND);
	       ByteBuffer buffer =ByteBuffer.wrap(builder.toString().getBytes(StandardCharsets.UTF_8));
	       channel.write(buffer);
	       channel.close();*/
	    }
	    public static void luu(String a) throws FileNotFoundException, IOException {
	        String path ="C:\\Users\\dinhc\\OneDrive\\Documents\\NetBeansProjects\\60CNTT3\\src\\nio\\data\\output1.txt";
	        RandomAccessFile file = new RandomAccessFile(path, "rw");
	        FileChannel fileChannel = file.getChannel();
	        ByteBuffer buffer = ByteBuffer.allocate(1024);
	        buffer.clear();
	        buffer.put(a.getBytes());
	        buffer.flip();
	        fileChannel.close();
	        file.close();
	        StringBuilder builder = new StringBuilder();
	        builder.append(a);
	        FileChannel channel = FileChannel.open(Paths.get(path), StandardOpenOption.APPEND);
	        channel.write(buffer);
	        channel.close();
	        
	    }
	/*
	    public static void Recevie(SocketChannel sc, String message) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

	    public static void receiveMassage2(SocketChannel sc, String string) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

	   */ 

	    public static void luu(String path, String message, String string) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

	    

	}

