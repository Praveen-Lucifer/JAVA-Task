import java.util.Scanner;

public class AssignmentOperatior{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the Value");
int a = sc.nextInt();

System.out.println("Enter the Value");
int b = sc.nextInt();

System.out.println(a==b);

System.out.println(a+=5);

System.out.println(a-=5);

System.out.println(a*=5);

System.out.println(a/=5);

System.out.println(a%=5);

}
}