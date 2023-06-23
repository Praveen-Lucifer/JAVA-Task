class ThrowsExample{
	public static void myMethod(int i)throws Exception{
		i = i/0;
	}

	public static void main(String args [])throws Exception{
		myMethod(5);
	}
}