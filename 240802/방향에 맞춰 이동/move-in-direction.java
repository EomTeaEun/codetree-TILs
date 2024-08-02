import java.util.Scanner;

public class Main {
    public static int n, x, y;

    // 동, 서, 남, 북 순으로 dx, dy를 정의합니다.
    public static int[] dx = new int[]{1, -1,  0, 0};
    public static int[] dy = new int[]{0,  0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        n = sc.nextInt();

        // 움직이는 것을 진행합니다.
        while(n-- > 0) {
            char cDir = sc.next().charAt(0); 
            int dist = sc.nextInt();
            
            // 각 방향에 맞는 번호를 붙여줍니다.
            int dir;
            if(cDir == 'E')
                dir = 0;
            else if(cDir == 'W')
                dir = 1;
            else if(cDir == 'S')
                dir = 2;
            else
                dir = 3;
            
            // 주어진 방향대로 dist 거리만큼 이동했을 경우의
            // 위치를 구해줍니다.
            x += dx[dir] * dist;
            y += dy[dir] * dist;
        }
    
        System.out.print(x + " " + y);
    }
}

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int[] dx = new int[]{1,  0, -1, 0};
        int[] dy = new int[]{0, -1,  0, 1};

        int n = sc.nextInt();

        int x=0;
        int y=0;


        for(int i = 0 ; i<n; i++){
            char way = sc.next().charAt(0);;
            int dist = sc.nextInt();

            int dir;
            
            if(way == 'E'){
                dir = 0;
            }

            else if(way == 'W')
                dir = 1;
            else if(way == 'S')
                dir = 2;
            else
                dir = 3;


            x += dx[dir]*dist;
            y += dy[dir]*dist;
        }


System.out.print(x + " " + y);
    }
} */