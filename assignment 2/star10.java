public class star10
{  
public static void main(String[] args)   
{  
int a=64;
for(int i=5;i>=1;i--)
{
for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
for(int k=1;k<=i;k++)
System.out.print((char)(a+k)+" ");
System.out.println();
}}}
