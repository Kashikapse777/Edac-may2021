import java.util.*;
public class binarytoocta
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int d=sc.nextInt();
int b[]=new int[10];

		for(int i=0;i<b.length;i++)
		{
			b[i]=d%8;
			d=d/8;
			while(i>=0)
		{
			System.out.print(+b[i--]+" ");
			--i;
		}
		}
		
		System.out.print("Your octal number is: ");
		
	}
}