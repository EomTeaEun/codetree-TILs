import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner (System.in);

        int x =0;
        int y = 0;
        int dir_num = 3; //사분면 화살표, 처음 바라보는 방향을 북쪽으로 !!! 


        // 동, 남, 서, 북 순으로 dx, dy를 정의합니다.
        int[] dx = new int[]{1,  0, -1, 0};
        int[] dy = new int[]{0, -1,  0, 1};

        String dir = sc.next();

        for (int i = 0; i < dir.length(); i++){
            char cdir = dir.charAt(i);

            if(cdir =='L'){
                dir_num = (dir_num-1+4)%4; // +4 %4는 값이 0123에서 머물게 하기 위한 것,,
            }

            else if(cdir =='R'){
                dir_num = (dir_num+1+4)%4;
            }

             else {
                x += dx[dir_num]; //좌표평면 상에서 (1,0)을 더해주는 것 = x축의 방향으로 1칸 이동
                y += dy[dir_num]; //현재 dir_num = 0부터 3까지 순서대로 동남서북을 가리킴.
            }
        }

        
         System.out.print(x + " " + y);

    }
}