import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        int cnt = 0;

        n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0)
                continue;
            cnt++;
        }

        // 출력
        System.out.print(cnt);
    }
}