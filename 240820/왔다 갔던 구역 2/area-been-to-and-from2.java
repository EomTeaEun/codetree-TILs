import java.util.*;

public class Main {
    public static void main(String[] args) {
       // 여기에 코드를 작성해주세요.

	        Scanner sc = new Scanner(System.in);

	        int offset = 100; //오프셋은 넉넉잡았음
            int a = 0; //좌표 초기값
            

	        int [] arr = new int [201];



	        int n = sc.nextInt();

	        for(int i =0; i<n; i++){
	            int x = sc.nextInt();

	            char dir = sc.next().charAt(0);
	    

	            if(dir == 'R'){

                        
                        for(int j = a+1; j<=a+x; j++ ){ //겹치는 "구간"이니까 for문은 x1부터 x2-1까지
                            arr[j+offset]++; //겹치는 구간 칠하기
                            
                        }

                        a += x; //위치 갱신

                       

                       
	            }

                else{

                    
                        for(int j = a; j>a-x; j-- ){ //offset을 j 범위에 더해주는게 아니라 배열 번호에 더해줘야했음..
                            arr[j+offset]++;
                             
                        }

                        a -= x; //위치 갱신

                    
                        

                        
	            }

                
              

	        }




            int cnt = 0; //겹치는 구간 수

            for(int k =0; k<201; k++){

                if(arr[k]>=2){
                    cnt++;
                }

            }

            System.out.println(cnt);
        }
    }