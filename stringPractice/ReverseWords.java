package stringPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class ReverseWords {
    public void solution(String[] strArray){
        for(int i=0;i< strArray.length;i++){
            String[] splitString = strArray[i].split("");
            StringBuilder sb = new StringBuilder();
            for(int k=1;0<=splitString.length-k;k++){
                sb.append(splitString[splitString.length-k]);
            }
            System.out.println(sb);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();

        String[] strArray = new String[n];
        for(int i=0;i<n;i++){
            String str = sc.next();
            strArray[i] = str;
        }
        ReverseWords reverseWords = new ReverseWords();
        reverseWords.solution(strArray);
    }
}
