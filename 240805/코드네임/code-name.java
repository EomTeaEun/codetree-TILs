import java.util.Scanner;

// User 정보를 나타내는 클래스 선언
class User {
    char codeName;
    int score;

    public User(){
        this.codeName = ' ';
        this.score = 0;
    }

    public User(char codeName, int score){
        this.codeName = codeName;
        this.score = score;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력

        char cName = ' ';
        int score2 = 0;


        int n = 5;
        User[] users = new User[n];
        for(int i = 0; i < n; i++) {

            

            cName = sc.next().charAt(0);
            score2 = sc.nextInt();
            
            // 객체 생성 및 리스트에 추가
            users[i] = new User(cName, score2); 
        }
        
        // 최소 점수를 갖는 요원 찾기
        //여기서 score 대신 score2 를 쓰면 오류가 남(User 클래스에 sore2가 없으니까..)
        int minIdx = 0;
        for(int i = 1; i < n; i++) {
            if(users[minIdx].score > users[i].score)
                minIdx = i;
        }

        // 결과를 출력합니다.
        System.out.println(users[minIdx].codeName + " " + users[minIdx].score);
    }
}