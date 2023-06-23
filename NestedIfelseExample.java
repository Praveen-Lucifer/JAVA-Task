import java.util.Scanner;

public class NestedIfelseExample{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter your Country");
String a = sc.nextLine();

System.out.println("Enter your Age");
int b = sc.nextInt();

if((a.equals("India"))||(a.equals("india")))
{
 
	if(b>=18)
	{
	System.out.println("Great you are perfectly Eligible to Choose your Leader");
	}

	else
	{
	System.out.println("Sorry it takes few years to Vote");
	}
}
else
{
System.out.println("Sorry only the citizens of India can choose their Leader");
}
}
}