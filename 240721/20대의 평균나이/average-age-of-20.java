import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = 0;
        double b = 0;
        double cnt = 0;
        
        while(true) 
        {
            int w = sc.nextInt();

            if((w/10)>2)
            {
                break;
            }
            
            a += w ;
            cnt ++ ;
        }

        b = a/ cnt;

        System.out.printf("%.2f",b);

    }
}