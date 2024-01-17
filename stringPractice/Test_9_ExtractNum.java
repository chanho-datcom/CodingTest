package stringPractice;

import java.util.Scanner;

public class Test_9_ExtractNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String numString = str.replaceAll("[^0-9]", "");

        System.out.println(Integer.parseInt(numString));
    }
}
