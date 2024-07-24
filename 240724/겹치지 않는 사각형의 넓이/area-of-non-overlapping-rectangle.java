import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int offset = 1000;
        int [][] arr = new int [2001][2001];

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        for(int j=x1;j<x2;j++){
            for(int k=y1;k<y2;k++){
                arr[j+offset][k+offset] =1;
             }
            }

        x1 = sc.nextInt();
         y1 = sc.nextInt();

         x2 = sc.nextInt();
         y2 = sc.nextInt();

        for(int j=x1;j<x2;j++){
            for(int k=y1;k<y2;k++){
                arr[j+offset][k+offset] =1;
             }
            }

        
         x1 = sc.nextInt();
         y1 = sc.nextInt();

         x2 = sc.nextInt();
         y2 = sc.nextInt();

        for(int j=x1;j<x2;j++){
            for(int k=y1;k<y2;k++){
                arr[j+offset][k+offset] =0;
             }
            }

        int cnt = 0;

        for(int i=0; i<2001;i++ ){
            for(int j =0; j<2001;j++){
                cnt += arr[i][j];
            }
        }

        System.out.print(cnt);

        





    }
}