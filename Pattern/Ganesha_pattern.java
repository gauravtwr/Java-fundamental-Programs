package Pattern;

public class Ganesha_pattern {

	public void ganesha(int n) 
	{
		
		
		// first component
		
		System.out.print("*");
		for(int i=1;i<=(n-3)/2;i++) 
		{
			System.out.print(" ");
		}
		for(int i=1;i<=(n+1)/2;i++) 
		{
			System.out.print("*");
		}
						
		System.out.println();
		
		// second component
		
		//first star
		for(int row=1;row<=(n-3)/2;row++) 
		{
			System.out.print("*");
		// Spaces 
			for(int i=1;i<=(n-3)/2;i++) 
			{
				System.out.print(" ");
			}
		// last star
			System.out.println("*");
		}
		
		 //third component
		for(int i=1;i<=n;i++) 
		{
			System.out.print("*");
		}
		
		System.out.println();
		
		//fourth component
		
		for(int row=1;row<=(n-3)/2;row++) 
		{
			
			// spaces 
			for(int i=1;i<=(n-1)/2;i++) 
			{
				System.out.print(" ");
			}
			
			// stars
			System.out.print("*");
			
			// spaces 
			
			for(int row1=1;row1<=(n-3)/2;row1++) 
			{
				System.out.print(" ");
			}
			
			// stars
			System.out.println("*");
		}	
		//fifth component
		
		for(int i=1;i<=(n+1)/2;i++) 
		{
			System.out.print("*");
		}
		for(int i=1;i<=(n-3)/2;i++) 
		{
			System.out.print(" ");
		}
		System.out.println("*");
				
	}

}
