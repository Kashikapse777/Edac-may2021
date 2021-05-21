public class javaprint
{
    public static void main(String args[])
{   
  for(int i=1;i<=4;i++)
         {
             	for(int j=1;j<=4;j++)
                   {
		if(i==1&j==4||i==2&j==4||i==3&j==1||i==3&j==4||i==4&j==2||i==4&j==3)
	  	{
  	     		System.out.print("j");
 	 	 }
		else
	 	{
                        		System.out.print(" ");
 		 }
                      }        

	for(int j=1;j<=7;j++)
	{
		if(i==1&j==4||i==2&j==3||i==2&j==5||i==3&j==2||i==3&j==3||i==3&j==4||i==3&j==5||i==3&j==6||i==4&j==1||i==4&j==7)
			{
				System.out.print("a");
			}
		else
			{
				System.out.print(" ");
			}
	}
                  
        for(int j=1;j<=7;j++)
      {
	if(i==1&j==1||i==1&j==7||i==2&j==2||i==2&j==6||i==3&j==3||i==3&j==5||i==4&j==4)
	{
	   System.out.print("V");
	}
                 else
	{
	   System.out.print(" ");	
	}  
       }
	for(int j=1;j<=7;j++)
	{
		if(i==1&j==4||i==2&j==3||i==2&j==5||i==3&j==2||i==3&j==3||i==3&j==4||i==3&j==5||i==3&j==6||i==4&j==1||i==4&j==7)
			{
				System.out.print("a");
			}
		else
			{
				System.out.print(" ");
			}
	}
System.out.println();
}

}}


























	
	

