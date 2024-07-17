import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int n;

        n = sc.nextInt();
        
        // 1부터 n까지의 수 중, 온전수를 찾아 출력합니다.
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0 && i % 4 != 0)
                continue;
            if(i/8%2 == 0 )
                continue;
            if(i % 7 < 4)
                continue;
            System.out.print(i + " ");
        }
    }
}