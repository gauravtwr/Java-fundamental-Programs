package Pattern;

public class Pyramid_Pattern 
{
	
	public void Pyramid(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
			System.out.print(" ");
			}
			
			for(int i1=1;i1<=(i*2-1);i1++)
			{
				System.out.print("*");
			}
			System.out.println();		
		}
	}
	
}
