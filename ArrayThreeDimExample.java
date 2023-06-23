public class ArrayThreeDimExample{
	public static void main(String args []){
		int a [] [] [] = { { {0,1,5,8},{1,2,8,2} },{ {5,6,7,9},{7,9,6,9} } };
	for (int x=0; x<a.length;++x){
		for (int y=0;y<a[x].length;++y){
			for (int z=0;z<a[x][y].length;z++){
			System.out.print(a[x][y][z]+" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}
	
}
}