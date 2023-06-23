class ThisEx{
	int rollno;
	String name;
	float fee;

		ThisEx(int rollno, String name, float fee){
			this.rollno = rollno;
			this.name = name;
			this.fee = fee;
		}

void display(){System.out.println(rollno+" "+name+" "+fee);}
	
	public static void main(String args []){
		ThisEx te = new ThisEx(111,"Praveen",10000.9565F);
	te.display();
}
}