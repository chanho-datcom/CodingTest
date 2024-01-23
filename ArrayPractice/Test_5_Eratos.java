package ArrayPractice;

import java.util.Scanner;

public class Test_5_Eratos {
    private int solution(int n){
        int answer = 0;
        int[] ch = new int[n+1];
        for(int i=2;i<=n;i++){
            if(ch[i]==0){
                answer++;
                for(int j=i;j<=n;j=j+i){
                    ch[j] =1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_5_Eratos main = new Test_5_Eratos();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(main.solution(n));
    }
}
