import java.util.Arrays;
public class arrayd_3 {
    public static void main(String[] args) {
        int data1[]={4,7,3,1,6,9,8,5,2,99};
        int data2[]=new int[9];
        for(int i=0;i<data2.length;i++)
        {System.out.print(data2[i]+"\t");}
        System.out.println();
        
        System.arraycopy(data1,6,data2,1,4);
        
        for(int j=0;j<data2.length;j++)
        {System.out.print(data2[j]+"\t");}
        System.out.println();

        Arrays.sort(data1);
        for(int r=0;r<data1.length;r++)
        {System.out.print(data1[r]+"\t");}
        System.out.println();

    }
    
}
