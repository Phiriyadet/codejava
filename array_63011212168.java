import java.util.Scanner;
public class array_63011212168 {
    public static void main(String[] args) {
        int m,n,i,j;
        Scanner xx=new Scanner(System.in);
        System.out.print("M:");
        m=xx.nextInt();
        System.out.print("N:");
        n=xx.nextInt();
        int [][]A=new int[m][n];
        double[][]B=new double[m][n];
       
        for( i=0;i<m;i++)
        {
            for( j=0;j<n;j++)
            {A[i][j]=(int)(Math.random()*4)+2;}
        }
        System.out.print("A:---------------");
        for( i=0;i<m;i++)
        {
            System.out.print("\n");
            for( j=0;j<n;j++)
            {System.out.print(A[i][j]+"\t");}
        }
        System.out.print("\nB:---------------\n");
        for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0&&(j==0||j==n-1))
				{
					if(j==0)
					{
						B[i][j] = (A[i][j]+A[i+1][j+1]+A[i][j+1]+A[i+1][j])/4.0;//มุมบนซ้าย
					}
					else
					{
						B[i][j] = (A[i][j]+A[i+1][j-1]+A[i][j-1]+A[i+1][j])/4.0;//มุมบนขวา
					}
				}
				else if(i==m-1&&(j==0||j==n-1))
				{
					if(j==0)
					{
						B[i][j] = (A[i][j]+A[i-1][j+1]+A[i-1][j]+A[i][j+1])/4.0;//มุมล่างซ้าย
					}
					else
					{
						B[i][j] = (A[i][j]+A[i-1][j-1]+A[i-1][j]+A[i][j-1])/4.0;//มุมล่างขวา
					}
				}
				else if(i==0&&(j>0&&j<n-1))
				{
					B[i][j] = (A[i][j]+A[i][j-1]+A[i+1][j-1]+A[i+1][j]+A[i+1][j+1]+A[i][j+1])/6.0;//บนกลาง
				}
				else if(i==m-1&&(j>0&&j<n-1))
				{
					B[i][j] = (A[i][j]+A[i-1][j-1]+A[i-1][j]+A[i-1][j+1]+A[i][j-1]+A[i][j+1])/6.0;//ล่างกลาง
				}
				else if(j==0&&(i>0&&i<m-1))
				{
					B[i][j] = (A[i][j]+A[i-1][j]+A[i+1][j]+A[i+1][j+1]+A[i-1][j+1]+A[i][j+1])/6.0;//ซ้ายกลาง
				}
				else if(j==n-1&&(i>0&&i<m-1))
				{
					B[i][j] = (A[i][j]+A[i-1][j]+A[i-1][j-1]+A[i][j-1]+A[i+1][j-1]+A[i+1][j])/6.0;//ขวากลาง
				}
				else 
				{
					B[i][j] = (A[i][j]+A[i-1][j-1]+A[i-1][j+1]+A[i+1][j-1]+A[i+1][j+1]+A[i-1][j]+A[i][j+1]+A[i][j-1]+A[i+1][j])/9.0;//กึ่งกลาง
				}
				
				System.out.print(B[i][j]+"\t");
			}
			System.out.println();


        
    }
    
}
}
