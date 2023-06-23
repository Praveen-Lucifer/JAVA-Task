public class StaticVariableEx1{
	int rollno;
	String name;
	static String clg = "KNCET";
		StaticVariableEx1(int i,String j){
			rollno = i;
			name = j;
}
static void change(){clg = "KCT";}

void display(){System.out.println(rollno+" "+name+" "+clg);}
}

public class StaticVariableEx2{
		public static void main(String args []){

	StaticVariableEx1.change();
	
StaticVariableEx1 sv = new StaticVariableEx1(1908,"Praveen");

	sv.display();
}
}

	