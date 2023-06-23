public class MethodExample{

	public int myMethod(int a,int b){
		System.out.println(a+b);
		return a+b;
	}

	public static void main(String args []){
		MethodExample me = new MethodExample();
		me.myMethod(10,15);
	}	


}
