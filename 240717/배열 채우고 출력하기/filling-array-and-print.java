import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner (System.in);

        String[] s = new int [10];

        for(int i = 0; i<=10; i++){
            s[i] = sc.nextInt();
        }

        for(int i = 0; i<=10; i++){
           System.out.print(arr[9 - i] + " ");
        }
    }
}