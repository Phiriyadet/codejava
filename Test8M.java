class Test8M 
{
	
	public static void main(String[] args) 
	{
		int x,n=30;
		System.out.println("SUN\tMON\tTUF\tWED\tTHD\tFRI\tSAT");

		for (x=1;x<=n;x++)
		{
			if (x==1)
			{
				System.out.print("\t\t\t\t");
			}
			else if(x%7==4)
			{
				System.out.print("\n");
			}

			System.out.print(x+"\t");
		}
	}
}