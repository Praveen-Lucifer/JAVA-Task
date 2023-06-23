public class ArrayExample{
	public static void main(String args []){
		int a [] = { 1,2,3,4,5,6,7,8,9 };
		int b = 10;
	for (int x=0; x<a.length;x++){
		b += a[x];
	}
	System.out.println(b);
}
}