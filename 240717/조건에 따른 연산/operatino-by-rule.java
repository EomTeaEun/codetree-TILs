import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int n = sc.nextInt();
        int cnt = 0;

        while(true) {
            
            if(n == 1)
                break;
            
            if(n % 2 == 1)
                n = 2 * n + 2;
            else{
                n = n * 3 + 1;}



        cnt++;
        if(n>1000){
            break;
        }    
        
        
        }

        System.out.println(cnt);
    }
}