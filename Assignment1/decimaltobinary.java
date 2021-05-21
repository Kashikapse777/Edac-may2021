import java.util.*;
public class decimaltobinary
{
public static void main(String args[])
{
      int num;
      int arr[]=new int[5];
      Scanner sc=new Scanner(System.in);
       System.out.println("enter number");
        num =sc.nextInt();
        int index=0;
while(num>0)
	{
		arr[index++]=num%2;
		num=num/2;
	}
	for(int i=index-1;i>=0;i--)
	{
	System.out.print(arr[i]);
	}
}
}
