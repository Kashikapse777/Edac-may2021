public class halfpyramid3
{
	public static void main(String args[])
	{
		for(int i=6;i>=1;i--)
		{for(int j=1;j<=i;j++)
			if(i==5&j==2||i==5&j==3||i==5&j==4||i==4&j==2||i==4&j==3||i==3&j==2)
			{
				System.out.print("  ");
			}
		else{
			System.out.print(" "+"*");
		}
		System.out.println();
		}
	}
}
	