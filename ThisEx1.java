class ThisEx1{
	void M1(){System.out.println("Power");}
void M2(){
M1();{System.out.println("Display");}
}

public static void main(String args []){
	//ThisEx1 th = new ThisEx1();
	new ThisEx1().M2();
}
}	