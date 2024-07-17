import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int a, b;
        int sum = 0;

        a = sc.nextInt();
        b = sc.nextInt();

        if(a<b)
        {for(int i = a; i <= b; i++) {
            if(i % 5 == 0) {
                sum += i;
                
            }
        }}

        if(a>b)
        {for(int i = b; i <= a; i++) {
            if(i % 5 == 0) {
                sum += i;
                
            }
        }}

        

        // 출력
        System.out.print(sum);
    }
}