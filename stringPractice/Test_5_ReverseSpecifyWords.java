package stringPractice;

import java.util.*;

public class Test_5_ReverseSpecifyWords {
    public static String solution(String str){
        String answer;
        char[] c = str.toCharArray();
        int lt=0;
        int rt = c.length-1;

        while(lt<rt){
            if(!Character.isAlphabetic(c[lt])){
                lt++;
            }else if(!Character.isAlphabetic(c[rt])){
                rt--;
            }else{
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));


    }
}
