import java.util.*;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

class Client
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		DatagramSocket ds=new DatagramSocket();
		InetAddress ip=InetAddress.getLocalHost();
		byte arr[]=null;
		String str;
		System.out.println("Enter String to be Sent: ");
		str=sc.nextLine();
		arr=str.getBytes();
		DatagramPacket dp=new DatagramPacket(arr,arr.length,ip,8888);
		ds.send(dp);
		System.out.println("String sent from P1");
	}
}
