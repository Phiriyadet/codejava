import java.util.Scanner;
class MN_X 
{
	public static void main(String[] args) 
	{
		Scanner xx = new Scanner(System.in);
		int j,i;
		int M,N;
		M = xx.nextInt();
		N = xx.nextInt();
		float A[][] = new float[M][N];
		for(i=0;i<M;i++)
		{
			for(j=0;j<N;j++)
			{
				A[i][j] = (int)(Math.random()*4+2);
			}
		}
		for(i=0;i<M;i++)
		{
			for(j=0;j<N;j++)
			{
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("==========================");
		///////=========================
		float B[][] = new float[M][N];	
		for(i=0;i<M;i++)
		{
			for(j=0;j<N;j++)
			{
				if(i==0&&(j==0||j==N-1))
				{
					if(j==0)
					{
						B[i][j] = 0;
					}
					else
					{
						B[i][j] = 1;
					}
				}
				else if(i==M-1&&(j==0||j==N-1))
				{
					if(j==0)
					{
						B[i][j]=2;
					}
					else
					{
						B[i][j] = 3;
					}
				}
				else if(i==0&&(j>0&&j<N-1))
				{
					B[i][j] = 4;
				}
				else if(i==M-1&&(j>0&&j<N-1))
				{
					B[i][j] = 5;
				}
				else if(j==0&&(i>0&&i<M-1))
				{
					B[i][j] = 6;
				}
				else if(j==N-1&&(i>0&&i<M-1))
				{
					B[i][j] = 7;
				}
				else 
				{
					B[i][j] = 8;
				}
				
				System.out.print(B[i][j]+"\t");
			}
			System.out.println();
		}
	}
}