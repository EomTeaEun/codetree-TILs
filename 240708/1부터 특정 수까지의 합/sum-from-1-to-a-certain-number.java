import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner (System.in);

        cal c = new cal();

        int n = sc.nextInt();

        c.calculate(n);

        

        
    }
}

class cal {

    public void calculate(int n) {
        
        int result = plus(n);
       
        System.out.println(result/10);
    }


    public int plus (int a) {

        int b = 0;
        for(int i=1; i<=a; i++){
            b += i;
        }


        return b;
    }
}