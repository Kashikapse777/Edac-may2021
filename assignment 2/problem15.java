import java.util.Scanner;
public class problem15
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of a");
int a=sc.nextInt();
System.out.println("Enter value of b");
int b=sc.nextInt();
int temp;
temp=a;
a=b;
b=temp;
System.out.println("Value of a ="+a);
System.out.println("Value of b ="+b);
}
}
