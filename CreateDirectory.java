import java.io.*;
public class CreateDirectory{
	public static void main(String args []){
		String dir = "C:\\Users\\madha\\OneDrive\\Desktop\\text";
		File f = new File(dir);
		f.mkdirs();
}
}