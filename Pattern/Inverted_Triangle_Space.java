package Pattern;

public class Inverted_Triangle_Space 
{
	public void Invertedtriangle(int n) 
	{
		int space = (n*2)-2;
				
		for(int i=1;i<=n;i++)
		{			
			// loop for printing left triangle *
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			// loop for printing inverted triangle spaces 
			
			// if we use (n*2)-2 instead of spaces variable then pattern will be disturbed			
			for(int i1=1;i1<=space;i1++)   
			{
				System.out.print(" ");
			}
			
			// loop for printing right side triangle 
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			space = space-2;
			System.out.println();
		}
	}

}
