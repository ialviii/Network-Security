import java.util.*;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

class Server
{
	public static void main(String args[]) throws Exception
	{
		DatagramSocket ds=new DatagramSocket(8080);
		InetAddress ip=InetAddress.getLocalHost();
		byte arr[]=new byte[65535];
		String str;
		DatagramPacket dp=new DatagramPacket(arr,arr.length);
		ds.receive(dp);
		str=new String(arr).trim();
		System.out.println("String received: in P3 : "+str);		
	}
}
