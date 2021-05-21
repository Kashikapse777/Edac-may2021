import java.util.*;
class octaltodecimal
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the octal digit");
		int a=sc.nextInt();
		int temp,d=0,i=0,conv;
		while(a>0)
		{
			temp=a%10;
			a=a/10;
			conv=(int)(Math.pow(8,i));
			d=d+(temp*conv);
			
			i++;
			
		}
		System.out.println("o to d: "+d);
	}
}