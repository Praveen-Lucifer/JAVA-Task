import java.util.Scanner;

class ScannerExample{
static int a=10;
public static void main(String args[]){

//ScannerExample se=new ScannerExample();
//System.out.println(se.a);
System.out.println(a);

Scanner sc = new Scanner(System.in);


System.out.println("Enter your name:");
String name = sc.nextLine();
System.out.println("Your name is " + name);

System.out.println("Enter your Integer:");
int number = sc.nextInt();
System.out.println("Your Integer is " + number);

System.out.println("Enter your Float Integer:");
float decimal = sc.nextFloat();
System.out.println("Your Decimal number is " + decimal);

System.out.println("Enter your Double Integer:");
double maxdecimal = sc.nextDouble();
System.out.println("Your Double Integer is " + maxdecimal);

System.out.println("Enter your Boolean value:");
boolean value = sc.nextBoolean();
System.out.println("Your Value is " + value);

System.out.println("Enter your Long Integer:");
long length = sc.nextLong();
System.out.println("Your Long Length is " + length);

System.out.println("Enter your Short Integer:");
short minlength = sc.nextShort();
System.out.println("Your Short Length is " + minlength);

System.out.println("Enter your Byte Value:");
byte bit = sc.nextByte();
System.out.println("Your Byte Value is " + bit);

System.out.println("Enter your Character:");
char character = sc.next().charAt(0);
System.out.println("Your Character is " + character);
}
} 