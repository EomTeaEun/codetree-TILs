import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int sum1= 0;
        int sum2 = 0;
        int cnt = 0;

        int [] arr = new int [10];

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
           
        }

        for (int i = 0; i<10; i++){
            if(i%2 ==1 ){
                sum1 += arr[i];
            }
        }

        for (int i = 0; i<10; i++){
            if((i+1)%3 ==0 && i>1){
                sum2 += arr[i];
                cnt ++;
            }
        }

        double s = (double)sum2/cnt;

        System.out.print(sum1+" ");
        System.out.printf("%.1f",s);

    }
}