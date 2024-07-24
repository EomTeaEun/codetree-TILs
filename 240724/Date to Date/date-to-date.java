import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int month1 =sc.nextInt();
        int day1 =sc.nextInt();

        int cnt = 1;

        int month2 =sc.nextInt();
        int day2 =sc.nextInt();

        int[] num = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while(true){
            if(month1 == month2 && day1==day2){
                break;
            }

            cnt++;
            day1++;

            if(day1 > num[month1]){
                month1++;
                day1 = 1;
            }




        }

        System.out.print(cnt);
    }
}