import java.io;
public class FilesAndIO{
	public static void main(String arge []) throws IOException{
		String c;
		BufferedReader br = new BufferReader(new InpurStreamReader(System.in));
		System.out.println("Enter 'end' to quit: ");
		do{
			c = (char) br.readLine();
			System.out.println(c);
}while(!c.equals("end"));
}
}	