import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Find f = new Find();

        f.find(n,m);

        

        


    }

    
}

class Find {

    void find(int n, int m){
        int value= 1;

        for (int i = 1; i<Math.max(n,m);i++){
            if (n%i==0 && m%i==0){
                value= value* i;


            }

            
        }
        System.out.print(value);
    }

}