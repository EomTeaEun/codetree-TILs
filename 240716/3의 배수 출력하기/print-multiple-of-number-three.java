import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        int n, i = 1;

     
        n = sc.nextInt();
        
        // 출력
        while(i*3 <= n) {
            System.out.print(i*3 + " ");
            i++;
        }
    }
}