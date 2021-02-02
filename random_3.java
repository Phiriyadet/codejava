public class random_3 {

    public static void main(String[] args) {
        int r,i=0,j=0;
    
        
            for(;;)
            {
            r=(int)(Math.random()*4)+4; //b4-7
            System.out.println(r);

            if(r==5)
            {
                i++;
            }
            j++;//นับก่อนหยุด
            if(i==3)
            {break;}
            
        } 
          System.out.println("RANDOM: "+j);
        }
    
}
