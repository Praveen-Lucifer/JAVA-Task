import java.util.Scanner;

public class StarPrymid {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number of rows: ");
int a = sc.nextInt();

int b = a + 1;

for (int i = 1; i <= a; i++) {
for (int j = 1; j <= b - i; j++) {
System.out.print("  ");
}
for (int j = 1; j <= i; j++) {
System.out.print("  *  ");
}
	     
System.out.println();
}
}
}
