import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();
        int a = 1;

        for (int i = 0; i<N; i++){
            for (int j=0; j<N;j++){
                System.out.print(a+" ");
                a++;

                if(a>9){
                    a=1;
                }
            
            }
            System.out.println();
        }

    }
}