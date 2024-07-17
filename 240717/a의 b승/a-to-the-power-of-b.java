import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
       int a = sc.nextInt();
       int b = sc.nextInt();
       int p = 1;

        // 입력을 받으며 0이상 200이하의 정수들을 선별합니다.
        for(int i = 1; i <= b; i++) {
            p *= a;
        }

        
        System.out.print(p);
    }
}