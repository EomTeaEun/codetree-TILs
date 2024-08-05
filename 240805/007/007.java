import java.util.Scanner;

class Spy {
    String sccode;
    char mtcode;
    int time;

    public Spy ( String sccode, char mtcode, int time){
        this.sccode = sccode;
        this.mtcode = mtcode;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sCode;
        char mPoint;
        int time;

        sCode = sc.next();
        mPoint = sc.next().charAt(0);
        time = sc.nextInt();
        
        // Spy 객체를 만들어 줍니다.
        Spy sp = new Spy(sCode, mPoint, time);

        // 결과를 출력합니다.
        System.out.println("secret code : " + sp.sccode);
        System.out.println("meeting point : " + sp.mtcode);
        System.out.println("time : " + sp.time);



    }
}