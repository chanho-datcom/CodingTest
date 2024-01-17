package stringPractice;

import java.util.Scanner;

public class Test_7_PalindromeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strLastIndex = str.length()-1;
        String[] strArray = str.split("");
        String answer = "NO";
        for(int i=0;i<str.length();i++){
            if(!strArray[i].equalsIgnoreCase(strArray[strLastIndex])){
               answer = "NO";
               break;
            }else{
                answer = "YES";
            }

            if(i>strLastIndex || i==strLastIndex){
                break;
            }
            strLastIndex--;
        }
        System.out.println(answer);
    }
}
