import java.util.Scanner;

public class IfelseExample{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter your Mark");

int a= sc.nextInt();
if(a<35){
System.out.println("Sorry your grade is F");
}
else if((a>=35)&&(a<75)){
System.out.println("Good your grade is B");
}
else if((a>=75)&&(a<90)){
System.out.println("Great your grade is A");
}
else if((a>=90)&&(a<100)){
System.out.println("Awesome your grade is Outstanding");
}
}
}