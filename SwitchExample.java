import java.util.Scanner;

public class SwitchExample{
public static void main(String arge[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter you Rating for this movie Passengers");
int a = sc.nextInt();

switch(a){
case 1:
System.out.println("Oops Sorry to disappoint you");
break;
case 2:
System.out.println("Thanks Will Try Better Next Time");
break;
case 3:
System.out.println("Will give our best next time");
break;
case 4:
System.out.println("Next will be our best");
break;
case 5:
System.out.println("Will continue the same with plessure");
break;

default:
System.out.println("Enter between 1 to 5 \"Thanks for your Review\"");
}
}
}

