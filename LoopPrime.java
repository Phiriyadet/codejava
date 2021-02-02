import java.util.Scanner;
public class LoopPrime {
    public static void main(String[] args) {
        int n,k,i,j;
        Scanner xx=new Scanner(System.in);
        System.out.print("N:");
        n=xx.nextInt();
        for(i=2;i<=n;i++){//ลูปใหญ่ใช้ค่า เอ็น
           k=1;
           for(j=2;j<i;j++)//ลูปเล็กตรวจค่า ไอ
           {
               if(i % j == 0)//ถ้าหารลงตัวแสดงว่าไม่ใช่จำนวนเฉพาะ
               k=0;
           }
           if(k==1)
           System.out.print("\t"+i);
        }
        
    }
    
}
