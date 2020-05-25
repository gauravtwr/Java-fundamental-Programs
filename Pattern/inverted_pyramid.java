package Pattern;

public class inverted_pyramid 
{
	public void Invertedpyramid(int n) 
	{
		int space = (n*2)-1;
		
		for(int i=1;i<=n;i++)
		{			
			// loop for printing left triangle *
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
		
		// loop for printing inverted triangle spaces 
		
		// if we use (n*2)-2 instead of spaces variable then pattern will be disturbed			
			for(int i1=1;i1<=space;i1++)   
			{
				System.out.print("*");
			}		
			System.out.println();
			space = space-2;
		}
	
	
	
	}


}
