import java.util.*;
class binarytodecimal
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary digit");
		int a=sc.nextInt();
		int temp,decimal=0,i=0,conv;
		while(a>0)
		{
			temp=a%10;
			a=a/10;
			conv=(int)(Math.pow(2,i));
			decimal=decimal+(temp*conv);
			i++;
		}
		System.out.print("b to d: "+decimal);
	}
} 