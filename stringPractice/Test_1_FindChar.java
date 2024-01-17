package stringPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Test_1_FindChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringForFind =  sc.nextLine();
        String c = sc.next();
        if(c.length()>1){
            throw new RuntimeException();
        }
        long matchCount  = Arrays.asList(stringForFind.split("")).stream().filter(s-> s.equalsIgnoreCase(c)).count();
        System.out.println(matchCount);
    }
}
