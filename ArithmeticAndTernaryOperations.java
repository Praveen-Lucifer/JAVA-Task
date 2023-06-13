import java.util.Scanner;

public class ArithmeticAndTernaryOperations{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the First Value");
int a = sc.nextInt();

System.out.println("Enter the Second Value");
int b = sc.nextInt();

System.out.println("Sum of First and Second Value is " + (a+b));

System.out.println("Difference between First and Second Value is " + (a-b));

System.out.println("Product of First and Second Value is " + (a*b));

System.out.println("Division Quotient of First and Second Value is " + (a/b));

System.out.println("Division Reminder of First and Second Value is " + (a%b));

System.out.println((a>b)?true:false);

}
}