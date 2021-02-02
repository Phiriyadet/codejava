import java.util.Scanner;
class Test9 
{
            public static void main(String[] args) 
            {
                
                  Scanner scan= new Scanner(System.in);
                  System.out.println("Input number a day:");
                  int d=scan.nextInt();

                  switch(d)
                  {
                     case 1:System.out.println("sun"); break;
                     case 2:System.out.println("mon"); break;
                     case 3:System.out.println("tue"); break;
                     case 4:System.out.println("wed"); break;
                     case 5:System.out.println("thu"); break;
                     case 6:System.out.println("fri"); break;
                     case 7:System.out.println("sat"); break;
                     default:System.out.println("not a day"); break;
                  }
                
            }

            
}
