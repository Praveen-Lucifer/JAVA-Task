class ThisConstructor{
	String name,clg;
	int rollno;
	float fee;
		ThisConstructor(String name,int rollno,float fee){
		this.name = name;
		this.rollno = rollno;
		this.fee = fee;
		}

	ThisConstructor(String name,int rollno,float fee,String clg){
	this(name,rollno,fee);
	this.clg = clg;
	}
	
void display(){System.out.println(name+" "+rollno+" "+fee+" "+clg);}

	public static void main(String args []){
		ThisConstructor tc = new ThisConstructor("Praveen",1908,100000.986f,"KNCET");
		ThisConstructor td = new ThisConstructor("Praveen",1908,100000.986f);

tc.display();
td.display();
}

}