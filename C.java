class A{
	void msg(){System.out.println("Hi");}
}

class B{
	void msg(){System.out.println("Hello");}
}

class C extends A,B{
	public static void main(String args []){
	C obj = new C();
	obj.msg();
	}
}
