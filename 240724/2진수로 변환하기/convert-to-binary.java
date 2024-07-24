import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = "";

        int r = 0;


        while(n>=1){

            r = n%2;
           
            s=r+s;

            n = n/2;

        }

        System.out.print(s);

    }
}