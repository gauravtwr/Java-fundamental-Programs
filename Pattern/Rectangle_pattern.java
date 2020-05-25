package Pattern;

public class Rectangle_pattern 
{
	public void Rectangle(int n) 
	{		
		
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for(int i=1;i<=n-2;i++)
		{
			System.out.print("*");
			for(int j=1;j<=n-2;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}		
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		}		
		System.out.println();		
	}
	
}
