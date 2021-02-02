import java.util.Scanner;
public class CRTX {
    
    
    public static void main(String[] args) {
        char ch;
        String st; 
        Scanner xx=new Scanner(System.in);
        System.out.println("Menu: ");
        ch=xx.next().charAt(0);
            
        
          
             for(;;){
                 
              
              if(ch=='c')
              {st="Circle";
              System.out.println(st);}
              else if(ch=='r')
              {st="rtyyth";
              System.out.println(st);}
              else if(ch=='t')
              {st="triangle";
              System.out.println(st);}
              else if(ch=='x')
              {st="exit";
              System.out.println(st); break;}
              
              
              System.out.println("Menu: ");
              ch=xx.next().charAt(0);
            
             }
              
          
        
    }
}    
     
    
        
       



