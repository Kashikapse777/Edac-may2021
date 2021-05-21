import java.util.Scanner;
class problem11
{
public static void main(String args[])
{
System.out.println("enter radius");
 Scanner sc=new Scanner(System.in);
 float r=sc.nextFloat();
 double pi=3.141592653589793238462643;
 double area=pi*r*r;
 double perimeter=2*pi*r;
System.out.println(area);
System.out.println(perimeter);
}
}