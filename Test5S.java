import java.util.Scanner;
class Test5S 
{
	public static void main(String[] args) 
	{
		int m,n,mu=1,i,mn;
		Scanner sc=new Scanner(System.in);
		System.out.print("M:");
		m = sc.nextInt();
		System.out.print("N:");
		n = sc.nextInt();
        mn=m;
		for (i=m-1;i>=n;i--)
		{
            mu=mn*i;
			System.out.println(mn+"x"+i+"="+mu);
			mn=mu;
		}
	}

	private static int extracted(Scanner sc) {
		int m;
		m=sc.nextInt();
		return m;
	}
}