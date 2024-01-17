package stringPractice;

import java.util.*;

public class Test_6_RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        List<Character> characters = new ArrayList<>();
        for(char c : charArray){
            if(!characters.contains(c)){
                characters.add(c);
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
