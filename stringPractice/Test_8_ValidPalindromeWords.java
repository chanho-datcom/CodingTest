package stringPractice;

import java.util.Scanner;

public class Test_8_ValidPalindromeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String alphabetString = str.replaceAll("[^a-zA-Z]", "");
        int strLastIndex = alphabetString.length()-1;
        String[] strArray = alphabetString.split("");
        String answer = "NO";
        for(int i=0;i<alphabetString.length();i++){
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
