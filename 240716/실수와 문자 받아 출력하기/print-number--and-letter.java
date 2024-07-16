import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // 문자열 입력
        double c = sc.nextDouble();
        double d = sc.nextDouble(); // 입력받은 문자열의 첫 번째 문자 추출
        System.out.println(s);
        System.out.printf("%0.2f",c);
        System.out.println();
        System.out.printf("%0.2f",d);
    }
}