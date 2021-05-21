import java.util.Scanner;
class problem13
{
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter width:");
double w=sc.nextFloat();
System.out.println("Enter height:");
double h=sc.nextFloat();
double p=2*(w+h);
double a=w*h;
System.out.println("Area is"+w+"*"+h+"="+a);
System.out.println("Perimeter is 2*"+"("+w +"+"+h+")"+"="+p);

}
}