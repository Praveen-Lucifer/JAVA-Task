import java.util.Scanner;

public class ComparisionOperatior{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the First Value");
int a = sc.nextInt();

System.out.println("Enter the Second Value");
int b = sc.nextInt();

System.out.println(a>b);

System.out.println(a<b);

System.out.println(a<=b);

System.out.println(a>=b);

System.out.println(a!=b);

}
}