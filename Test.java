import java.io.*;
public class Test{
	public static void main(String args [])throws IOException{
		DataInputStream dis = new DataInputstream(new FileInputStream("C:\\Users\\madha\\OneDrive\\Desktop\\Java\\Class Task\\Test.txt"));
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\madha\\OneDrive\\Desktop\\Java\\Class Task\\Test.txt"));
		String count;
		while((count = dis.readline()) !=null){
		Steing data = count.toUpperCase();
		System.out.println(data);
		dos.writeBytes(data + ",");
	}
	dis.close();
	dos.close();
	}
}