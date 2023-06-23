public class StaticVariableEx{
	static String clg = "Kongunadu College of Engineering and Technology";
	int rollno;
	String name;
		StaticVariableEx(int i,String j){
                             rollno = i;
			 name = j;
}
void display(){System.out.println(rollno+" "+name+" "+clg);}
	
	public static void main(String args []){
		StaticVariableEx sv = new StaticVariableEx(1908,"Praveen");
		sv.display();
		}
}
		