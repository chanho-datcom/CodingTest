package stringPractice;

import java.util.Scanner;

public class CaseConverter {

    public String solution(String anyCaseString){
        String answer = "";
        for(char s : anyCaseString.toCharArray()){
            answer += Character.isLowerCase(s) ? Character.toUpperCase(s) : Character.toLowerCase(s);
        }
        return answer;
    }
    public static void main(String[] args) {
        CaseConverter caseConverter = new CaseConverter();
        Scanner sc = new Scanner(System.in);
        String anyCaseString = sc.next();
        System.out.println(caseConverter.solution(anyCaseString));
    }
}
