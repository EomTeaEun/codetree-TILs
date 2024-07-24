import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int offset = 100;
        int [] arr = new int[201];

       for(int i =0; i<n; i++){
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int j=a+offset; j<=b+offset; j++){

            arr[j]++;

        }

        }

        int max = 0;

        for(int i = 0; i<201; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.print(max);


    }
}