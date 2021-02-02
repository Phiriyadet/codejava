import java.util.Scanner;
class Test6 
{
	public static void main (String[] args) 
	{
		int i,j,m;
	    int k=1;
		for (i=k;i<=3;i++)
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.print("M:");
			m=sc.nextInt();

			for(j=k;j<=m;j++)
			{
				System.out.println("*");
			}
			System.out.println("\t");
		}
	}

	
}
