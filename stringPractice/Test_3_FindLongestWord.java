package stringPractice;

import java.util.Scanner;

public class Test_3_FindLongestWord {
    public String solution(String[] strArr){
        int len = 0;
        String answer = "";
        for(String word : strArr){
            if(word.length()>len){
                answer = word;
                len = word.length();
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        Test_3_FindLongestWord test3FindLongestWord = new Test_3_FindLongestWord();
        Scanner sc = new Scanner(System.in);
        String centence = sc.nextLine();
        String[] stringArray = centence.split(" ");
        System.out.println(test3FindLongestWord.solution(stringArray));
    }
}
