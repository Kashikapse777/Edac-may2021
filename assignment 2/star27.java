public class star27
{  
public static void main(String[] args)   
{  
for(int i=1;i<=5;i++)
{
for(int j=4;j>=i;j--) 
    {   System.out.print(" ");
    } 
     for (int k=1; k<=i; k++)
    { System.out.print("*");
     }
       for (int l=1; l<i; l++)
        System.out.print("*");
       System.out.println();
   }

     for (int p=2; p<=5; p++)
    {
     for(int m=1;m<p;m++) 
    {   System.out.print(" ");
    } 
     for (int n=5; n>=p; n--)
    { System.out.print("*");
     }
       for (int o=4; o>=p; o--)
       System.out.print("*");
     System.out.println();

}

}
}