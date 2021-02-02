public class sleep {
    public static void main(String[] args) {

        for(int x=1;x<=30;x++)
        {
            if(x%5==0)
            {continue;}
            System.out.print(x+"\r");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //TODO: handle exception
            }
        }
        
    }
}
