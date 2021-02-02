import java.util.Scanner;
public class arrayd {
    public static void main(String[] args) {
		int n=4,k=3;
        int x[][]=new int[n][k];
       /* x[0][0]=7;  x[0][1]=3;  x[0][2]=6;
        x[1][0]=9;  x[1][1]=15; x[1][2]=10;
        x[2][0]=20; x[2][1]=6;  x[2][2]=31;
        x[3][0]=4;  x[3][1]=21; x[3][2]=53;*/
		
        for(int i=0;i<n;i++){
            System.out.print("\n");
           for(int j=0;j<k;j++){
               System.out.print("Input:\t");
               Scanner xx=new Scanner(System.in);
               x[i][j]=xx.nextInt();}
           }
        for(int w=0;w<n;w++){
            System.out.print("\n");
           for(int z=0;z<k;z++){
               System.out.print(x[w][z]+"\t");}
        }
        
    }
    
}
