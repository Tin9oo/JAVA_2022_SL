import java.io.*;
import java.net.*;
import java.util.*;

public class ServerApp {
	ArrayList<BufferedWriter> out = new ArrayList<BufferedWriter>();
	
	ServerApp() {
		try {
			ServerSocket serv = new ServerSocket(50000);
			
			while(true) {
				Socket sock = serv.accept();
				
				BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out.add(new BufferedWriter(new OutputStreamWriter(sock.getOutputStream())));
				
				new MyThread(in).start();
			}
			/*
			 * Scanner sc = new Scanner(System.in); while(true) { out.write(sc.next()+"\n");
			 * out.flush(); }
			 */
			
//			sock.close();
//			serv.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	class MyThread extends Thread {
		BufferedReader in;
		
		MyThread(BufferedReader in) {
			this.in=in;
		}
		
		public void run() {
			while(true) {
				try {
					String msg = in.readLine();
					for(int i=0; i<out.size(); ++i) {
						out.get(i).write(msg+"\n");
						out.get(i).flush();
					}
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new ServerApp();
	}

}
