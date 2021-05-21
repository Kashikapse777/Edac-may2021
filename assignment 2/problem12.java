import java.util.Scanner;
public class problem12
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter three numbers");
float a=sc.nextFloat();
float b=sc.nextFloat();
float c=sc.nextFloat();
float average=(a+b+c)/3;
System.out.println(average);
}
}