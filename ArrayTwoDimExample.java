public class ArrayTwoDimExample{
	public static void main(String args []){
		int a [] [] = { {0,1,5,8},{1,2,8} };
	for (int x=0; x<a.length;++x){
		for (int y=0;y<a[x].length;++y){
			System.out.print(a[x][y]);
		}
	}
	
}
}