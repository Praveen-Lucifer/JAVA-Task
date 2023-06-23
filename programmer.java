class Employee{
	float salary = 40000;
}

class programmer extends Employee{
	int bonus = 10000;
public static void main (String args []){
		programmer p = new programmer();
		System.out.println("Programmer Salary is: "+p.salary);
		System.out.println("Bonus of programmer is: "+p.bonus);
		}
}