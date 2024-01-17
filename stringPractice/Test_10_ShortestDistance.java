package stringPractice;

import java.util.Scanner;

public class Test_10_ShortestDistance {
    public int[] solution(String str, char t){
        int p = 100;
        int[] answer = new int[str.length()];
        for(int i=0;i<str.length();i++){
            if(t==str.charAt(i)){
                p =0;
            }else{
                p++;
            }
            answer[i] = p;
        }
        p = 100;
        for(int j=str.length()-1;j>=0;j--){
            if(t==str.charAt(j)){
                p=0;
            }else{
                p++;
                answer[j] = Math.min(answer[j], p);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Test_10_ShortestDistance main = new Test_10_ShortestDistance();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);

        for(int x : main.solution(str, t)){
            System.out.print(x + " ");
        }

    }
}
