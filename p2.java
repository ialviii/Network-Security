import java.util.*;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

class MiddleMan
{
	public static void main(String args[]) throws IOException
	{
		DatagramSocket ds=new DatagramSocket(8888);
		DatagramSocket ds1=new DatagramSocket();
		InetAddress ip=InetAddress.getLocalHost();
		byte arr[]=new byte[65535];
		byte arr1[]=new byte[65535];
		String str;
		DatagramPacket dp=new DatagramPacket(arr,arr.length);
		ds.receive(dp);
		str=new String(arr).trim();
		System.out.println("String received by P2 "+str);
		if(str.length()>100)
		{
			arr1=str.getBytes();
			DatagramPacket dp1=new DatagramPacket(arr1,arr1.length,ip,8080);
			ds1.send(dp1);			
		}
		else
		{
			System.out.println("String Not Sent!");
			//System.out.println("Illegal Word is used in the String to be sended: "+checkString(s));
		}		
	}
	
	/* public static String checkString(String s)throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("keywords.txt"));
		String temp="";
		while((temp=br.readLine())!=null)
		{
			if((s.toUpperCase()).contains(temp))
			{
				return temp;
			}
		}
		return null;
	} */
}
