import java.util.Scanner;
public class Greatest
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number :");
int x = sc.nextInt();
System.out.println("Enter second number :");
int y = sc.nextInt();
System.out.println("Enter third number :");
int z = sc.nextInt();

if(x<y && y<z)
{
System.out.print("Increasing order ");
}
else if(x>y && y>z)
{
System.out.print("Dereasing order ");
}
else
{
System.out.print("Neither Increasing order or Dereasing order ");
}
}
}
