package stringPractice;

import java.util.Scanner;

public class Test_2_CaseConverter {

    public String solution(String anyCaseString){
        String answer = "";
        for(char s : anyCaseString.toCharArray()){
            answer += Character.isLowerCase(s) ? Character.toUpperCase(s) : Character.toLowerCase(s);
        }
        return answer;
    }
    public static void main(String[] args) {
        Test_2_CaseConverter test2CaseConverter = new Test_2_CaseConverter();
        Scanner sc = new Scanner(System.in);
        String anyCaseString = sc.next();
        System.out.println(test2CaseConverter.solution(anyCaseString));
    }
}
