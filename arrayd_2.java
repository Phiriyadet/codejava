import java.util.Scanner;
public class arrayd_2 {
    public static void main(String[] args) {
        int n,k; 
        Scanner xx=new Scanner(System.in);
        System.out.println("INPUT n:");
        n=xx.nextInt();
        System.out.println("INPUT n:");
        k=xx.nextInt();
        int x[][]=new int[n][k];
       
        for(int i=0;i<n;i++){
           for(int j=0;j<k;j=+2){
               
              if(i==j)
              {x[i][j]=1;}
               
           }
        for(int w=0;w<n;w++){
            System.out.print("\n");
           for(int z=0;z<k;z++){
               System.out.print(x[w][z]+"\t");
              
               
           }
        }
    }
}
}
       
        
    

    
