import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner (System.in);

        String[] s = new String [10];

        for(int i = 0; i<10; i++){
            s[i] = sc.next();
        }

        int sum=s[2]+s[4]+s[9];

           System.out.print(sum);
        
    }
}