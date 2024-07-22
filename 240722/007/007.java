import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sCode;
        String mPoint;
        int time;

        sCode = sc.next();
        mPoint = sc.next();
        time = sc.nextInt();

        Spy sp = new Spy(sCode, mPoint, time);

        System.out.println("secret code : " + sp.a);
        System.out.println("meeting point : " + sp.b);
        System.out.println("time : " + sp.c);
    }
}

class Spy {

    String a; 
    String b; 
    int c;

    public Spy (String a , String b, int c){
        this.a = a ;
        this.b = b ;
        this.c = c;
    }
}