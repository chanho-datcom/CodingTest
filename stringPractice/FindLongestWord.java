package stringPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindLongestWord {
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
        FindLongestWord findLongestWord = new FindLongestWord();
        Scanner sc = new Scanner(System.in);
        String centence = sc.nextLine();
        String[] stringArray = centence.split(" ");
        System.out.println(findLongestWord.solution(stringArray));
    }
}
