public class americanflag
{
public static void main (String args[ ])
{
    for(int i=1;i<=9;i++)
       {
           for(int j=1;j<=6;j++)
	{
	  if(i%2!=0)
	{ 
	   System.out.print("* ");
	}
               }
	for(int j=1;j<=5;j++)	
 	{
	 if(i%2==0)
	{
		if(i==2&j==5||i==4&j==5||i==6&j==5||i==8&j==5)
		{
		  System.out.print(" *  ");
		}
		else
		{
		System.out.print(" *");
		}

	}
	}
           for(int j=1;j<=34;j++)
      {
         System.out.print("=");
      } 
  System.out.println();
  }
{for(int i=1;i<=6;i++)
	{
		for(int j=1;j<=46;j++)
		{
			System.out.print("=");
		}

System.out.println();
}
}
}
}